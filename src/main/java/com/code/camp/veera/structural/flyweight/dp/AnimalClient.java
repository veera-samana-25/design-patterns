package com.code.camp.veera.structural.flyweight.dp;

public class AnimalClient {
    public static void main(String[] args) {
        Animal catAnimal = AnimalFactory.getCat("CAT");
        catAnimal.printAnimalAttributes();
        System.out.println(catAnimal.hashCode());

        Animal catAnimal1 = AnimalFactory.getCat("CAT");
        catAnimal1.printAnimalAttributes();
        //hashcode should be same for both cat objects returned by hashmap
        System.out.println(catAnimal1.hashCode());

        Animal cowAnimal = AnimalFactory.getCat("COW");
        cowAnimal.printAnimalAttributes();
        System.out.println(cowAnimal.hashCode());
    }
}
