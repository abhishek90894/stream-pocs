package springBootDemo.demo;

import java.util.Arrays;
import java.util.List;

public class A102 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("abhishek","abhinav","ankur");

         l1.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
