package Pekan6_2511531013;

public class insertDLL_2511531013 {
	// menambah node di awal DLL
	static NodeDLL_2511531013 insertBegin(NodeDLL_2511531013 head_1013, int data_1013) {
		// buat node baru
		NodeDLL_2511531013 new_node_1013 = new NodeDLL_2511531013(data_1013);
		// jadikan pointer nextnya head
		new_node_1013.next_1013 = head_1013;
		// jadikan pointer prev head ke new_node
		if (head_1013 != null) {
			head_1013.prev_1013 = new_node_1013;
		}
		return new_node_1013;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511531013 insertEnd(NodeDLL_2511531013 head_1013, int newData_1013) {
		// buat node baru
		NodeDLL_2511531013 newNode_1013 = new NodeDLL_2511531013(newData_1013);
		// jika dll null jadikan head
		if (head_1013 == null) {
			head_1013 = newNode_1013;
		}
		else {
			NodeDLL_2511531013 curr_1013 = head_1013;
			while (curr_1013.next_1013 != null) {
				curr_1013 = curr_1013.next_1013;
			}
			curr_1013.next_1013 = newNode_1013;
			newNode_1013.prev_1013 = curr_1013;
		}
		return head_1013;
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511531013 insertAtPosition(NodeDLL_2511531013 head_1013, int pos_1013, int new_data_1013) {
	    // buat node baru
	    NodeDLL_2511531013 new_node_1013 = new NodeDLL_2511531013(new_data_1013);
	    if (pos_1013 == 1) {
	        new_node_1013.next_1013 = head_1013;
	        if (head_1013 != null) {
	            head_1013.prev_1013 = new_node_1013;
	        }
	        head_1013 = new_node_1013;
	        return head_1013;
	    }
	    NodeDLL_2511531013 curr_1013 = head_1013;
	    for (int i = 1; i < pos_1013 - 1 && curr_1013 != null; ++i) {
	        curr_1013 = curr_1013.next_1013;
	    }
	    if (curr_1013 == null) {
	        System.out.println("Posisi tidak ada");
	        return head_1013;
	    }
	    new_node_1013.prev_1013 = curr_1013;
	    new_node_1013.next_1013 = curr_1013.next_1013;
	    curr_1013.next_1013 = new_node_1013;
	    if (new_node_1013.next_1013 != null) {
	        new_node_1013.next_1013.prev_1013 = new_node_1013;
	    }
	    return head_1013;
	}

	public static void printList(NodeDLL_2511531013 head_1013) {
	    NodeDLL_2511531013 curr_1013 = head_1013;
	    while (curr_1013 != null) {
	        System.out.print(curr_1013.data_1013 + " <-> ");
	        curr_1013 = curr_1013.next_1013;
	    }
	    System.out.println();
	}
	public static void main(String[] args) {
	    // membuat dll 2 <-> 3 <-> 5
	    NodeDLL_2511531013 head_1013 = new NodeDLL_2511531013(2);
	    head_1013.next_1013 = new NodeDLL_2511531013(3);
	    head_1013.next_1013.prev_1013 = head_1013;
	    head_1013.next_1013.next_1013 = new NodeDLL_2511531013(5);
	    head_1013.next_1013.next_1013.prev_1013 = head_1013.next_1013;
	    // cetak DLL awal
	    System.out.print("DLL Awal: ");
	    printList(head_1013);
	    // tambah 1 di awal
	    head_1013 = insertBegin(head_1013, 1);
	    System.out.print(
	            "simpul 1 ditambah di awal: ");
	    printList(head_1013);
	    // tambah 6 di akhir
	    System.out.print(
	            "simpul 6 ditambah di akhir: ");
	    int data_1013 = 6;
	    head_1013 = insertEnd(head_1013, data_1013);
	    printList(head_1013);
	    // menambah node 4 di posisi 4
	    System.out.print("tambah node 4 di posisi 4: ");
	    int data2_1013 = 4;
	    int pos_1013 = 4;
	    head_1013 = insertAtPosition(head_1013, pos_1013, data2_1013);
	    printList(head_1013);
	}
}