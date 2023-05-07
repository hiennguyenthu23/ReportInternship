package exercise_3;

import java.io.*;
import java.util.Scanner;


public class exercise3 {
    public static void main(String[] args) throws Exception, IOException {
        //Fill your code
        int length;
        int width;
        int area, area1;
        int d;
        Rectangle rectangle;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = scan.nextInt();
        System.out.println("Enter the width of the rectangle");
        width = scan.nextInt();
        rectangle = new Rectangle(length, width);
        rectangle.display();
        area = rectangle.area();
        System.out.println("Area of the Rectangle:" + area);
        System.out.println("Enter the new dimension");
        d = scan.nextInt();
        rectangle = rectangle.dimensionChange(d);
        if (rectangle instanceof Rectangle) {

        }

        rectangle.display();

        area = rectangle.area();
        System.out.println("Area of the Rectangle:" + area);
    }
}
