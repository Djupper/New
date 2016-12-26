package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class УдалениеПоИмени {
    public static void main(String[] args) {

        HashMap<String, String> copy = createMap();
        removeTheFirstNameDuplicates(copy);
        printKeys(copy);
    }

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");//1
        map.put("Петров", "Сергей");//3
        map.put("Сидоров", "Дмитрий");//2
        map.put("Фунин", "Иван");//1
        map.put("Грузин", "Сергей");//3
        map.put("Смел", "Павел");
        map.put("Проп", "Дмитрий");//2
        map.put("Друзь", "Александр");
        map.put("Вязь", "Алексей");
        map.put("Сорин", "Семён");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void printKeys(HashMap<String, String> map) {

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
