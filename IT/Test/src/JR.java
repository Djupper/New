import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class JR {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

//ввод строк с клавиатуры
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

            list.add(Integer.parseInt(reader.readLine()));

        }
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 3 == 0) {
                list3.get(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                list2.get(list.get(i));
            }
            if (list.get(i) % 2 == 0 && list.get(i) % 3 == 0) {
                list3.add(list.get(i));
                list2.add(list.get(i));
            } else {
                list1.get(list.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(list1);


    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }


}
