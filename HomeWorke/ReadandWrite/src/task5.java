import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class task5 {
   /* public Integer countIn(String value) {

       // return  ;
    }*/




    public static void main(String[] args) throws IOException {

       /*
        -Прочитать текст из файла, и написать функцию,
        которая считает количество вхождений некоторой
        строки в этот текст без учета регистра символов
        -Использовать цикл и indexOf, который принимает
        начальный индекс, с которого искать
        */
        try (
                Scanner scanner = new Scanner(new FileInputStream("D:\\IJ\\New\\HomeWorke\\ReadandWrite\\text.txt"))) {

            StringBuffer data = new StringBuffer();

            while (scanner.hasNextLine()) {

                data.append(scanner.nextLine()).append("\n");


            }

            System.out.println(data.toString());

        }
    }
}

