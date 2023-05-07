package tut4;

public class Person {

    String name;

    int age;

    String gender;

//String address;

//String uin;

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getGender() {

        return gender;

    }

    public void setGender(String gender) {

        this.gender = gender;

    }

//public String getAddress() {

//return address;

//}

//    public void setAddress(String address) {

//        this.address = address;

//    }

//    public String getUin() {

//        return uin;

//    }

//    public void setUin(String uin) {

//        this.uin = uin;

//    }

//Constructor overloading 

    public Person(String name, int age, String gender) {

//super();

        this.name = name;

        this.age = age;

        this.gender = gender;

    }

    public Person() {

// TODO Auto-generated constructor stub

    }
        //method overloading---compile time polymorphism

//        public void display () {
//
//            System.out.println("Nmae: " + this.getName());
//
//            System.out.println("age: " + this.getAge());
//
//            System.out.println("Gender: " + this.getGender());
//        }

        public void display (String name){

            System.out.println("Name: " + this.getName());

        }
    }


