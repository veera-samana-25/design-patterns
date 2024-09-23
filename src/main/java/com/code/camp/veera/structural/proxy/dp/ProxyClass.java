package com.code.camp.veera.structural.proxy.dp;

public class ProxyClass extends RealSubjectClass {

    @Override
    public void method() {
        System.out.println("Hi, I am proxy, i will perform authentication and security checks");

        //logic to check if user us authentic or not. If yes then call real object method else don't call below method.
        System.out.println("calling real method of real subject implementing class after the call is authenticated");
        super.method();
    }


}
