package Pekan5_2511531013;

public class TambahSLL_2511531013 {

    // tambah di depan
    public static NodeSLL_2511531013 insertAtFront(NodeSLL_2511531013 head_1013, int value_1013) {
        NodeSLL_2511531013 new_node_1013 = new NodeSLL_2511531013(value_1013);
        new_node_1013.next_1013 = head_1013;
        return new_node_1013;
    }

    // tambah di akhir
    public static NodeSLL_2511531013 insertAtEnd(NodeSLL_2511531013 head_1013, int value_1013) {
        NodeSLL_2511531013 newNode_1013 = new NodeSLL_2511531013(value_1013);

        if (head_1013 == null) {
            return newNode_1013;
        }

        NodeSLL_2511531013 last_1013 = head_1013;

        while (last_1013.next_1013 != null) {
            last_1013 = last_1013.next_1013;
        }

        last_1013.next_1013 = newNode_1013;
        return head_1013;
    }

    static NodeSLL_2511531013 getNode(int data_1013) {
        return new NodeSLL_2511531013(data_1013);
    }

    static NodeSLL_2511531013 insertPos(NodeSLL_2511531013 headNode_1013, int position_1013, int value_1013) {

        NodeSLL_2511531013 head_1013 = headNode_1013;

        if (position_1013 < 1) {
            System.out.println("Invalid position");
            return head_1013;
        }

        if (position_1013 == 1) {
            NodeSLL_2511531013 new_node_1013 = new NodeSLL_2511531013(value_1013);
            new_node_1013.next_1013 = head_1013;
            return new_node_1013;
        } else {
            while (position_1013-- != 0) {

                if (position_1013 == 1) {
                    NodeSLL_2511531013 newNode_1013 = getNode(value_1013);
                    newNode_1013.next_1013 = headNode_1013.next_1013;
                    headNode_1013.next_1013 = newNode_1013;
                    break;
                }

                headNode_1013 = headNode_1013.next_1013;

                if (headNode_1013 == null) {
                    System.out.println("Posisi di luar jangkauan");
                    break;
                }
            }
        }
        return head_1013;
    }

    public static void printList_1013(NodeSLL_2511531013 head_1013) {
        NodeSLL_2511531013 curr_1013 = head_1013;

        while (curr_1013 != null) {
            if (curr_1013.next_1013 != null) {
                System.out.print(curr_1013.data_1013 + " --> ");
            } else {
                System.out.print(curr_1013.data_1013);
            }
            curr_1013 = curr_1013.next_1013;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // buat linked list 2->3->5->6
        NodeSLL_2511531013 head_1013 = new NodeSLL_2511531013(2);

        head_1013.next_1013 = new NodeSLL_2511531013(3);
        head_1013.next_1013.next_1013 = new NodeSLL_2511531013(5);
        head_1013.next_1013.next_1013.next_1013 = new NodeSLL_2511531013(6);

        // cetak list awal
        System.out.print("Senarai berantai awal: ");
        printList_1013(head_1013);

        // tambah di depan
        System.out.print("Tambah 1 simpul di depan: ");
        int data_1013 = 1;
        head_1013 = insertAtFront(head_1013, data_1013);
        printList_1013(head_1013);

        // tambah di belakang
        System.out.print("Tambah 1 simpul di belakang: ");
        int data2_1013 = 7;
        head_1013 = insertAtEnd(head_1013, data2_1013);
        printList_1013(head_1013);

        // tambah di posisi tertentu
        System.out.print("Tambah 1 simpul ke data 4: ");
        int data3_1013 = 4;
        int pos_1013 = 4;
        head_1013 = insertPos(head_1013, pos_1013, data3_1013);
        printList_1013(head_1013);
    }
}