package Jvm;

public class A104
{

    public void doPrint(int n)
    {
      if(n>0)
      {
          n = n-1;
          System.out.println(n);
          doPrint(n);
      }
    }

    public static void main(String[] args) {

        A104 a104 = new A104();
        int n=100;
         a104.doPrint(n);
    }
}
