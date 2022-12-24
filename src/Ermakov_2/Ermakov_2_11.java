package Ermakov_2;

import java.util.Scanner;

public class Ermakov_2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arguments");
        int arg1 = scanner.nextInt();
        int arg2 = scanner.nextInt();
        int arg3 = scanner.nextInt();

        double dis = Math.pow(arg2, 2) - 4 * arg1 * arg3;

        if (dis > 0) {
            double x1 = ((-1) * arg2 + Math.sqrt(dis)) / (2 * arg1);
            double x2 = ((-1) * arg2 - Math.sqrt(dis)) / (2 * arg1);

            System.out.println("Equation has 2 roots: " + "\n" +
                                "X1  = " + x1 + "\n" +
                                "X2 = " + x2 + "\n");
        } else if (dis == 0) {
            double x1 = (double) ((-1) * arg2) / (2 * arg1);
            System.out.println("Equation has only 1 root: " + "\n" +
                    "X1 = " + x1);
        } else {
            System.out.println("Equation hasn't got the roots");
        }
    }
}
