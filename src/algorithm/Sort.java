package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;

    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public void selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = Arrays.copyOf(array, array.length);

        for (int j = 0; j < list.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < list.length; i++) {
                if (list[i] < list[min])
                    min = i;
            }

            int temp = list[min];
            list[min] = list[j];
            list[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = Arrays.copyOf(array, array.length);

        for (int i = 1; i < list.length; i++) {
            int key = list[i];

            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = Arrays.copyOf(array, array.length);

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }

        return list;
    }

    public int[] mergeSort(int[] array) {
        int[] list = Arrays.copyOf(array, array.length);

        mergeSort(list, 0, list.length - 1);

        return list;
    }

    private void mergeSort(int[] list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private void merge(int[] list, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(list, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(list, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                list[k++] = leftArray[i++];
            } else {
                list[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            list[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            list[k++] = rightArray[j++];
        }
    }
}



