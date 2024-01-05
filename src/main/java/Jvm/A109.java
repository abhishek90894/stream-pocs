package Jvm;

import java.util.LinkedHashSet;

class A109
{

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class A110
        {
            public static void main(String[] args) {
                 A109 a = new A109();
                  a.setId(100);
                  a.setName("abhishek");
                  A109 b = new A109();
                  b.setId(100);
                  b.setName("abhishek");

                LinkedHashSet linkedHashSet = new LinkedHashSet<>();
                linkedHashSet.add(a);
                linkedHashSet.add(b);
              int c = linkedHashSet.size();
                System.out.println(c);
            }
        }
