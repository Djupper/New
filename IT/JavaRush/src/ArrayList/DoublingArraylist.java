package ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by Prog on 15.08.2016.
 */
public class DoublingArraylist {
    /* 1. Введи с клавиатуры 10 слов в список строк.
             2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
     3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
     */
    public static void main(String[] args) throws Exception {
        //Считать строки с консоли и объявить ArrayList list тут
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        ArrayList<String> result = doubleValues(list);

        //Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();

        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            result.add(a);
            result.add(a);
        }
        return result;

    }
}
