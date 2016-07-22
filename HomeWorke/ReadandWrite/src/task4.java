public class Task4 {
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
        int in = url.indexOf("/");
        StringBuilder list = new StringBuilder();
        list.append(url).delete(0, index + 3);
        int index2 = list.indexOf("/");
        String name = list.substring(0, index2);
        System.out.println(name);

    }
}
