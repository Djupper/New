import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by Prog on 08.08.2016.
 */
public class ComparisonOfTwoArrays {
    public static void main(String[] args) {
        String[] array1 = {"qw", "er", "qs", "ds", "ss"}; // Задаешь 1й массив
        String[] array2 = {"er", "we", "ee", "dы", "dd", "ds", "sd"}; // Задаешь 2й массив

        for ( int i =0; i <array1.length; i++){
            for (int j = 0; j<array2.length;j++ ){
                if (array1[i] == array2[j])
                    System.out.println("Equals " + " Значение в первом массиве " +  array1[i] + " = " + "Значению во втором массиве " + array2[j]);
                }
            }
        }

    }

