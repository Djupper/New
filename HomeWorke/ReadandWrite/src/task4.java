import java.util.Arrays;

/**
 * Created by AsusD on 18.07.2016.
 */
public class task4 {
    public static void main(String[] args) {
        /*
        Написать программу, которая вычленяет из URL
        адреса имя сервера. Имеется в виду следующее.
        Для строки вида
        http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf
        вычленить SomeServerName
        • Строка может начинаться не обязательно с http, но
        и с https или чего-то другого. Но :// есть всегда
        • Учесть случай, когда после :// больше нет слэша:
        • http://SomeServerName
        • Использовать indexOf и substring
        */

        String url = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        int index = url.indexOf("://");
        StringBuilder list = new StringBuilder();
        list.append(url).delete(0, index + 3);
        String[] text = list.toString().split("/");
        String name = text[0];
        int in = url.indexOf(name);
        System.out.println(in);
        System.out.println(name);

    }
}
