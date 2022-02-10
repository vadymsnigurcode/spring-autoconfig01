package com.example.springautoconfig01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyStarterUseTest implements CommandLineRunner {
    @Autowired
    private AbstractMyService myService;
    @Override
    public void run(String... args) throws Exception {
        log.info(myService.hello());
    }
}
