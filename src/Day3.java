import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader r = new BufferedReader(new FileReader(Paths.get("submarineEnergy.txt").toFile()));
            String number = r.readLine();

            List<Integer> numbers = new ArrayList<>();
            while (number != null) {
                for (int i = 0; i < number.length(); i++) {
                    int num = Integer.parseInt(Character.toString(number.charAt(i)));
                    numbers.add(num);
                }
                number = r.readLine();
            }

            List<Integer> herm = new ArrayList<>();
            //Split
            List<Integer> results = new ArrayList<>();
            for (int i = 0; i < 12; i++) {
                for (int u = 0; u<numbers.size(); u++){

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
