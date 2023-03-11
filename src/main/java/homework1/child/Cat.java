package homework1.child;

import homework1.parent.Animal;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    @Override
    public void swim() {}

    @Override
    public void fly() {}
}
