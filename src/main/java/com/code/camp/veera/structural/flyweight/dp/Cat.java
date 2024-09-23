package com.code.camp.veera.structural.flyweight.dp;

public class Cat implements Animal {

    private String name = null;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAnimalAttributes() {
        System.out.println("Name of the animal is: " + this.name);
        System.out.println("Number of eyes of the animal is: " + CommonSharableClass.eyes);
        System.out.println("Number of legs of the animal is: " + CommonSharableClass.legs);
        System.out.println("Number of nose of the animal is: " + CommonSharableClass.nose);
        System.out.println("Number of tail of the animal is: " + CommonSharableClass.tail);

    }
}
