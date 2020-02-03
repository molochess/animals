import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingReading {

    public static void writing(Animal animal, String file ) {
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(animal.toString());
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    public static void reading(String file) {
        try (FileReader reader = new FileReader(file)) {
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
