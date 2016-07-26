import java.util.Collections;
import java.util.ArrayList;

/**
 * Created by Prog on 26.07.2016.
 */
public class FunctionArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8, 4, 18, 24, 35, 100, 2, 5, 7);
        System.out.println(list1);
    }
}
