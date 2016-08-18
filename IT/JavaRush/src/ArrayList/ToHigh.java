package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Prog on 18.08.2016.
 */
public class ToHigh {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));

        }
        for (int x = 0; x< list.size(); x++)
        {

            System.out.println(list.get(x));
        }
    }
}
