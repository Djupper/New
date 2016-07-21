import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class task5 {
    public static void main(String[] args) throws IOException {

       /*
        -Прочитать текст из файла, и написать функцию,
        которая считает количество вхождений некоторой
        строки в этот текст без учета регистра символов
        -Использовать цикл и indexOf, который принимает
        начальный индекс, с которого искать
        */
        try (Scanner scanner = new Scanner(new FileInputStream("D:\\IJ\\New\\HomeWorke\\ReadandWrite\\text.txt"))) {

            StringBuilder data = new StringBuilder();
            String a = data.append(scanner.hasNextLine()).toString();
          /*  while (scanner.hasNextLine()) {
                data.append(scanner.nextLine()).append("\n");
            }*/

            System.out.println(data.toString());
            System.out.println();

        }
    }
}

