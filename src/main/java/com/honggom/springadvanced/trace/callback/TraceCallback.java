package com.honggom.springadvanced.trace.callback;

public interface TraceCallback<T> {
    T call();
}
