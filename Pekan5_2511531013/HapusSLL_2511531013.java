package Pekan5_2511531013;
public class HapusSLL_2511531013 {
    // fungsi untuk menghapus head
    public static NodeSLL_2511531013 deleteHead(NodeSLL_2511531013 head) {
        // jika SLL kosong
        if (head == null)
            return null;
        // pindahkan head ke node berikutnya
        head = head.next_1013;
        // Return head baru
        return head;
    }
    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511531013 removeLastNode(NodeSLL_2511531013 head) {
        // jika list kosong, return null
        if (head == null) {
            return null;
        }
        //jika list satu node, hapus node dan return null
        if (head.next_1013 == null) {
            return null;
        }
        //temukan node terakhir ke dua
        NodeSLL_2511531013 secondLast = head;
        while (secondLast.next_1013.next_1013 != null) {
            secondLast = secondLast.next_1013;
        }
        // hapus node terakhir
        secondLast.next_1013 = null;
        return head;
    }
    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511531013 deleteNode(NodeSLL_2511531013 head, int position) {
        NodeSLL_2511531013 temp_1013 = head;
        NodeSLL_2511531013 prev_1013 = null;
        // jika linked list null
        if (temp_1013 == null)
            return head;
        // kasus 1: head dihapus
        if (position == 1) {
            head = temp_1013.next_1013;
            return head;    }
        // kasus 2: menghapus node di tengah
        // telusuri ke node yang dihapus
        for (int i_1013 = 1; temp_1013 != null && i_1013 < position; i_1013++) {
            prev_1013 = temp_1013;
            temp_1013 = temp_1013.next_1013;   }
        // jika ditemukan, hapus node
        if (temp_1013 != null) {
            prev_1013.next_1013 = temp_1013.next_1013;
        } else {
            System.out.println("Data tidak ada");        }
        return head;    }
    // fungsi mencetak SLL
    public static void printList(NodeSLL_2511531013 head) {
        NodeSLL_2511531013 curr_1013 = head;
        while (curr_1013.next_1013 != null) {
            System.out.print(curr_1013.data_1013+"-->");
            curr_1013 = curr_1013.next_1013;       }
        if (curr_1013.next_1013==null) {
            System.out.print(curr_1013.data_1013);    }
        System.out.println(); }
    //kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5-> 6 -> null
        NodeSLL_2511531013 head_1013 = new NodeSLL_2511531013(1);
        head_1013.next_1013 = new NodeSLL_2511531013(2);
        head_1013.next_1013.next_1013 = new NodeSLL_2511531013(3);
        head_1013.next_1013.next_1013.next_1013 = new NodeSLL_2511531013(4);
        head_1013.next_1013.next_1013.next_1013.next_1013 = new NodeSLL_2511531013(5);
        head_1013.next_1013.next_1013.next_1013.next_1013.next_1013 = new NodeSLL_2511531013(6);
        // cetak list awal
        System.out.println("list awal: ");
        printList(head_1013);
        // hapus head
        head_1013 = deleteHead(head_1013);
        System.out.println("List setelah head dihapus: ");
        printList(head_1013);
        //hapus node terakhir
        head_1013 = removeLastNode(head_1013);
        System.out.println("List setelah simpul terakhir di hapus: ");
        printList(head_1013);
        // Deleting node at position 2
        int position = 2;
        head_1013 = deleteNode(head_1013, position);
        // Print list after deletion
        System.out.println("List setelah posisi 2 dihapus: ");
        printList(head_1013);
    }
    
}