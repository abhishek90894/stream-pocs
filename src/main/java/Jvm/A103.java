package Jvm;

public class A103 {

    //fibanacci series

    public static void main(String[] args) {

        int a = 0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        for(int n=0;n<=20;n++)
        {
            int c = a+b;
            a=b;
            b=c;

            System.out.println(c);
        }
    }
}
