package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A135 {

    public  static void main(String arg[])
    {
       // List<String> l1 = Arrays.asList("elephant","elephant");
              String s = "elephant";

                       char [] c =   s.toCharArray();


            Map<Character,Long> m1   =  s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      //  System.out.println(m1);

          List<Integer> l1 = Arrays.asList(2,3,4,5,6,7,8,9);
         List<Integer> even  = l1.stream().filter(e->e%2==0).limit(2).collect(Collectors.toList());
        System.out.println(even);




      //  Map<String,Long> m   =   l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       // System.out.println(m);
    }

}
