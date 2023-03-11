package homework2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
    private String name;
    private String color;
    private int pawsCount;

    private static int animalsCount = 0;

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        animalsCount++;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    @Override
    public String toString() {
        return String.format("Животное %s, Имя: %s, Цвет: %s", this.getType(), this.name, this.color);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
