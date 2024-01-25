package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A119 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("abhishek","anshu","abhishek","tanuja");

        Map<String,Long> map     = l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
           map.forEach((name,count)-> System.out.println(name+" "+count));
    }
}
