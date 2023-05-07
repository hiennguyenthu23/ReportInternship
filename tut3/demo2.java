package tut3;

import java.util.Scanner;

public class demo2 {
    int demoA;
    int demoB;
    int demoC;

    public demo2() {
    }

    public demo2(int demoA, int demoB, int demoC) {
        super();
        this.demoA = demoA;
        this.demoB = demoB;
        this.demoC = demoC;
    }

    public int getDemoA() {
        return demoA;
    }

    public void setDemoA(int demoA) {
        this.demoA = demoA;
    }

    public int getDemoB() {
        return demoB;
    }

    public void setDemoB(int demoB) {
        this.demoB = demoB;
    }

    public int getDemoC() {
        return demoC;
    }

    public void setDemoC(int demoC) {
        this.demoC = demoC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        demo2 dc1 = new demo2();
        System.out.println("enter value of the first numner");
        int a = sc.nextInt();
        dc1.setDemoA(a);
        System.out.println("enter value of the second numner");
        int b = sc.nextInt();
        dc1.setDemoB(b);
        System.out.println("enter value of the third numner");
        int c = sc.nextInt();
        dc1.setDemoC(c);
        System.out.println("without parameters constructor");
        System.out.println("DemoA: " + dc1.getDemoA());
        System.out.println("DemoB: " + dc1.getDemoB());
        System.out.println("DemoC: " + dc1.getDemoC());
        demo2 dc2 = new demo2(100, 200, 300);
        System.out.println("with parameters constructor");
        System.out.println("DemoA: " + dc2.getDemoA());
        System.out.println("DemoB: " + dc2.getDemoB());
        System.out.println("DemoC: " + dc2.getDemoC());
    }
}