package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A117 {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("abhishek","anshu","tanu","chutki","gauri");

        Map<Object, List<String>> m      =  name.stream().filter(e->e.toUpperCase().startsWith("A")).collect(Collectors.groupingBy(e->String.valueOf(e.charAt(0)),Collectors.toList()));

        System.out.println(m);
    }
}
