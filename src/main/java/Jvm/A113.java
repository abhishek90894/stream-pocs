package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A113 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(2, 5, 7, 8, 9, 3, 4,6,11);

      List<Integer> prime = l1.stream().filter(e -> checkPrime(e)).collect(Collectors.toList());
        System.out.println(prime);
    }

    private static boolean checkPrime(Integer e) {

        if (e == 2) {
            return true;
        } else {
            for (int i = 2; i <= e - 1; i++) {
                if (e % i == 0) {
                    
                }
                else{
                return true;
            }
            }
        }

        return false;
    }
}
