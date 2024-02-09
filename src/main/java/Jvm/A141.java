package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A141
{
             //Given a list of integers,
    // write the java code logic to find out all the numbers starting with 1 using Stream functions

    public static void main(String[] args) {


        List<Integer> l1 = Arrays.asList(10, 8, 7, 25, 16, 23);

   // List<Integer> l2   = l1.stream().filter(e-> e.toString().startsWith("1")).collect(Collectors.toList());
   //     System.out.println(l2);

      //     List<Integer> even       =  l1.stream().filter(e->e%2==0).collect(Collectors.toList());
       // System.out.println(even);


    }

}
