package com.obs.bean;

import io.opentracing.Tracer;
import io.opentracing.noop.NoopTracerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnProperty(value = "opentracing.jaeger.enabled", havingValue = "false", matchIfMissing = false)
@Configuration
public class TracingConfig {

    @Bean
    public Tracer jaegerNoopTracer() {
        return NoopTracerFactory.create();
    }
}
