import java.util.Scanner;

public class ex5topic5 {
//    public void startsWith() {
//
//    }
    public static void main(String[] args) {
        //Your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();
        System.out.println("Enter the start string");
        String startStr = scan.nextLine();
        if (str.startsWith(startStr)) {
            System.out.println("\"" + str + "\"" + "starts with" + "\"" + startStr + "\"");
        }
        else {
            System.out.println("\"" + str + "\"" + "does not start with "+ "\"" + startStr + "\"");
        }
    }
}
