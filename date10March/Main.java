package date10March;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scan.nextInt();
        byte b = (byte) number;
        short s = (short) number;
        long l = (long) number;
        float f = (float) number;
        double d = (double) number;
        System.out.println("The binary equivalent of " + number + " is "+ Integer.toBinaryString(number));
        System.out.println("The hexadecimal equivalent of "+ number + " is " + Integer.toHexString(number));
        System.out.println("The octal equivalent of " + number + " is " + Integer.toOctalString(number));
        System.out.println("Byte value of " + number + " is " + b);
        System.out.println("Short value of " + number + " is " + s);
        System.out.println("Long value of " + number + " is " + l);
        System.out.println("Float value of " + number + " is " + f);
        System.out.println("Double value of " + number + " is " + d);

    }
}
