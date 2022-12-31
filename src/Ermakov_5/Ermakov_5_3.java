package Ermakov_5;

public class Ermakov_5_3 {
    public static StringBuilder printEvenElements(int[] array) {
        StringBuilder evenElements = new StringBuilder();
        for (int element : array) {
            if (element % 2 == 0) {
                evenElements.append(element).append(" ");
            }
        }
        return new StringBuilder("Even elements: " + evenElements);
    }
}
