package com.code.camp.veera.abstractFactory.pattern;

//this is factory of factory which gives you factory instance which will in turn give you required object
public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(boolean isTrainee) {
        if (isTrainee) {
            return new TraineeProfessionAbstractFactory();
        } else {
            return new ProfessionAbstractFactory();
        }
    }
}
