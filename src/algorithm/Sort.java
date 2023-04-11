package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

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
        int[] list = array;
        //implement here
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
        int[] list = array;
        //implement here

        if (list.length > 1) {
            int mid = list.length / 2;
            int[] left = Arrays.copyOfRange(list, 0, mid);
            int[] right = Arrays.copyOfRange(list, mid, list.length);
            mergeSort(left);
            mergeSort(right);
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    list[k++] = left[i++];
                } else {
                    list[k++] = right[j++];
                }
            }
            while (i < left.length) {
                list[k++] = left[i++];
            }
            while (j < right.length) {
                list[k++] = right[j++];
            }
        }

        return list;
    }


    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
