package Jvm;

public class A142 extends Thread{

      public void run()
        {
            StringBuilder s = new StringBuilder("abhishek");
            StringBuffer s1 = new StringBuffer("abhinav");
            System.out.println(s.append("srivastava"));
            System.out.println(s1.append("srivastava"));
        }
    public static void main(String[] args) {

        A142 t1 = new A142();
         // t1.start();

          A142 t2 = new A142();
         //  t2.start();
    }
}
