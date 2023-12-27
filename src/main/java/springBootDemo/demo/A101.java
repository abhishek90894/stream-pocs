package springBootDemo.demo;

import java.util.Arrays;
import java.util.List;

public class A101 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(4,5,6,2,8,7,9);

        l1.stream().map(e->e*e*e).filter(e->e>150).forEach(System.out::println);
    }
}
