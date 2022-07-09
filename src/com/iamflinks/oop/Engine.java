package com.iamflinks.oop;

public class Engine {
    private String model;
    private int cylinder;
    private int speed;

    public Engine(String model, int cylinder, int speed) {
        this.model = model;
        this.cylinder = cylinder;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
