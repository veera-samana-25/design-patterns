package com.code.camp.veera.structural.proxy.dp;

public class RealSubjectClass implements Subject {


    @Override
    public void method() {
        System.out.println("I am an actual implementation of subject, rest all are the proxies :D");
    }
}
