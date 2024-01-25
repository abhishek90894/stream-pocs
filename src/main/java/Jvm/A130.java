package Jvm;

public class A130 {


    public static void main(String[] args) {


         getUnfiromString("aabbbbbcccdd");
    }

    private static void getUnfiromString(String s) {

      char [] c  = s.toCharArray();

      int initialLength = 0;
      int maxLength = 1;

      for(int i = 0;i<s.length();i++)
      {
           if(c[i]==c[i+1])
           {
               initialLength = i;
               maxLength = i+1;
           }
      }
    }
}
