package ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Prog on 15.08.2016.
 */
public class ChangeMeaningVariable {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        //
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).contains("р") && !(list.get(i).contains("л"))) {
                list.remove(i);
            } else {
                i++;
            }
        }
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).contains("л") && !(list.get(i).contains("р"))) {
                list.add(i, list.get(i));
                i += 2;
            } else {
                i++;
            }

        }

        return list;
    }
}
