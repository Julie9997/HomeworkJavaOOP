package homework1.child;

import homework1.parent.Animal;

public class Whale extends Animal {
    public Whale(String name, String color) {
        super(name, color, 0);
    }

    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("издает китовьи звуки!");
    }

    @Override
    public void toGo() {}

    @Override
    public void fly() {}
}
