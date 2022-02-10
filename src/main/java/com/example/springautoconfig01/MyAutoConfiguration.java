package com.example.springautoconfig01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyServiceProperties.class)
@Slf4j
public class MyAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(MyStarterServiceV1.class)
    @ConditionalOnProperty(prefix = "spring101", name = "version", havingValue = "v1", matchIfMissing = true)
    MyStarterServiceV1 getMyV1Service() {
        return new MyStarterServiceV1("MyStarterServiceV1");
    }
    @Bean
    @ConditionalOnMissingBean(MyStarterServiceV2.class)
    @ConditionalOnProperty(prefix = "spring101", name = "version", havingValue = "v2")
    MyStarterServiceV2 getMyV2Service() {
        return new MyStarterServiceV2("MyStarterServiceV2");
    }

}
