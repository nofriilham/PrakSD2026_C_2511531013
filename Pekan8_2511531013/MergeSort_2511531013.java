package Pekan8_2511531013;

public class MergeSort_2511531013 {
    void merge(int arr[], int l_1013, int m_1013, int r_1013) {
        // Find sizes of two subarrays to be merged
        int n1_1013 = m_1013 - l_1013 + 1;
        int n2_1013 = r_1013 - m_1013;
        /* Create temp arrays */
        int L_1013[] = new int[n1_1013];
        int R_1013[] = new int[n2_1013];
        /* Copy data to temp arrays */
        for (int i_1013 = 0; i_1013 < n1_1013; ++i_1013)
            L_1013[i_1013] = arr[l_1013 + i_1013];
        for (int j_1013 = 0; j_1013 < n2_1013; ++j_1013)
            R_1013[j_1013] = arr[m_1013 + 1 + j_1013];
        int i_1013 = 0, j_1013 = 0;
        // Initial index of merged subarray array
        int k_1013 = l_1013;
        while (i_1013 < n1_1013 && j_1013 < n2_1013) {
            if (L_1013[i_1013] <= R_1013[j_1013]) {
                arr[k_1013] = L_1013[i_1013];
                i_1013++;
            } else {
                arr[k_1013] = R_1013[j_1013];
                j_1013++;
            }
            k_1013++;
        }
        /* Copy remaining elements of L[] if any */
        while (i_1013 < n1_1013) {
            arr[k_1013] = L_1013[i_1013];
            i_1013++;
            k_1013++;
        }
        /* Copy remaining elements of R[] if any */
        while (j_1013 < n2_1013) {
            arr[k_1013] = R_1013[j_1013];
            j_1013++;
            k_1013++;
        }
    }
    void sort(int arr_1013[], int l_1013, int r_1013) {
        if (l_1013 < r_1013) {
            // Find the middle point
            int m_1013 = (l_1013 + r_1013) / 2;
            // Sort first and second halves
            sort(arr_1013, l_1013, m_1013);
            sort(arr_1013, m_1013 + 1, r_1013);
            // Merge the sorted halves
            merge(arr_1013, l_1013, m_1013, r_1013);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr_1013[]) {
        int n_1013 = arr_1013.length;
        for (int i_1013 = 0; i_1013 < n_1013; ++i_1013)
            System.out.print(arr_1013[i_1013] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr_1013[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut");
        printArray(arr_1013);
        MergeSort_2511531013 ob_1013 = new MergeSort_2511531013();
        ob_1013.sort(arr_1013, 0, arr_1013.length - 1);
        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray(arr_1013);
    }
}