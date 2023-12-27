package springBootDemo.demo;

public class Singleton {

    private Singleton()
    {

    }
    static Singleton s;

    static
    {
         if(s==null)
      s= new Singleton();


    }
    @Override
    public int hashCode()
    {
        return 10;
    }


}

class A202
{
    public static void main(String[] args) {

        Singleton s1 = Singleton.s;
        Singleton s2 = Singleton.s;

        System.out.println(s1.hashCode()+"  "+s2.hashCode());

    }
}
