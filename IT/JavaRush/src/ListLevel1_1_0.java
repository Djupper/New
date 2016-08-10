import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListLevel1_1_0 {
    /*
    1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
    2. Метод printList должен выводить на экран все элементы списка с новой строки.
    3. Используя метод printList, выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
     */

    public static void main(String[] args) throws Exception {
       // 1
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i <= 20; i++){
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i< list.size(); i++){
            int j  = list.size() -i - 1;
            System.out.println(list.get(j));

        }
        System.out.println(list);

            //
       /* ArrayList<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8, 4, 18, 24, 35, 100, 2, 5, 7, 45, 23,18, 20);
        System.out.println(list1);
        // Конверт из ArrayList в array
        Object[] n = list1.toArray();
        System.out.println(Arrays.toString(n));*/
        //




    }
}
