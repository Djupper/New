package HashSet;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Prog on 06.09.2016.
 */
public class ЗаполнениеHashSetиУдалениеПоУсловию {
    public static void main(String[] args) {


        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add((int) (Math.random()*50) );
        }
        System.out.println(set);
        System.out.println(removeAllNumbersMoreThan10(set));

    }
    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator <Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10){ //значения больше 10
                iterator.remove();
            }

        }
        return set;
    }
}
