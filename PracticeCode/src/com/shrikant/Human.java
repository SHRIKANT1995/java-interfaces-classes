package com.shrikant;

public class Human implements Speices {
    @Override
    public void alive() {
        System.out.println("ALIVE");

    }

    @Override
    public void nonliving() {
        System.out.println("LIVING");

    }

    @Override
    public void pet() {
        System.out.println("Not required but possible");

    }

    @Override
    public void reptile() {
        System.out.println("Not reptile");

    }
}
