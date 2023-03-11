package homework1.child;

import homework1.parent.Animal;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кря!");
    }


}
