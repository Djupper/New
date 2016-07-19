import sun.util.locale.StringTokenIterator;

/**
 * Created by Prog on 19.07.2016.
 */
public class task6 {
    public static void main(String[] args) {

       /* -Разбить строку “1, 2, 3, 4, 5” и получить массив из
        этих чисел и найти их сумму
        -Использовать split и Integer.parseInt*/

        String list = "1,2,3,4,5,6,7";
        String[] array = list.split(",");
        int sum = 0;
        for(int i =0; i<array.length;i++){
            sum += i;
            System.out.println(array[i]);
        }
        System.out.println(sum);


    }
}
