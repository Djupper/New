import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter("D:\\IJ\\New\\HomeWorke\\ReadandWrite\\output.txt");
             Scanner scanner = new Scanner(new FileInputStream("D:\\IJ\\New\\HomeWorke\\ReadandWrite\\input.txt"))) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}



