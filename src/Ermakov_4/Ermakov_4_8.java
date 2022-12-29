package Ermakov_4;

import java.util.Scanner;

public class Ermakov_4_8 {
    public static void findEven() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                break;
            }
            System.out.println(evenOrOdd(Integer.parseInt(userInput)));
        }
    }

    private static String evenOrOdd (int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }
}
