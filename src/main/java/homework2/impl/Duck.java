package homework2.impl;

import homework2.*;
import homework2.Runnable;

public class Duck extends Animal implements Runnable, Swimmable, Soundable, Flyable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public int getFlyingSpeed() {
        return 10;
    }

    @Override
    public int getRunningSpeed() {
        return 5;
    }

    @Override
    public void makingSound() {
        System.out.println("Кря!");
    }

    @Override
    public int getSwimmingSpeed() {
        return 7;
    }
}
