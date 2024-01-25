package Jvm;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A131 {

   public static void main(String[] args) {

      String val = " I am a java developer from india";
                IntStream s = val.chars();
        Map<Character,Long> map       =  s.mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     // map.forEach((character,length)-> System.out.println(character+" "+length));

                  String [] s1      =   val.split("");
      Map<String ,Long> m        =  Arrays.stream(s1).map(e->e.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     // System.out.println(m);

                     char [] c       = val.toCharArray();
                  int length    = c.toString().length();
      System.out.println(length);
   }

}
