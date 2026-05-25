package Pekan8_2511531013;

public class QuickSort_2511531013 {

    static void swap(int[] arr_1013, int i_1013, int j_1013) {
        int temp_1013 = arr_1013[i_1013];
        arr_1013[i_1013] = arr_1013[j_1013];
        arr_1013[j_1013] = temp_1013;
    }

    static void medianOfThree(int[] arr_1013, int low_1013, int high_1013) {
        int mid_1013 = low_1013 + (high_1013 - low_1013) / 2;

        if (arr_1013[low_1013] > arr_1013[mid_1013]) {
            swap(arr_1013, low_1013, mid_1013);
        }

        if (arr_1013[low_1013] > arr_1013[high_1013]) {
            swap(arr_1013, low_1013, high_1013);
        }

        if (arr_1013[mid_1013] > arr_1013[high_1013]) {
            swap(arr_1013, mid_1013, high_1013);
        }

        swap(arr_1013, mid_1013, high_1013);
    }

    static int partition(int[] arr_1013, int low_1013, int high_1013) {
        medianOfThree(arr_1013, low_1013, high_1013);

        int pivot_1013 = arr_1013[high_1013];
        int i_1013 = low_1013 - 1;

        for (int j_1013 = low_1013; j_1013 <= high_1013 - 1; j_1013++) {
            if (arr_1013[j_1013] < pivot_1013) {
                i_1013++;
                swap(arr_1013, i_1013, j_1013);
            }
        }
        swap(arr_1013, i_1013 + 1, high_1013);
        return i_1013 + 1;
    }

    static void quickSort(int[] arr_1013, int low_1013, int high_1013) {
        if (low_1013 < high_1013) {
            int pi_1013 = partition(arr_1013, low_1013, high_1013);

            quickSort(arr_1013, low_1013, pi_1013 - 1);
            quickSort(arr_1013, pi_1013 + 1, high_1013);
        }
    }
    public static void printArr(int[] arr_1013) {
        for (int i_1013 = 0; i_1013 < arr_1013.length; i_1013++) {
            System.out.print(arr_1013[i_1013] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr_1013 = {10, 7, 8, 9, 1, 5};
        int N_1013 = arr_1013.length;

        System.out.print("Data sebelum diurutkan: ");
        printArr(arr_1013);

        quickSort(arr_1013, 0, N_1013 - 1);

        System.out.print("Data terurut quicksort: ");
        printArr(arr_1013);
    }
}