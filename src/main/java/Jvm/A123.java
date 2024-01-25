package Jvm;

public class A123
{
    // check given string is palindrome or not
    public static void main(String[] args) {

        String s1 = "abhihba";

        String rev = "";
           for(int i=0;i<s1.length();i++)
           {
                rev = s1.charAt(i)+rev;
           }
        if(s1.equals(rev))
        {
            System.out.println("string is palindrome");
        }
        else
            System.out.println("string is not palindrome");
    }
}
