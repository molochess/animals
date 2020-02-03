import java.util.ArrayList;
import java.util.List;

public class Animal {
    List<Food> food = new ArrayList<>();
    String type;
    String name;
    int age;

    Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }
}
