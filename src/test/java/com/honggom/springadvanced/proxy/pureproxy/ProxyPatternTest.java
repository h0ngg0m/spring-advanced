package com.honggom.springadvanced.proxy.pureproxy;

import com.honggom.springadvanced.proxy.pureproxy.code.CacheProxy;
import com.honggom.springadvanced.proxy.pureproxy.code.ProxyPatternClient;
import com.honggom.springadvanced.proxy.pureproxy.code.RealSubject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    void noProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
    }

    @Test
    void proxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(new CacheProxy(realSubject));
        client.execute();
        client.execute();
        client.execute();
    }
}
