package homework2;


import homework2.impl.*;
import homework2.veterenary.VetClinic;


public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Penguin("Лоло"))
                .addAnimal(new Parrot("Кеша"))
                .addAnimal(new Raven("Якоб"))
                .addAnimal(new Doctor("Иванов Иван Иванович"));

        System.out.println("Вывод всех");
        for (Animal animal: vetClinic.getAllAnimals()) {
            System.out.println(animal);
        }

        System.out.println("\nБегающие");
        for (Runnable r: vetClinic.getRunnable()) {
            System.out.println(r + " бегает со скоростью " + r.getRunningSpeed());
        }

        System.out.println("\nПлавающие");
        for (Swimmable s: vetClinic.getSwimmable()) {
            System.out.println(s + " плывет со скоростью " + s.getSwimmingSpeed());
        }

        System.out.println("\nЛетающие");
        for (Flyable f: vetClinic.getFlyable()) {
            System.out.println(f + " летает со скоростью " + f.getFlyingSpeed());
        }

        System.out.println("\nИздающие звуки");
        for (Soundable s: vetClinic.getSoundable()) {
            System.out.println(s);
            s.makingSound();
        }

        System.out.println("\nГоворящие");
        for (Speakable s: vetClinic.getSpeakable()) {
            System.out.println(s);
            s.speak();
        }
    }
}
