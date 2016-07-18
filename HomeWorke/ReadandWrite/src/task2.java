import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter("D:\\IJ\\New\\ReadandWrite\\src\\output.txt");
        Scanner scanner = new Scanner(
                new FileInputStream("D:\\IJ\\New\\ReadandWrite\\src\\output.txt"))){
            while (scanner.hasNextLine()) {

                writer.println(scanner.nextLine().toUpperCase());

            }
            System.out.println("Fine!");
        }
    }
}



