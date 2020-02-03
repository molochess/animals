import java.io.Serializable;

public class Food implements Serializable {
    private String name;
    private double mass;

    Food(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }
    @Override
    public String toString() {
        String str = "";
        str = name + " " + mass + "kg \n";
        return str;
    }
}
