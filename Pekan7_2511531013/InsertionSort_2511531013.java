package Pekan7_2511531013;

public class InsertionSort_2511531013 {
	public static void InsertionSort_2511531013(int[] arr) {
		int n_1013 = arr.length;
		for (int i_1013 = 1; i_1013 < n_1013; i_1013++) {
			int key_1013 = arr[i_1013];
			int j_1013 = i_1013 - 1;
			while (j_1013 >= 0 && arr[j_1013] > key_1013) {
				arr[j_1013 + 1] = arr[j_1013];
				j_1013--;
			}
			arr[j_1013 + 1] = key_1013;
		}
	}

	public static void main(String[] args) {
		int arr_1013[] = {23, 78, 45, 0, 32, 56, 1 };
		int n_1013 = arr_1013.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_1013 = 0; i_1013 < n_1013; i_1013++)
			System.out.print(arr_1013[i_1013] + " ");
			System.out.println("");
		InsertionSort_2511531013(arr_1013);
		System.out.printf("array yang terurut:\n");
		for (int i_1013 = 0; i_1013 < n_1013; i_1013++)
			System.out.print(arr_1013[i_1013] + " ");
		System.out.println("");
		
	}

}