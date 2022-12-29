package Ermakov_4;

import java.util.ArrayList;

public class Ermaokv_4_7 {
    public static ArrayList<Integer> fibonacciNumbers(int countOfNumbers) {
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();

        for (int i = 0; i < countOfNumbers; i++) {
            if (i < 2) {
                fibonacciNumbers.add(i);
            } else {
                fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
            }
        }
        return fibonacciNumbers;
    }
}
