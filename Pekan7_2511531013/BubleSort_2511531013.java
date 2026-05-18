package Pekan7_2511531013;
public class BubleSort_2511531013 {

	public static void BubleSort_2511531013 ( int[]arr){
		int n_1013= arr.length;
		for (int i_1013 =0 ;i_1013 < n_1013;i_1013++) {
			for(int j_1013 =0;j_1013<n_1013-i_1013-1;j_1013++) {
				if(arr[j_1013]> arr[j_1013+1]) {
					int temp_1013=arr[j_1013];
					arr[j_1013]=arr[j_1013+1];
					arr[j_1013+1]=temp_1013;
					//System.out.println("data:"arr[j_1013]+ " " + arr[j_1013+1];
				}
			}	
		}
	}	public static void main(String[]args) {
		int arr_1013[]= {23,78,45,8,32,56,1};
		int n_1013=arr_1013.length;
		System.out.printf("Array yang belum terurut:\n");
		for(int i_1013=0;i_1013<n_1013;i_1013++) 
			System.out.print(arr_1013[i_1013]+ " ");
		System.out.println("");
		BubleSort_2511531013(arr_1013);
		System.out.printf("Array yang terurut:\n");
		for (int i_1013=0;i_1013<n_1013;i_1013++)
			System.out.print(arr_1013[i_1013]+ " ");
		System.out.println(" ");	
		
		}
	}