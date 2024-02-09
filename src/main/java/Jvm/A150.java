package Jvm;

public class A150 {

    static int power(int i, int j) {
        if(j==0)
        {
            return 1;
        }
        else {
            return i*power(i,j-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(power(2,3));
    }
}
