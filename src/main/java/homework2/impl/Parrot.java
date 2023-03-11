package homework2.impl;

import homework2.Animal;
import homework2.Flyable;
import homework2.Runnable;
import homework2.Speakable;

public class Parrot extends Animal implements Runnable, Flyable, Speakable {
    public Parrot(String name, String color) {
        super(name, color,4);
    }

    public Parrot(String name) {
        this(name, null);
    }

    @Override
    public int getFlyingSpeed() {
        return 10;
    }

    @Override
    public int getRunningSpeed() {
        return 3;
    }

    @Override
    public void speak() {
        System.out.printf("Привет! Меня зовут %s%n", this.getName());
    }
}
