package com.code.camp.veera.builder.pattern;

public class Director {

    private Builder builder;

    public Director(Builder builderType) {
        this.builder = builderType;

    }

    public Home getComplexObjectOfHome() {
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHomeConstruction() {
        this.builder.buildFloor();
        this.builder.buildWalls();
        this.builder.buildTerrace();
    }

}
