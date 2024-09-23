package com.code.camp.veera.singleton.pattern;

public class MainClass {
    public static void main(String[] args) {
        SingletonClass singletonObject = SingletonClass.getInstance();
        singletonObject.simpleMethod();

        //it will print the same hashcode value. Because it gets the same object
        SingletonClass singletonObject2 = SingletonClass.getInstance();
        singletonObject.simpleMethod();

    }
}