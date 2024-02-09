package Jvm;

import java.util.ArrayList;
import java.util.List;

public class A152 {

    public static void main(String[] args) {

        int [] a = {2,2,3,4,5,5,6,7,6};

        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<a.length-1;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    l1.add(a[j]);
                }
            }
        }
        System.out.println(l1);
    }
}
