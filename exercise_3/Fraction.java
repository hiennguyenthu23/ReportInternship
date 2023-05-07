package exercise_3;

public class Fraction{
    public static void printValue(int num, int den) {
        boolean check = true;
        int temp = 1;
        int count = 0;
        String fractionPart = "0";
        String result = "";
        while (check == true) {
            if (num == 0) {
                break;
            }

            if (num > den) {
                num = num - den;
                count++;
            } else if (num < den) {
                for (int i = num; i > 1; i--) {
                    if ((num % i == 0) && (den % i == 0)) {
                        temp = i;
                        break;
                    }
                }
                fractionPart = (num / temp) + "/" + (den / temp);
                check = false;
            } else {
                count++;
                check = false;
            }
        }

        if (count == 0) {
            result = fractionPart;
        } else if (fractionPart.equals("0")) {
            result = String.valueOf(count);
        } else if (count != 0 && !(fractionPart.equals("0"))) {
            result = String.valueOf(count) + " " + fractionPart;
        }

        System.out.println(result);
    }
}
