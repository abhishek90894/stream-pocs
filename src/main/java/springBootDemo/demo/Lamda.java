package springBootDemo.demo;

interface H
{
    public  void display();
}

public class Lamda  {



    public static void main(String[] args) {
        H h = ()-> System.out.println("abhishek");
        h.display();
    }

}
