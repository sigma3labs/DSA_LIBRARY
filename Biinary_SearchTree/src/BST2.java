// create a binary search tree for following data {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,p
public class BST2 {

    private static class Node{
        char data;
        Node leftNode;
        Node rightNode;
        Node(char data){
            this.data=data;
            leftNode=null;
            rightNode=null;
        }

    }
    // properties of bst
    int size;
    Node root;
    BST2(){
        size=0;
        root=null;
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return (size==0 || root==null);
    }
    public void  addData(char data){

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
            int intdata=data;
            if (intdata<tempNode.data){
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
        BST2 s1 = new BST2();
        s1.addData('A');
        s1.addData('B');
        s1.addData('C');
        s1.addData('D');
        s1.addData('E');
        s1.addData('F');
        s1.addData('G');
        s1.addData('H');
        s1.addData('I');
        s1.addData('J');
        s1.addData('K');
        s1.addData('L');
        s1.addData('M');
        s1.addData('N');
        s1.addData('O');
        s1.addData('P');


        s1.preOrder(s1.root);
        System.out.println(" ");
        s1.postOrder(s1.root);
        System.out.println(" ");
        s1.inOrder(s1.root);

    }
}

