/**
 * Created by AsusD on 18.07.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        int end = 100;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= end; i++) {
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);
    }
}
