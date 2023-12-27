package springBootDemo.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithOne {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(10,45,12,34,12,13,18);
    List<String>  s1 =   l1.stream().map(e->e+"").filter(e->e.startsWith("1")).collect(Collectors.toList());
        System.out.println(s1);
    }
}
