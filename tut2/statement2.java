package tut2;

public class statement2 {
    int a = 50;
    int b = 100;
    int c = 23;

    public void realOpen() {
        // ==, !=, > , <, >= , <= ,
        if (a == b) {
            System.out.println("a is equals to b");
        } else if (a < b){
            System.out.println("a is smaller than b");
        } else if (a > b) {
            System.out.println("a is bigger than b");
        }
        if (b <= a) {
            System.out.println("b is less than or equal to b");
        } else if (a != b) {
            System.out.println("a and c is not equal to b");
        } else if (a >= b) {
            System.out.println("a is greater or equal to b");
        }
        if ( a == c) {
            System.out.println("a equal to c");
        } else if (a != c) {
            System.out.println("a is not equal to c");
        }
    }

    public static void main(String[] args) {
        statement2 ssp1 = new statement2();
        ssp1.realOpen();
    }
}
