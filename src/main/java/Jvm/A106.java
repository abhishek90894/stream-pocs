package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A106 {

    public static void main(String[] args) {

        String s = "hello every one";

         String l[] = s.split("");
        List<String> l1   = Arrays.stream(l).filter(e->e.equals("e")).toList();
        System.out.println(l1);
    }
}
