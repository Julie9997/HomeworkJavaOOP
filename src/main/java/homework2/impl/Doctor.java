package homework2.impl;

import homework2.Animal;
import homework2.Human;
import homework2.Runnable;
import homework2.Speakable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Doctor extends Human implements Speakable, Runnable {
    private String specialization;
    private int age;

    public Doctor(String name, String specialization, int age) {
        super(name);
        this.specialization = specialization;
        this.age = age;
    }

    public Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    public Doctor(String name) {
        super(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String specialization) {
        this.specialization = specialization;
    }

    public void heal(Animal animal) {
        System.out.printf("Врач %s лечит %s %s", this.getName(), animal.getType(), animal.getName());
    }

    public void vaccination(Animal animal) {
        System.out.printf("Врач %s прививает %s %s", this.getName(), animal.getType(), animal.getName());
    }

    @Override
    public String toString() {
        return String.format("ФИО : %s, Должность : %s", this.getName(), this.specialization);
    }
    @Override
    public void speak() {
        System.out.printf("Здравствуйте! Меня зовут %s%n", this.getName());
    }

    @Override
    public int getRunningSpeed() {
        return 8;
    }
}
