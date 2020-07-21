package com.shrikant;

public class LivingCreatures {
    public static void main(String[] args){

        LivingCreatures lc = new LivingCreatures();

        Human h = new Human();
        Dog d= new Dog();
        Cat c= new Cat();
        Snake s=  new Snake();

        System.out.println(args[0]);

        if(args[0].equals(h)){
            lc.livingandpet(h);
        }
        if(args[0].equals(d)){
            lc.livingandpet(d);
        }
        if(args[0].equals(c)){
            lc.livingandpet(c);
        }
        if(args[0].equals(s)){
            lc.livingandpet(s);
        }
    }

    public void livingandpet(Speices s){
        s.alive();
        s.nonliving();
        s.pet();
        s.reptile();
    }
}
