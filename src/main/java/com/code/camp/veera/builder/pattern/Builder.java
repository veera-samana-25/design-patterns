package com.code.camp.veera.builder.pattern;

public interface Builder {

    public void buildFloor();

    public void buildWalls();

    public void buildTerrace();

    public Home getComplexHomeObject();
}
