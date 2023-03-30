package springBootDemo.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class allStreamPoc {

    public static void main(String[] args) {


        /**
         * to find out odd and even number from the list
         */

        List<Integer> list = List.of(2, 10, 5, 7, 8, 4, 6, 2, 10, 6);
            List<Integer> even  =  list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println("even list"+even);

        List<Integer> odd = list.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println("odd list"+odd);

        /*
            to fetch the  string using stream api
         */
        Stream<Object> s1 = Stream.empty();
        String s2[] = {"abhishek","abhinav","ankit","raghav"};
                   Stream<String>  s3   = Stream.of(s2);
                   s3.forEach(e->{
                       System.out.println(e);
                   });
        /**
         * to print first five and last five number of a list using stream api
         */
        List<Integer> number = List.of(8,7,2,6,5,4,2,9);
        List<Integer> limit = number.stream().limit(5).collect(Collectors.toList());
        System.out.println(limit);

        List<Integer> skip = number.stream().skip(3).collect(Collectors.toList());
        System.out.println("last five"+skip);

        /**
         *  to add the no. inside the list
         */

        List<Integer> number1 = List.of(8,7,2,6,5,4,2,9);
                  int sum       = number1.stream().mapToInt(e->e).sum();
        System.out.println(sum);

        /**
         * to find the maximum and minimum no. in the list
         */
        List<Integer> number2 = List.of(56,23,78,98,12,32,35,67);
          int max = number2.stream().max((a,b)->a.compareTo(b)).get();
        System.out.println(max);

        int min = number2.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println(min);

        /**
         * to sort in ascending or descending order of the list
         */

                List<Integer> sort     = number2.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

           List<Integer>  desc  = number2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc);

        /**
         * second highest and second lowest
         */
        List<Integer> number4 = Arrays.asList(3,5,6,0,1,2,9,78,65,7,2,7,4,5,6);
        int secondHighest = number4.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondHighest);

        int secondLowest = number4.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secondLowest);

        /**
         *  in this we have a list containing 2,3,4,5,6,15,13,25
         *  first find the square greater than 100 and then find the average of that no.
         */
        List<Integer> value = Arrays.asList(1,3,4,5,6,15,13,25);
        double average = value.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
        System.out.println(average);

        /**
         * filter the list of string that starts with letter r
         */
        List<String> name = List.of("raghav","abhishek","rita","sadhana","sushma");
        name.stream().filter(e->e.startsWith("r")).forEach(e->
        {
            System.out.println(e);
        });

        /**
         * add the number inside the list
         */
        List<Integer> add = List.of(5,6,4);
        int sum1 = add.stream().reduce((a,b)->a+b).get();
        System.out.println(sum1);

        /**
         *filtering the product price greater than 3000
         */



    }
}
