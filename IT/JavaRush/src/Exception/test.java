package Exception;

import java.io.IOException;

/**
 * Created by Prog on 26.09.2016.
 */
public class test {
    public static void main(String[] args) {
        try
        {
            int a=2/0;

        }catch (ArithmeticException e)
        {
            System.out.println("Error" + e);
        }
    }
}
