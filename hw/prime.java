package hw;
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int prime[] = new int[num];
        int temp = 2;
        int count = 0;

        while (count < num) {
            boolean isPrime = true;
            for (int j = 2; j <= temp; j++) {
                if (temp % j == 0 && j != temp) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                prime[count] = temp;
                count++;
            }
            temp++;
        }

        for (int i = 0; i < prime.length; i++) {
            System.out.print(prime[i] + " ");
        }


    }
}
