package homework1.child;

import homework1.parent.Animal;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Гав!");
    }

    @Override
    public void fly() {}
}
