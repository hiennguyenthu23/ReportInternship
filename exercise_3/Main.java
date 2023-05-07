package exercise_3;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int den = s.nextInt();
        Fraction f = new Fraction();
        f.printValue(num, den);
    }
}
