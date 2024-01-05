package Jvm;

public class Parent {

    void display()
    {

        System.out.println("parent");
    }
}

 class child extends Parent
{
    void display()
    {
        System.out.println("child");
    }
}

class  A108
{

    public static void main(String args[])
    {
        Parent p = new child();
        p.display();   //  child

        child c = new child();
        c.display();  // child
    }

}
