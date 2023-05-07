package Tut1;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Arguments :");
        for (int i = 0; i < args.length; i ++) {
            System.out.println(args[i]);
            n++;
        }
        System.out.println("Number of arguments is " + n);
    }
}
