package itcinfotech;

public class A102 {

   public StringBuilder reverseOrder(String s)
   {
       if(s==null)
       {
           return null;
       }
       StringBuilder rev = new StringBuilder("");

       for(int i = s.length()-1;i>=0;i--)
       {

           rev =   rev.append(s.charAt(i));
       }
       return rev;
   }

    public static void main(String[] args) {

        String s = "abhishek";
        A102 a = new A102();
        System.out.println(a.reverseOrder(s));
    }
}
