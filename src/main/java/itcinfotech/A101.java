package itcinfotech;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class A101 {


    public Optional<Integer> sorted(List<Integer> l1)
    {
         if(l1==null)
         {
             return  null;
         }


    Optional<Integer> a = l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        return a;
    }

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(23,56,12,43,65,78,14,78);

        A101 a = new A101();
        System.out.println(a.sorted(null));


    }
}
