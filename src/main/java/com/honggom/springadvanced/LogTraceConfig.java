package com.honggom.springadvanced;

import com.honggom.springadvanced.trace.logtrace.FieldLogTrace;
import com.honggom.springadvanced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}