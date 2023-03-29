package springBootDemo.demo;

import java.util.List;
import java.util.stream.Collectors;

public class evenOdd {

    public static void main(String[] args) {


        /**
         * to find out odd and even number from the list
         */

        List<Integer> list = List.of(2, 10, 5, 7, 8, 4, 6, 2, 10, 6);
            List<Integer> even  =  list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println("even list"+even);

        List<Integer> odd = list.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println("odd list"+odd);


    }
}
