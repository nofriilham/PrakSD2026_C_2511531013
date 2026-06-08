package Pekan9_2511531013;
public class BTree_2511531013 {
    private Node_2511531013 root_1013;
    private Node_2511531013 currentNode;

    public BTree_2511531013() {
        root_1013 = null;
    }

    public boolean search(int data_1013) {
        return search(root_1013, data_1013);
    }

    private boolean search(Node_2511531013 node_1013, int data_1013) {
        if (node_1013.getdata_1013() == data_1013)
            return true;
        if (node_1013.getleft_1013() != null)
            if (search(node_1013.getleft_1013(), data_1013))
                return true;
        if (node_1013.getright_1013() != null)
            if (search(node_1013.getright_1013(), data_1013))
                return true;
        return false;
    }

    public void printInorder() {
        root_1013.printInorder(root_1013);
    }

    public void printPreOrder() {
        root_1013.printPreorder(root_1013);
    }

    public void printPostOrder() {
        root_1013.printPostorder(root_1013);
    }

    public Node_2511531013 getRoot() {
        return root_1013;
    }
    public boolean isEmpty() {
    	return root_1013 == null;
    }
    public int countNodes() {
    	return countNodes(root_1013);
    }
    private int countNodes(Node_2511531013 node_1013) {
    	int count_1013 = 1;
    	if (node_1013 == null) {
    		return 0;
    	} else {
    		count_1013 += countNodes(node_1013.getleft_1013());
    		count_1013 += countNodes(node_1013.getright_1013());
    		return count_1013;
    	}
    }
    public void print() {
    	root_1013.print();
    }
    public Node_2511531013 getCurrent() {
    	return currentNode;
    }
    public void setCurrent(Node_2511531013 node_1013) {
    	this.currentNode = node_1013;
    }
    public void setRoot(Node_2511531013 root_1013) {
    	this.root_1013 = root_1013;
    }
}