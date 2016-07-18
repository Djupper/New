import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) throws IOException {

        // Решение задачи по лекции

        try (
                Scanner scanner = new Scanner(new FileInputStream("D:\\IJ\\New\\ReadandWrite\\src\\input.txt"))) {

            StringBuffer data = new StringBuffer();

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