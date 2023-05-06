import java.util.Scanner;
import java.util.StringTokenizer;

public class ex7topic5 {
    public static void main(String[] args) {
        //Fill your code
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringTokenizer str1 = new StringTokenizer(str,"=");
        String str2 = "";
        while (str1.hasMoreTokens()) {
            str2 = str2 + " " + str1.nextToken();
        }
        StringTokenizer str3 = new StringTokenizer(str2, ";");
        while (str3.hasMoreTokens()){
            System.out.println(str3.nextToken());
        }
    }
}
