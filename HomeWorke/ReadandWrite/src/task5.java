import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Task5 {
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


            while (scanner.hasNextLine()) {
                data.append(scanner.nextLine()).append("\n");
                //data.println(scanner.nextLine().toUpperCase());


            }

            //System.out.println(data);






        }
    }
}

