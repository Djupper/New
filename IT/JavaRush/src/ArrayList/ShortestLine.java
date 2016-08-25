package ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Prog on 19.08.2016.
 */
public class ShortestLine {
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size(); i++)
        {

            if (list.get(i).length() < list.get(0).length())
            {
                index = i;
            }

        }
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == list.get(index).length())
            {
                System.out.println(list.get(i));
            }
        }

    }

}
