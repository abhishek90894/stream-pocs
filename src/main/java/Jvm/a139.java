package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a139 {

    public static void main(String[] args) {

        List<List<Integer>> l1 = List.of(List.of(2,3,4),List.of(4,5,6));

        List<Integer> list  =  l1.stream().flatMap(e->e.stream()).collect(Collectors.toList());
        System.out.println(list);
    }
}
