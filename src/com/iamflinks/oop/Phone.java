package com.iamflinks.oop;

public class Phone {
    private String name;
    private int screenSize;
    private int memoryRAM;
    private int camera;

    public Phone(String name, int screenSize, int memoryRAM, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRAM = memoryRAM;
        this.camera = camera;
    }

    public void playMusic(String trackName) {
        System.out.println("Playing " + trackName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
