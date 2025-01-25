package com.honggom.springadvanced.proxy.jdkdaynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AImpl implements AInterface {
    @Override
    public String call() {
        log.info("AImpl.call");
        return "a";
    }
}
