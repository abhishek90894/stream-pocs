package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A115 {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("abhishek","abhishek","abhinav","anshu","tanu","tanu","gauri");

        Map<String,Long> m1   =  l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

           m1.forEach((string,count)->System.out.println(string+" "+count));
    }
}
