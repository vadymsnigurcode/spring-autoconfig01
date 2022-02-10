package com.example.springautoconfig01;

public class MyStarterServiceV2 extends AbstractMyService{
    public MyStarterServiceV2(String myStarterServiceV2) {
        System.out.println(myStarterServiceV2);
    }
    public String hello() {
        System.out.println("hello2");
        return "Hello2";
    }
}
