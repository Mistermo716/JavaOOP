package com.company;

public class Car {
    //private can only be accessed with setter or getter
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //method is publicly accessible. void not returning anything
    public void setModel(String model){
        //this.model is the field in the class
        //model is the parameter passed into the method.
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
}
