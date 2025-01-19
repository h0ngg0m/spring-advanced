package com.honggom.springadvanced.trace.template;

import com.honggom.springadvanced.trace.TraceStatus;
import com.honggom.springadvanced.trace.logtrace.LogTrace;

public abstract class AbstractTemplate<T> {

    private final LogTrace trace;

    public AbstractTemplate(LogTrace trace) {
        this.trace = trace;
    }

    public T execute(String message) {
        TraceStatus status = null;
        try {
            status = trace.begin(message);
            T result = call();
            trace.end(status);
            return result;
        } catch (RuntimeException e) {
            trace.exception(status, e);
            throw e;
        }
    }

    protected abstract T call();
}