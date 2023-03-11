package homework1.child;

import homework1.parent.Animal;

public class Penguin extends Animal {
    public Penguin(String name, String color) {
        super(name, color,2);
    }

    public Penguin(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("*звуки прингвинов*");
    }

    @Override
    public void fly() {
        System.out.println("А жаль пингвины не летают");
    }
}
