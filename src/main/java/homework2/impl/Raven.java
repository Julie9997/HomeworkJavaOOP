package homework2.impl;


import homework2.Animal;
import homework2.Flyable;
import homework2.Soundable;

public class Raven extends Animal implements Flyable, Soundable {
    public Raven(String name, String color) {
        super(name, color,4);
    }

    public Raven(String name) {
        this(name, null);
    }

    @Override
    public int getFlyingSpeed() {
        return 12;
    }

    @Override
    public void makingSound() {
        System.out.println("Кар!");
    }
}
