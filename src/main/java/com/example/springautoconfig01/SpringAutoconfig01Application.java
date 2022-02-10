package com.example.springautoconfig01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringAutoconfig01Application {
    @Autowired(required=false)
    private MyServiceProperties myServiceProperties;

    @Autowired(required=false)
    private AbstractMyService myService;

    @PostConstruct
    public void postConstruct() {
        if (myServiceProperties!=null) {
            System.out.println("example service result: "
                    + myServiceProperties.getName());
        }
        System.out.println(myService.hello());
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAutoconfig01Application.class, args);
    }

}
