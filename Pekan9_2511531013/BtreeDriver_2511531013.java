package Pekan9_2511531013;
public class BtreeDriver_2511531013 {
	
    public static void main(String[] args) {
        //Membuat Pohon
        BTree_2511531013 tree_1013 = new BTree_2511531013();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_1013.countNodes());
        //menambahkan simpul data 1
        Node_2511531013 root_1013 = new Node_2511531013(1);
        //menjadikan simpul 1 sebagai root
        tree_1013.setRoot(root_1013);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_1013.countNodes());
        Node_2511531013 node2_1013 = new Node_2511531013(2);
        Node_2511531013 node3_1013 = new Node_2511531013(3);
        Node_2511531013 node4_1013 = new Node_2511531013(4);
        Node_2511531013 node5_1013 = new Node_2511531013(5);
        Node_2511531013 node6_1013 = new Node_2511531013(6);
        Node_2511531013 node7_1013 = new Node_2511531013(7);
        Node_2511531013 node8_1013 = new Node_2511531013(8);
        Node_2511531013 node9_1013 = new Node_2511531013(9);
        root_1013.setleft_1013(node2_1013);
        node2_1013.setleft_1013(node4_1013);
        node2_1013.setright_1013(node5_1013);
        node4_1013.setright_1013(node8_1013);
        root_1013.setright_1013(node3_1013);
        node3_1013.setleft_1013(node6_1013);
        node3_1013.setright_1013(node7_1013);
        node6_1013.setleft_1013(node9_1013);
        //Set root
        tree_1013.setCurrent(tree_1013.getRoot());
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_1013.getCurrent().getdata_1013());
        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree_1013.countNodes());
        System.out.println("InOrder: ");
        tree_1013.printInorder();
        System.out.println("\nPreorder: ");
        tree_1013.printPreOrder();
        System.out.println("\nPostorder : ");
        tree_1013.printPostOrder();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree_1013.print();
    
   }

}