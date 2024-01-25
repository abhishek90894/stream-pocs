package Jvm;

public class Atm {

   public int checkNotes(int amount)
   {
          int a = amount/2000; // 100 500 2000
           int b = amount%2000;
           int c;
           int d;
               if(b!=0)
               {
                    c = b/500;
                    d = b%500;
                    if(d!=0)
                    {
                      int e = d/100;
                        System.out.println(a+c+e);
                    }
                   System.out.println(a+c);

               }



       return 1;
   }
    public static void main(String[] args) {

         Atm atm = new Atm();
           atm.checkNotes(4000);

    }

}
