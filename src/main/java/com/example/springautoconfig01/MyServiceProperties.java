package com.example.springautoconfig01;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring101")
@Data
public class MyServiceProperties {
    private String name;
    private Integer age;
    private String version;
}
