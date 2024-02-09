package Jvm;

public class A133 {

      public static int []  selection(int[] b)
    {                                            //{4,2,7,13,67,45,56}
           int min_number;
           for(int i =0;i<b.length-1;i++)
           {
                 min_number= i;
               for(int j=1;j<b.length;j++)
               {
                      if(b[i]>b[j])
                      {
                          min_number=j;
                      }
               }
                   int k;
                  k=b[i];
                  b[i]=b[min_number];
                  b[min_number]=k;

           }
           return b;
    }
    public static void main(String[] args) {

        int [] a = {40,2,7,13,67,45,56};

       int b[] =  selection(a);
        for (int i=0;i<b.length-1;i++)
        {
            System.out.println(b[i]);
        }


    }
}
