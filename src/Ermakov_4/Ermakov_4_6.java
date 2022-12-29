package Ermakov_4;

public class Ermakov_4_6 {
    public static String isPrimeOrComposite(int userNum) {
        int count = 0;
        for (int i = 1; i <= userNum; i++) {
            if (userNum % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return "The number is prime";
        } else {
            return "The number is composite";
        }
    }
}
