package Jvm;

public class Persons implements Cloneable {

    String name;
    Addres address;

    public Persons(String name, Addres address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
    Persons clone   = (Persons) super.clone();
      clone.address =      (Addres) address.clone();
        return clone;
    }
}

class Addres implements Cloneable
{
  String city;

    public Addres(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Addres{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {


        Addres addres = new Addres("kanpur");
        Persons persons = new Persons("abhishek",addres);


        Persons clone = (Persons) persons.clone();
        persons.address.city = "lucknow";
        persons.name = "abhinav";


        System.out.println(clone);
        System.out.println(persons);
    }
}

