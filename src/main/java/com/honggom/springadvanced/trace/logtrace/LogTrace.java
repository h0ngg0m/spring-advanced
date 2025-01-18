package com.honggom.springadvanced.trace.logtrace;

import com.honggom.springadvanced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
