package com.honggom.springadvanced.proxy.pureproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheProxy implements Subject {

    private final Subject target;
    private String cache;

    public CacheProxy(RealSubject realSubject) {
        this.target = realSubject;
    }

    @Override
    public String operation() {
        log.info("캐시 프록시 호출");
        if (cache == null) {
            cache = target.operation();
        }
        return cache;
    }
}
