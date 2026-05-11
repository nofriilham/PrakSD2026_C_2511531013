package Pekan6_2511531013;
public class PenelusuranDLL_2511531013 {
    //fungsi penelusuran maju
    static void forwardTraversal(NodeDLL_2511531013 head_1013) {
        // memulai penelusuran dari head
        NodeDLL_2511531013 curr_1013 = head_1013;
        //lanjutkan sampai akhir
        while (curr_1013 != null) {
            //print data
            System.out.print(curr_1013.data_1013 + " <-> ");
            //pindah ke node berikutnya
            curr_1013 = curr_1013.next_1013;
        }
        //print spasi
        System.out.println();
    }
    // fungsi penelusuran mundur
    static void backwardTraversal(NodeDLL_2511531013 tail_1013) {
        // mulai dari akhir
        NodeDLL_2511531013 curr_1013 = tail_1013;
        //lanjut sampai head
        while (curr_1013 != null) {
            //cetak data
            System.out.print(curr_1013.data_1013 + " <-> ");
            // pindah ke node sebelumnya
            curr_1013 = curr_1013.prev_1013;
        }
        // cetak spasi
        System.out.println();
    }
    public static void main(String[] args) {
        // cetak DLL
        NodeDLL_2511531013 head_1013 = new NodeDLL_2511531013(1);
        NodeDLL_2511531013 second_1013 = new NodeDLL_2511531013(2);
        NodeDLL_2511531013 third_1013 = new NodeDLL_2511531013(3);

        head_1013.next_1013 = second_1013;
        second_1013.prev_1013 = head_1013;
        second_1013.next_1013 = third_1013;
        third_1013.prev_1013 = second_1013;

        System.out.println("Penelusuran maju:");
        forwardTraversal(head_1013);

        System.out.println("Penelusuran mundur:");
        backwardTraversal(third_1013);
    }
}