package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("AA","BB","AA","CC","DD","BB");

            List<String> l1  = l.stream().filter(e->e.equals("CC")).collect(Collectors.toList());
        System.out.println(l1);


    }
}
