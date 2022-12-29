package Ermakov_4;

public class Ermakov_4_1 {
    public static void whileLoop() {
        int count = 0;
        while (count <= 100) {
            System.out.print(count + " ");
            count++;
        }
    }

    public static void doWhileLoop() {
        int count = 0;
        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 100);
    }

    public static void forLoop() {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
