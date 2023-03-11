package homework1.child;

import homework1.parent.Animal;

public class Raven extends Animal {
    public Raven(String name, String color) {
        super(name, color,4);
    }

    public Raven(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кар!");
    }

    @Override
    public void toGo() {}

    @Override
    public void swim() {}
}
