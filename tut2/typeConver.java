package tut2;

public class typeConver {
    public static void main(String[] args) {
        int t = 2147255453;
        System.out.println("int: " + t);
        short st = 1000;
        System.out.println("short_st: " + st);
        t = st;
        System.out.println("short_t: " + t);
        st = (short) t;
        
    }
}
