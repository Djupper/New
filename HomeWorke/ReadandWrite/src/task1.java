import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) throws IOException {

        // Решение задачи по лекции

        try (Scanner scanner = new Scanner(new FileInputStream("D:\\IJ\\New\\HomeWorke\\ReadandWrite\\input.txt"))) {

            StringBuilder data = new StringBuilder();

            while (scanner.hasNextLine()) {

                data.append(scanner.nextLine()).append("\n");

                System.out.println(data.toString());
            }


        }

    }
}
//С учетом что мы изучили Лямбды можно так!

      /*  Files.lines(Paths.get("D:\\LJ\\FerstEdu\\HwReadWriteFromFile\\etg.prog.HWRWFF\\src\\input.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
    }
}*/