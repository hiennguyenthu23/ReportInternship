package Tut1;

public class calculator {
    int a1 = 20;
    int b2 = 30;
    void add() {
        int sum = a1 + b2;
        System.out.println("sum is " + sum);
    }
    void div() {
        int div = a1/b2;
        System.out.println("division is " + div);
    }
    void mul() {
        int mul = a1*b2;
        System.out.println("mulply " + mul);
    }
    public static void main(String[] args) {
        calculator ob1 = new calculator();
        ob1.add();
        ob1.div();
        ob1.mul();
    }
}
