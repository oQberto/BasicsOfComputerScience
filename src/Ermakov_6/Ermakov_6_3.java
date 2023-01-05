package Ermakov_6;

public class Ermakov_6_3 {
    public static void bubbleSort(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }

        if (count > 0) {
            bubbleSort(array);
        }
    }
}