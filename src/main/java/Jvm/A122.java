package Jvm;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A122 {

    //  There is a String array String[] words = {"hello", "world", "HELLO", WORLD"}; How will you print output like hello-2, world-2 i.e. word followed by its count ignoring the case of the words in the input Array?
    public static void main(String[] args) {

        String [] words  = {"hello", "world", "HELLO", "WORLD"};

        Map<String,Long> s1  = Arrays.stream(words).map(e->e.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
             s1.forEach((string,count)-> System.out.println(string+" "+count));
    }
}
