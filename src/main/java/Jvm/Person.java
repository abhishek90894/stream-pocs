package Jvm;

public class Person implements Cloneable{

    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address
        {
           String city;

        }

class ShallowCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person originalPerson = new Person();
        originalPerson.name = "John";
        originalPerson.address = new Address();
        originalPerson.address.city = "New York";

        // Shallow cloning
        Person clonedPerson = (Person) originalPerson.clone();

        // Both original and clone share the same Address object
          originalPerson.address.city = "usa";
          originalPerson.name = "abhishek";
        System.out.println(originalPerson.address.city);  // Output: New York
        System.out.println(clonedPerson.address.city);    // Output: New York
        System.out.println(originalPerson.name);
        System.out.println(clonedPerson.name);
    }
}
