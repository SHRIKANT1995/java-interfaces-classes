package com.shrikant;

public class Cat implements Speices {
    @Override
    public void alive() {
        System.out.println("ALIVE");

    }

    @Override
    public void nonliving() {
        System.out.println("LIVING ");

    }

    @Override
    public void pet() {
        System.out.println("YES");

    }

    @Override
    public void reptile() {
        System.out.println("nahhhh");

    }
}
