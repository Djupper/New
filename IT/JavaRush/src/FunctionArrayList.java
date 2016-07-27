import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


public class FunctionArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8, 4, 18, 24, 35, 100, 2, 5, 7);
        System.out.println(list1);
           // Конверт из ArrayList в array
        Object[] n = list1.toArray();
        System.out.println(Arrays.toString(n));

    }
}
