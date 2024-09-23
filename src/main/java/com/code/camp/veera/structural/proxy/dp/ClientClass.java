package com.code.camp.veera.structural.proxy.dp;

public class ClientClass {
    public static void main(String[] args) {
        Subject proxy = new ProxyClass();
        proxy.method();
    }
}
