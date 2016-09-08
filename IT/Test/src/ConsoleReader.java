import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {


    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;
    }

    public static int readInt() throws Exception {
        int a = Integer.parseInt(ConsoleReader.readString());
        return a; //напишите тут ваш код
    }

    public static double readDouble() throws Exception {
        double a = Double.parseDouble(ConsoleReader.readString());
        return a; //напишите тут ваш код
    }

    public static void readBoolean() throws Exception {
        //напишите тут ваш код
        boolean a = true;
        if (ConsoleReader.readString().equals("true")) {
            a = true;
            if (ConsoleReader.readString().equals("false")) {
                a = false;
              //  return a;
            }
        }


    }
}



