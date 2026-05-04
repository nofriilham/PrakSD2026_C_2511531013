package Pekan5_2511531013;

public class PencarianSLL_2511531013 {
	static boolean searchKey (NodeSLL_2511531013 head, int Key) {
		NodeSLL_2511531013 curr_1013= head;
		while (curr_1013 != null) {
			if(curr_1013.data_1013==Key)
				return true;
			curr_1013=curr_1013.next_1013; }
		return false; }
	public static void traversal (NodeSLL_2511531013 head) {
		//mulai dari head
		NodeSLL_2511531013 curr_1013=head;
		//telusuri sampai pointer null
		while (curr_1013 != null) {
			System.out.print(" " + curr_1013.data_1013);
			curr_1013 = curr_1013.next_1013;}
		System.out.println(); }
		
		public static void main (String[] args) {
			NodeSLL_2511531013 head_1013 = new NodeSLL_2511531013(14);
			head_1013.next_1013 = new NodeSLL_2511531013(21);
			head_1013.next_1013.next_1013 = new NodeSLL_2511531013(13);
			head_1013.next_1013.next_1013.next_1013 = new NodeSLL_2511531013(30);
			head_1013.next_1013.next_1013.next_1013.next_1013= new NodeSLL_2511531013(10);
			System.out.print("Penelesuran SLL : ");
			traversal (head_1013);
			//data yang akan dicari
			int Key=30;
			System.out.print("cari data " +Key+ " = ");
			if (searchKey(head_1013, Key))
				System.out.println("Ketemu");
			else 
				System.out.println("Tidak ada");
		}
		
		}