package Jvm;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A145 {
    int i =10;

    void Print() {

        System.out.println("Print from Class X ");


    }
}
class A146 extends A145 {
    int i = 20;

    void Print() {

        System.out.println("Print from Class Y ");

    }
}

class A147
{
    public static void main(String[] args) {
        A145 a145 = new A146();
        System.out.println(a145.i);
        a145.Print();
    }
}
