package homework2.impl;

import homework2.Animal;
import homework2.Runnable;
import homework2.Soundable;

public class Cat extends Animal implements Runnable, Soundable {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void makingSound() {
        System.out.println("Мяу!");
    }

    @Override
    public int getRunningSpeed() {
        return 7;
    }
}
