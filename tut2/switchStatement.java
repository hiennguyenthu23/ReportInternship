package tut2;

public class switchStatement {

    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c = 30;
        int largest;
        largest = c>(a>b?a:b)?c:(c>b?a:b);
        System.out.println("the greatest number is "+ largest);

        switch (largest) {
            case 100:
                System.out.println("a is the largest number");
                break;
            case 20:
                System.out.println("b is the greatest number");
                break;
            case 30:
                System.out.println("c is the greatest number");
                break;
        }
        }

    }

