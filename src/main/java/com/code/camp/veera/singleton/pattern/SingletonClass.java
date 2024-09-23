package com.code.camp.veera.singleton.pattern;

public class SingletonClass {

    private static SingletonClass singleton_instance = new SingletonClass();

    private SingletonClass() {
    }

    //get the only object available
    public static SingletonClass getInstance() {
        return singleton_instance;
    }

    public void simpleMethod() {
        System.out.println("hashcode of singleton object :" + singleton_instance);
    }
}
