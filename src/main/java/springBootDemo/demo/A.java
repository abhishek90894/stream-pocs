package springBootDemo.demo;

public class A {

    static
    {

        System.out.println("abhishek");

    }

    public static void display()
    {
        System.out.println("mudit");
    }

}

class B extends A {

//    public void display()
//    {
//        System.out.println("abhishek");
//
//
//    }

    public static void main(String[] args) {

       A.display();

    }
}
