package main;

import tut4.Person;

public class Main {
    public void main(String[] args) {
        // accessibility (class level and member level)-- classes of same package within the package & out of the package
        // access modifiers/ specifiers -- public, protected/ private/ default
        /* public class person {
        members
    }

         /*
        Person p1 = new Person();
        p1.setName("Hihi");
        p1.setAge(18);
        p1.setGender("female");
        */
        //p1.display(this.getName());
        int i = (Integer) null;
        Person p4 = null;
        Person p5 = new Person();
        System.out.println(p5.getAge());
        p5 = null;

    }

    //
}
