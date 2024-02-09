package Jvm;

import javax.xml.stream.events.Characters;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

 interface  H
 {
      int a = 20;
 }
public class A137 {
                        //19. Write a program using java 8
                        //List<String> s=List.of("Jay","Amit","Raj","Ashok","Jayesh");
                        //output should be in Map<String,List<String>>,key should be letter "A" and values should be
                        //List.of("Amit","Ashok")
    public static void main(String[] args) {
        List<String> s= List.of("Jay","Amit","Raj","Ashok","Jayesh");

     Map<Character,List<String>> m      =  s.stream().filter(e->e.toUpperCase().startsWith("A")).collect(Collectors.groupingBy(e->e.charAt(0),Collectors.toList()));

    }
}
