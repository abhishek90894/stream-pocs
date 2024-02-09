package Jvm;

import java.util.Random;
import java.util.stream.Stream;

public class A134 {

      public static double generateRandom()
      {
           double number  = Math.random()  ;

          return number*100 ;
      }

    public static void main(String[] args) {

//            double number = generateRandom();
//        System.out.println(number);

       Stream<Integer> random   =  Stream.generate(()->new Random().nextInt()).limit(10);
        System.out.println(random.toString());


    }
}
