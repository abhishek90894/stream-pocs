package springBootDemo.demo;

import java.util.ArrayList;
import java.util.List;

class Product
{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class empSalary {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"HP",25000f));
        productList.add(new Product(2,"dell",30000f));
        productList.add(new Product(3,"hp",22000));
        productList.add(new Product(4,"lenovo",65000));
        /**
         * filter product name whose price greater 30000
         */
        productList.stream().filter(e->e.price>30000).forEach(e->
        {
            System.out.println(e.name+"\t"+e.price);
        });

    }
}
