package homework2.veterenary;


import homework2.*;
import homework2.Runnable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public VetClinic() { this.animals = new ArrayList<>(); }

    public List<Animal> getAnimals() { return animals; }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public List<Animal> getAllAnimals() {
        return this.animals;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> flyable = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable)
                flyable.add((Flyable) animal);
        }
        return flyable;
    }

    public List<Runnable> getRunnable() {
        List<Runnable> runnable = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable)
                runnable.add((Runnable) animal);
        }
        return runnable;
    }

    public List<Swimmable> getSwimmable() {
        List<Swimmable> swimmable = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimmable)
                swimmable.add((Swimmable) animal);
        }
        return swimmable;
    }

    public List<Soundable> getSoundable() {
        List<Soundable> soundable = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Soundable)
                soundable.add((Soundable) animal);
        }
        return soundable;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> speakable = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Speakable)
                speakable.add((Speakable) animal);
        }
        return speakable;
    }
}
