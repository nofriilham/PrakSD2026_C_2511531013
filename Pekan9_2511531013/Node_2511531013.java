package Pekan9_2511531013;

public class Node_2511531013 {
    int data_1013;
    Node_2511531013 left_1013;
    Node_2511531013 right_1013;

    public Node_2511531013(int data_1013) {
        this.data_1013 = data_1013;
        left_1013 = null;
        right_1013 = null;
    }

    public void setleft_1013(Node_2511531013 node) {
        if (left_1013 == null)
            left_1013 = node;
    }

    public void setright_1013(Node_2511531013 node) {
        if (right_1013 == null)
            right_1013 = node;
    }

    public Node_2511531013 getleft_1013() {
        return left_1013;
    }

    public Node_2511531013 getright_1013() {
        return right_1013;
    }

    public int getdata_1013() {
        return data_1013;
    }

    public void setdata_1013(int data_1013) {
        this.data_1013 = data_1013;
    }

    void printPreorder(Node_2511531013 node) {
        if (node == null)
            return;
        System.out.print(node.data_1013 + " ");
        printPreorder(node.left_1013);
        printPreorder(node.right_1013);
    }

    void printPostorder(Node_2511531013 node) {
        if (node == null)
            return;
        printPostorder(node.left_1013);
        printPostorder(node.right_1013);
        System.out.print(node.data_1013 + " ");
    }

    void printInorder(Node_2511531013 node) {
        if (node == null)
            return;
        printInorder(node.left_1013);
        System.out.print(node.data_1013 + " ");
        printInorder(node.right_1013);
    }

    public String print() {
        return this.print("", true, "");
    }

    public String print(String prefix, boolean isTail, String sb) {
        if (right_1013 != null) {
            right_1013.print(prefix + (isTail ? "|   " : "    "), false, sb);
        }
        System.out.println(prefix + (isTail ? "\\-- " : "/-- ") + data_1013);
        if (left_1013 != null) {
            left_1013.print(prefix + (isTail ? "    " : "|   "), true, sb);
        }
        return sb;
    }
}