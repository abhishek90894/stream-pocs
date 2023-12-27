package springBootDemo.demo;

public class StringReverse {

    public static void main(String[] args) {

        String n = "abhishek";
        String rev = "";

        for(int i=0;i<n.length();i++)
        {

            rev=  n.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}
