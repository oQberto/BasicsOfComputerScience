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
    
    private static void merge(int[] array1, int[] array2, int[] targetArray) {
        int array1MinIndex = 0;
        int array2MinIndex = 0;
        int targetArrayMinIndex = 0;

        while (array1MinIndex < array1.length && array2MinIndex < array2.length) {
            if (array1[array1MinIndex] <= array2[array2MinIndex]) {
                targetArray[targetArrayMinIndex] = array1[array1MinIndex];
                array1MinIndex++;
            } else {
                targetArray[targetArrayMinIndex] = array2[array2MinIndex];
                array2MinIndex++;
            }
            targetArrayMinIndex++;
        }

        while (array1MinIndex < array1.length) {
            targetArray[targetArrayMinIndex] = array1[array1MinIndex];
            array1MinIndex++;
            targetArrayMinIndex++;
        }

        while (array2MinIndex < array2.length) {
            targetArray[targetArrayMinIndex] = array2[array2MinIndex];
            array2MinIndex++;
            targetArrayMinIndex++;
        }
    }
}
