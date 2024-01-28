
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class CheckedExceptions {

        public static void main(String[] args) {
            try {
                readFile("example.txt");
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        public static void readFile(String fileName) throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }

