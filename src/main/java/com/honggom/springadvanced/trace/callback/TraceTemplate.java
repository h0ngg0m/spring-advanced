package com.honggom.springadvanced.trace.callback;

import com.honggom.springadvanced.trace.TraceStatus;
import com.honggom.springadvanced.trace.logtrace.LogTrace;

public class TraceTemplate {

    private final LogTrace trace;

    public TraceTemplate(LogTrace trace) {
        this.trace = trace;
    }

    public <T> T execute(String message, TraceCallback<T> callback) {
        TraceStatus status = null;
        try {
            status = trace.begin(message);
            T result = callback.call();
            trace.end(status);
            return result;
        } catch (RuntimeException e) {
            trace.exception(status, e);
            throw e;
        }
    }
}
