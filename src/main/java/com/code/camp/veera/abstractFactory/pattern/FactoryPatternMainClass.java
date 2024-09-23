package com.code.camp.veera.abstractFactory.pattern;

public class FactoryPatternMainClass {

    public static void main(String[] args) {
        //first get factory instance from factory of factory class, if you want trainees.
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession engg = abstractFactory.getProfession("Engineer");
        engg.print();
    }
}
