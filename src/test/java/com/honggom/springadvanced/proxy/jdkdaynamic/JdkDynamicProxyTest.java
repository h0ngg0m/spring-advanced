package com.honggom.springadvanced.proxy.jdkdaynamic;

import com.honggom.springadvanced.proxy.jdkdaynamic.code.AImpl;
import com.honggom.springadvanced.proxy.jdkdaynamic.code.AInterface;
import com.honggom.springadvanced.proxy.jdkdaynamic.code.TimeInvocationHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    void dynamicA() {
        AInterface target = new AImpl();

        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        AInterface proxy = (AInterface) Proxy.newProxyInstance(AInterface.class.getClassLoader(), new Class[]{AInterface.class}, handler);

        proxy.call();
        log.info("target class: {}", target.getClass());
        log.info("proxy class: {}", proxy.getClass());
    }

}
