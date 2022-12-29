package Ermakov_4;

import java.util.Scanner;

public class Ermakov_4_8 {
    public static void findEven() {
        greetings();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true) {
                userInput = scanner.nextLine();
                if (userInput.equals("end")) {
                    break;
                }
            try {
                System.out.println(evenOrOdd(Integer.parseInt(userInput)));
            } catch (NumberFormatException e) {
                System.out.println("You didn't enter a number or \"end\". Try again");
            }
        }
    }

    private static String evenOrOdd (int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    private static void greetings() {
        System.out.println("Hi! Start entering the numbers. If you want to end just enter \"end\".");
    }
}
