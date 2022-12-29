package Ermakov_4;

public class Ermakov_4_5 {
    public static int findFactorial(int n) {
        int factorial = 1;
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                factorial *= i;
            }
        }
        return factorial;
    }
}