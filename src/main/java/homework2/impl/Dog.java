package homework2.impl;

import homework2.Animal;
import homework2.Runnable;
import homework2.Soundable;
import homework2.Swimmable;

public class Dog extends Animal implements Runnable, Swimmable, Soundable {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public int getRunningSpeed() {
        return 10;
    }

    @Override
    public void makingSound() {
        System.out.println("Гав!");
    }

    @Override
    public int getSwimmingSpeed() {
        return 5;
    }
}
