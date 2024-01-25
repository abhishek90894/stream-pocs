package Jvm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A127 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(2,3,4,5,6,7,8,9,3);

          List<String> result     = l1.stream().flatMap(e-> {
                    if (e % 2 == 0)
                    {
                        return Stream.of("even"+e);
                    }
                    else {
                        return Stream.of("odd"+e);
                    }
                }).collect(Collectors.toList());
        System.out.println(result);




        int [] a = {2,3,4,5,6,7,8,9,3};
          Map<String,List<Integer>> m = new HashMap<>();
          List<Integer> even = new ArrayList<>();
          List<Integer> odd = new ArrayList<>();
         for(int i =0;i<a.length;i++)
         {
             if(a[i]%2==0)
             {
                   even.add(a[i]);
                 m.put("even", even);
             }
             else {
                   odd.add(a[i]);
                 m.put("odd", odd);
             }
         }
       // System.out.println(m);
    }

}
