package lecture;

import java.util.Scanner;

public class ex6topic5 {
    public static void main(String[] args) {
        //Fill your code
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();
        String string2 = str.replaceAll(" + "," ");
        String string1[] = string2.split(" ", -1);
        System.out.println("The words in the string are");
        for (int i = 0; i < string1.length; i++) {
            System.out.println(string1[i]);
        }
    }
}
