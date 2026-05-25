package Pekan8_2511531013;

public class ShellSort_2511531013 {
	
	public static void ShellSort_2511531013(int[]A_1013) {
		int n_1013=A_1013.length;
		int gap_1013=n_1013/2;
		while (gap_1013>0) {
			for(int i_1013=gap_1013;i_1013<n_1013;i_1013++) {
				int temp_1013=A_1013[i_1013];
				int j_1013=i_1013;
				while (j_1013>=gap_1013&&A_1013 [j_1013-gap_1013]>temp_1013) {
					A_1013[j_1013]=A_1013[j_1013-gap_1013];
					j_1013=j_1013-gap_1013;
				}
				A_1013[j_1013]=temp_1013;
			}
			gap_1013=gap_1013-2;
		}
	}
	public static void main(String[]args) {
		int []data_1013= {3,10,4,6,8,9,7,2,1,5};
		System.out.print("Sebelum: ");
		printArray(data_1013);
		ShellSort_2511531013(data_1013);
			System.out.print("Sesudah (ShellSort):  ");
			printArray(data_1013);
		}
	private static void printArray(int[] arr_1013) {
		for(int i_1013 :arr_1013)System.out.print(i_1013+" ");
		System.out.println();
		
	}
	}


