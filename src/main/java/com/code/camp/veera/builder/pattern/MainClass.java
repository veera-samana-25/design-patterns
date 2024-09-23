package com.code.camp.veera.builder.pattern;

public class MainClass {
    public static void main(String[] args) {

        //create object of required home builder
        EarthQuakeResistanceBuilder earthQuakeResistanceBuilder = new EarthQuakeResistanceBuilder();

        FloodResistanceBuilder floodResistanceBuilder = new FloodResistanceBuilder();

        //create object of director that will keep an eye on your builder
        Director director = new Director(earthQuakeResistanceBuilder);

        Director director1 = new Director(floodResistanceBuilder);

        director.manageRequiredHomeConstruction();
        Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
        System.out.println(homeConstructedAtTheEnd);
        System.out.println(homeConstructedAtTheEnd.floor);
    }
}
