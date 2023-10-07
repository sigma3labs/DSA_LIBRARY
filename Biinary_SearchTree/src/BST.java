// create a binary search tree for the following data {6,8,22,3,7,5,12,10,9,20,35,40,42}

public class BST {
    private static class Node{
        int data;
        Node leftNode;
        Node rightNode;
        Node(int data){
            this.data=data;
            leftNode=null;
            rightNode=null;
        }

    }
    // properties of bst
    int size;
    Node root;
    BST(){
        size=0;
        root=null;
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return (size==0 || root==null);
    }
    public void  addData(int data){

        // create Node class
        Node newNode= new Node(data);
        if (isEmpty()){
            root=newNode;
            size++;
            return;
        }
        // temp Node
        Node tempNode=root;
        while (true){
            if (data<tempNode.data){
                if (tempNode.leftNode==null){
                    tempNode.leftNode=newNode;
                    size++;
                    return;
                }
                tempNode=tempNode.leftNode;
            }
            else {
                if (tempNode.rightNode==null){
                    tempNode.rightNode=newNode;
                    size++;
                    return;
                }
                tempNode=tempNode.rightNode;
            }
        }
    }
    public  void addNodeR(Node node, int data){
        Node node1= new Node(data);
        // if BST is empty
        if (isEmpty()){
            node=node1;
            size++;
            return;
        }
        if (data<node.data){
            addNodeR(node.leftNode,data);
        }
    }
    // preOrder traversing
    public void  preOrder(Node node){
        if (node!=null){
            System.out.print(", "+node.data);
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }
    }
    // postOrder traversing

    public void  postOrder(Node root){
        Node nodeRoot=root;
        if (nodeRoot!=null){
            postOrder(nodeRoot.leftNode); //3
            postOrder(nodeRoot.rightNode);//5
            System.out.print(", "+nodeRoot.data);
        }
    }
    public void inOrder( Node root){
        Node nodeRoot=root;
        if (nodeRoot!=null){

            inOrder(nodeRoot.leftNode);
            System.out.print(" ,"+nodeRoot.data);
            inOrder(nodeRoot.rightNode);

        }
    }

    public static void main(String[] args) {
        BST s1 = new BST();
        s1.addData(6);
        s1.addData(8);
        s1.addData(22);
        s1.addData(3);
        s1.addData(7);
        s1.addData(5);
        s1.addData(12);
        s1.addData(10);
        s1.addData(9);
        s1.addData(20);
        s1.addData(35);
        s1.addData(40);
        s1.addData(42);
        System.out.println("Pre Order");
        s1.preOrder(s1.root);
        System.out.println("\nPost Order");
        s1.postOrder(s1.root);
        System.out.println("\nIn Order");
        s1.inOrder(s1.root);
    }
}
