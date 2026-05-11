package Pekan6_2511531013;
public class HapusDLL_2511531013 {
    // fungsi menghapus node awal
    public static NodeDLL_2511531013 delHead(NodeDLL_2511531013 head_1013) {
        if (head_1013 == null) {
            return null;    }
        NodeDLL_2511531013 temp_1013 = head_1013;
        head_1013 = head_1013.next_1013;
        if (head_1013 != null) {
            head_1013.prev_1013 = null;    }
        return head_1013;
    }
    // fungsi menghapus di akhir
    public static NodeDLL_2511531013 delLast(NodeDLL_2511531013 head_1013) {
        if (head_1013 == null) {
            return null;    }
        if (head_1013.next_1013 == null) {
            return null;    }
        NodeDLL_2511531013 curr_1013 = head_1013;
        while (curr_1013.next_1013 != null) {
            curr_1013 = curr_1013.next_1013;
        }
        // update pointer previous node
        if (curr_1013.prev_1013 != null) {
            curr_1013.prev_1013.next_1013 = null;    }
        return head_1013;
    }
 // fungsi menghapus node posisi tertentu
    public static NodeDLL_2511531013 delPos(NodeDLL_2511531013 head_1013, int pos_1013) {
        // jika DLL kosong
        if (head_1013 == null) {
            return head_1013; }
        NodeDLL_2511531013 curr_1013 = head_1013;
        // telusuri sampai ke node yang akan dihapus
        for (int i = 1; curr_1013 != null && i < pos_1013; ++i) {
            curr_1013 = curr_1013.next_1013;
        }
        // jika posisi tidak ditemukan
        if (curr_1013 == null) {
            return head_1013; }
        // Update pointer
        if (curr_1013.prev_1013 != null) {
            curr_1013.prev_1013.next_1013= curr_1013.next_1013; }
        if (curr_1013.next_1013 != null) {
            curr_1013.next_1013.prev_1013 = curr_1013.prev_1013; }
        // jika yang dihapus head
        if (head_1013 == curr_1013) {
            head_1013 = curr_1013.next_1013; }
        return head_1013;
    }

    // fungsi mencetak DLL
    public static void printList(NodeDLL_2511531013 head_1013) {
        NodeDLL_2511531013 curr_1013 = head_1013;
        while (curr_1013 != null) {
            System.out.print(curr_1013.data_1013 + " <-> ");
            curr_1013 = curr_1013.next_1013;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat sebuah DLL
        NodeDLL_2511531013 head_1013 = new NodeDLL_2511531013(1);
        head_1013.next_1013 = new NodeDLL_2511531013(2);
        head_1013.next_1013.prev_1013 = head_1013;
        head_1013.next_1013.next_1013 = new NodeDLL_2511531013(3);
        head_1013.next_1013.next_1013.prev_1013 = head_1013.next_1013;
        head_1013.next_1013.next_1013.next_1013 = new NodeDLL_2511531013(4);
        head_1013.next_1013.next_1013.next_1013.prev_1013 = head_1013.next_1013.next_1013;
        head_1013.next_1013.next_1013.next_1013.next_1013 = new NodeDLL_2511531013(5);
        head_1013.next_1013.next_1013.next_1013.next_1013.prev_1013 = head_1013.next_1013.next_1013.next_1013;

        System.out.print("DLL Awal: ");
        printList(head_1013);

        System.out.print("Setelah head dihapus: ");
        head_1013 = delHead(head_1013);
        printList(head_1013);

        System.out.print("Setelah node terakhir dihapus: ");
        head_1013 = delLast(head_1013);
        printList(head_1013);

        System.out.print("menghapus node ke 2: ");
        head_1013 = delPos(head_1013, 2);

        printList(head_1013);
    }
}