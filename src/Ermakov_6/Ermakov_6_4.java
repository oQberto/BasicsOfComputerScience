package Ermakov_6;

public class Ermakov_6_4 {
    
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return null;
        }

        int temp = array.length / 2;
        int[] leftArray = new int[temp];
        int[] rightArray = new int[array.length - temp];

        System.arraycopy(array, 0, leftArray, 0, temp);
        if (array.length - temp >= 0){
            System.arraycopy(array, temp, rightArray, 0, array.length - temp);
        }
            mergeSort(leftArray);
            mergeSort(rightArray);

        merge(leftArray, rightArray, array);
        return array;
    }
    
    private static void merge(int[] firstHalf, int[] secondHalf, int[] originalArray) {
        int firstHalfMinIndex = 0;
        int secondHalfMinIndex = 0;
        int originalArrayMinIndex = 0;

        while (firstHalfMinIndex < firstHalf.length && secondHalfMinIndex < secondHalf.length) {
            if (firstHalf[firstHalfMinIndex] <= secondHalf[secondHalfMinIndex]) {
                originalArray[originalArrayMinIndex] = firstHalf[firstHalfMinIndex];
                firstHalfMinIndex++;
            } else {
                originalArray[originalArrayMinIndex] = secondHalf[secondHalfMinIndex];
                secondHalfMinIndex++;
            }
            originalArrayMinIndex++;
        }

        while (firstHalfMinIndex < firstHalf.length) {
            originalArray[originalArrayMinIndex] = firstHalf[firstHalfMinIndex];
            firstHalfMinIndex++;
            originalArrayMinIndex++;
        }

        while (secondHalfMinIndex < secondHalf.length) {
            originalArray[originalArrayMinIndex] = secondHalf[secondHalfMinIndex];
            secondHalfMinIndex++;
            originalArrayMinIndex++;
        }
    }
}
