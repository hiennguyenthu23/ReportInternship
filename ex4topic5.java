import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class ex4topic5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        String str = sc.nextLine();
        StringBuffer stringbuff = new StringBuffer(str);
        // To reverse the string
        System.out.println("Reverse of entered string is " + stringbuff.reverse());

    }
}

