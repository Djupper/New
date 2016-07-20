import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Prog on 20.07.2016.
 */
public class testLambda {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();

        double sum = stream
                .filter(x->x%2==0)
                .mapToDouble(Math::sqrt)
                .sum();
        System.out.println(sum);
    }
}
