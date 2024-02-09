package Jvm;

import java.util.*;
import java.util.stream.Collectors;

public class A151 {

    public static void main(String[] args) {

        int[] arr1 ={25, 17, 38, 20, 43};
        int[] arr2 ={20, 16, 12, 17, 25};

       int arr [] = {2,3,4,2,4,5,6,7};

             // Arrays.stream(arr).map(e->!ha)


        List<int []> l1 = Arrays.asList(arr1,arr2);
        Set<Integer> set  =    l1.stream().flatMapToInt(e-> Arrays.stream(e)).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toSet());
        System.out.println(set);
    }
}
