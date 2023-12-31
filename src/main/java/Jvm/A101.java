package Jvm;

interface  A
{
     default void print()
{
    System.out.println("A");
}
}

interface B
{
    default void print()
    {
        System.out.println("B");
    }
}

public class A101 implements A {
    public static void main(String[] args) {
        A101 a101 = new A101();
        a101.print();

    }



}
