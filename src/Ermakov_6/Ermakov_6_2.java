package Ermakov_6;

public class Ermakov_6_2 {

    public static void quickSort(int[] array, int firstElement, int endElement) {
        if (array.length == 0) {
            return;
        }
        if (firstElement >= endElement) {
            return;
        }

        int pivot = array[firstElement + (endElement - firstElement) / 2];
        int i = firstElement;
        int j = endElement;

        while (i <= j) {
            while (array[i] > pivot) {
                i++;
            }
            while (array[j] < pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (firstElement < i) {
            quickSort(array, firstElement, j);
        }
        if (endElement > j) {
            quickSort(array, i, endElement);
        }
    }
}
