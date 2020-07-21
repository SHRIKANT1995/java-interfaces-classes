package com.shrikant;

public class Snake implements Speices {
    @Override
    public void alive() {
        System.out.println("ALIVE");

    }

    @Override
    public void nonliving() {
        System.out.println("LIVING in WILD");

    }

    @Override
    public void pet() {
        System.out.println("Should not!!Poisonous");

    }

    @Override
    public void reptile() {
        System.out.println("YES Reptile");

    }
}
