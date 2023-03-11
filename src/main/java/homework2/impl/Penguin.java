package homework2.impl;

import homework2.Animal;
import homework2.Runnable;
import homework2.Soundable;
import homework2.Swimmable;

public class Penguin extends Animal implements Runnable, Swimmable, Soundable {
    public Penguin(String name, String color) {
        super(name, color,2);
    }

    public Penguin(String name) {
        this(name, null);
    }

    @Override
    public int getRunningSpeed() {
        return 7;
    }

    @Override
    public void makingSound() {
        System.out.println("*звуки прингвинов*");
    }

    @Override
    public int getSwimmingSpeed() {
        return 10;
    }
}
