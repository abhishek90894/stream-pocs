package springBootDemo.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(3,4,5,5,6,6,7,2,3,8,98);
        Set<Integer> s = new HashSet<>();
        l1.stream().filter(e->!s.add(e)).forEach(System.out::println);
            }
}
