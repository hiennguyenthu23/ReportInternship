package tut2;

public class greatestNumber {
    int a = 10;
    int b = 20;
    int c = 30;

    public void compare() {
        if (a > b && a > c ) {
            System.out.println("the greatest number is" + a);
        } else if (b > a && b > c) {
            System.out.println("the greatest number is" + b);
        } else if (c > a && c > b) {
            System.out.println("the greatest number is" + c);
        } else {
            System.out.println("Error!");
        }
    }
    public static void main(String[] args) {
        greatestNumber compare = new greatestNumber();
        compare.compare();
    }
}
