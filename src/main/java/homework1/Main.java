package homework1;

import homework1.child.*;
import homework1.parent.Animal;
import homework1.child.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Барсик"));
        animals.add(new Dog("Дружок"));
        animals.add(new Raven("Якоб"));
        animals.add(new Duck("Дональд"));
        animals.add(new Penguin("Лоло"));
        animals.add(new Whale("Толкун"));

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }

}