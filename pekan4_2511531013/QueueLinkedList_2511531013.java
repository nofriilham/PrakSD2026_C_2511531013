package pekan4_2511531013;
import java.util.*;
public class QueueLinkedList_2511531013 {

	public static void main(String[] args) {
		Queue<Integer>q_1013=new LinkedList<>();
		//tambah elemen {0,1,2,3,4,5} ke antian
		for (int i_1013=0;i_1013<6;i_1013++)
			q_1013.add(i_1013);
		//Menampilkan isi antrian
		System.out.println("Elemen Antrian"+q_1013);
		//Untuk menghapus kepala antrian.
		int hapus=q_1013.remove();
		System.out.println("Hapus  elemen=" + hapus);
		System.out.println(q_1013);
		//untuk melhat antrian terdepan
		int depan=q_1013.peek();
		System.out.println("Kepala Antrian= " + depan);
		int banyak=q_1013.size();
		System.out.println("Size Antrian = "+ banyak);
				
	}

}
