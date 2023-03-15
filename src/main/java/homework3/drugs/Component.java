package homework3.drugs;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return getPower() == component.getPower() && Objects.equals(getName(),
                                                                component.getName()) && Objects.equals(getWeight(),
                                                                component.getWeight());
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode(): 0);
        return result;
    }

    @Override
    public String toString() {
        return "Component " +
                "name = " + name +
                " weight = " + weight +
                " power = " + power ;
    }
}
