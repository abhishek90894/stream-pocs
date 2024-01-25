package Jvm;

public class A116 {


    public static void main(String[] args) {

       Long f =  generateFactorial(5);
        System.out.println(f);
    }

    private static long generateFactorial(int i) {

        if(i==0||i==1)
        {
            return 1;
        }
        return  i*generateFactorial(i-1);
    }
}
