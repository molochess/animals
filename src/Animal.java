import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Serializable {
    private List<Food> food = new ArrayList<>();
    private Types type;
    private String name;
    private int age;

    Animal(Types type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<Food> getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }
    @Override
    public String toString() {
        String str = "";
        str = type.name() + " " + name + " "  + age + "\nFood:\n";
        for (Food item: food) {
            str += item.toString();
        }
        return str;
    }
}
