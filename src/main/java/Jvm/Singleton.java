package Jvm;

import jakarta.transaction.Synchronization;

public class Singleton implements Cloneable {


    private Singleton()
    {

    }

    static Singleton singleton;

    static {

          if(singleton==null)
          {
                synchronized (Singleton.class)
              {
                     if(singleton==null)
                         singleton  = new Singleton();
              }
        

          }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException();
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    @Override
    public int hashCode() {
        return 20;
    }
}

class A143
{
    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
         Singleton s3 = (Singleton) s1.clone();
        System.out.println(s3);
        System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
    }
}
