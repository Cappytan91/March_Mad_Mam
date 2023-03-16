import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Text2Bracket {

    private static ArrayList<Mammal> animals = new ArrayList<Mammal>();
    public static void convert(){
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("src/Mammals.txt"));
            String line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            while (line != null) {
                animals.add(new Mammal(line));
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Mammal> getAnimals() {
        return animals;
    }
}
