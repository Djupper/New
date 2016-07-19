import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;

/**
 * Created by Prog on 19.07.2016.
 */
public class task6 {
    public static void main(String[] args) {

       /* -Разбить строку “1, 2, 3, 4, 5” и получить массив из
        этих чисел и найти их сумму
        -Использовать split и Integer.parseInt*/
        String list = "1,2,3,4,5";
        String[] array = list.split(",");
        int[] num = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            num[i] = Integer.parseInt(array[i]);
            sum += num[i];
        }
        System.out.println(sum);
    }
}
// Используя Лямбды
        /*
        String str = "1,2,3,4,5";
        int[] numArr = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int numbers  : numArr){
            sum += numbers;
        }
        System.out.println(sum); //15

    }
}*/