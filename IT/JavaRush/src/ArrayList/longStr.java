package ArrayList;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class longStr {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        for (int i = 0; i < 5; i++) {
            list.add(r.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            if (index < list.get(i).length()) {
                index = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == index) {
                System.out.println(list.get(i));
           }
        }
    }
}
