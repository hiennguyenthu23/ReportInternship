package tut2;

public class Circle {
    long aras = 1;
    long diameter;
    boolean bool = true; // true or false
    long radius = 10;
    float pi = (float) 3.14;
    char cha = '#';
    String cha2 = "Welcome to the World";
    double perimeter;
    double area;
    public void dia() {

       radius += radius;
//        diameter = radius + radius;
        System.out.println("The diameter is " + radius);
    }

    public void peri() {
        perimeter = 2 * pi * radius;
        System.out.println("The perimeter is: " + cha + perimeter);
    }
    public void arithass() {
        aras += radius; // aras = aras + radius 10 + 1 = 11
        System.out.println("the arithmetic assigment is: " + aras);
        aras -= radius; // aras = aras - radius 11 - 1 = 10
        System.out.println("the arithmetic assigment is: " + aras);
        aras *= radius; // aras = aras * radius 10 * 1 = 10
        System.out.println("the arithmetic assigment is: " + aras);
        aras /= radius; // aras = aras / radius 10 / 1 = 10
        System.out.println("the arithmetic assigment is: " + aras);
        aras %= radius; // aras = aras % radius 10 % 1 = 10
        System.out.println("the arithmetic assigment is: " + aras);
    }

    public void ar() {
        area = pi * radius;
        System.out.println("The area is: " + cha + ' '+ area);
        System.out.println(bool);
    }

    public static void main(String[] args) {
        Circle cir1 = new Circle();
//        cir1.ar();
//        cir1.peri();
//        cir1.dia();
        cir1.arithass();
    }
}
