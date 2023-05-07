package tut4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class rest {
    public static void main(String[] args) throws Exception{
//		Fill your code
        Scanner scan = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("Enter branding expenses");
        double brand = scan.nextDouble();
        System.out.println("Enter travel expenses");
        double travel = scan.nextDouble();
        System.out.println("Enter food expenses");
        double food = scan.nextDouble();
        System.out.println("Enter logistics expenses");
        double logistics = scan.nextDouble();
        double total = brand + travel + food + logistics;
        double brandpercent = (brand/total)*100;
        double travelpercent = (travel/total)*100;
        double foodpercent = (food/total)*100;
        double logisticpercent = (logistics/total)*100;
        System.out.println("Total expenses: " + dc.format(total));
        System.out.println("Branding expenses percentage: " + dc.format(brandpercent));
        System.out.println("Travel expenses percentage: " + dc.format(travelpercent));
        System.out.println("Food expenses percentage: " + dc.format(foodpercent));
        System.out.println("Logistics expenses percentage: " + dc.format(logisticpercent));
    }

}


