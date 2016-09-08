package HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/
public class ПоискЗначенияПоКлючу {
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код

        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        /*for (Map.Entry<String, Integer> pair : map.entrySet())
        {

            if (text.contains(pair.getKey()))
            {
                System.out.println(text + " " + "is" + " " + pair.getValue() + " " + "month");

            }
        }*/
        Iterator<Map.Entry<String, Integer>> i = map.entrySet().iterator();
        while (i.hasNext())
        {
            Map.Entry<String, Integer> o = i.next();
            if (o.getKey().equals(text)) System.out.print(text + " is " + o.getValue() + " month");

        }
    }
}
