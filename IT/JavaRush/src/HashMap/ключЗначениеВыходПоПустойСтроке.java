package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
// Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны.
// Введенные данные не должны потеряться!
// Затем программа выводит содержание HashMap на экран.

public class ключЗначениеВыходПоПустойСтроке {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap< String, Integer> map = new HashMap<String, Integer>();
        while (true){
            String s = reader.readLine();
            if (s.isEmpty())
                break;
            int id   = Integer.parseInt(s);
            String name = reader.readLine();
            if (name.isEmpty())
                break;
            map.put(name, id);
        }
        printKeys(map);

    }

    public static void printKeys(Map<String, Integer> map)
    {
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
