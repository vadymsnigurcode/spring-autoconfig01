package com.example.springautoconfig01;

public class MyStarterServiceV1 extends AbstractMyService {
    public MyStarterServiceV1(String myStarterServiceV1) {
        System.out.println(myStarterServiceV1);
    }
    public String hello() {
        System.out.println("hello2");
        return "Hello2";
    }
}
