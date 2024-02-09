package Jvm;

@FunctionalInterface
interface Display
{
      void display();
}

public class A138 {

     public static void display()
     {
         System.out.println("hello this is abhishek");
     }

    public static void main(String[] args) {
        Display display = A138::display;
          display.display();
    }
}
