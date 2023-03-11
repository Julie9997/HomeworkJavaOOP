package homework2;

public class Human extends Animal{
    public Human(String name) {
        super(name, null, 2);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getType(), this.getName());
    }

}
