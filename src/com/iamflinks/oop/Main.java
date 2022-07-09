package com.iamflinks.oop;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 6, 4096, 8);
//        iPhone.setName("iPhone 11");
//        iPhone.setMemoryRAM(4096);
        System.out.println(iPhone.getName());

        iPhone.playMusic("Champion - FireBoyDML");
        iPhone.playMusic("Gbedu - TIBLAZE");

        Dog zeis = new Dog("Zeis", "Brown", 4, true);
        zeis.eat("Corn");
        zeis.bark();
        zeis.bark(zeis.getName());

        // Composition in java

    }
}
