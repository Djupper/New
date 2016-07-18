
public class Main {
    public static void main(String[] args) {
        String symbol = "о";
        String text = "Добрый день! о";
        int count = (text + "\0").split(symbol).length - 1;
        System.out.println(count);

    }
}
