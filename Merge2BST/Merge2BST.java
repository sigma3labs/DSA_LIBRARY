import java.util.*;
public class Merge2BST{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static Node merge(Node root1,Node root2){
		ArrayList<Integer> inorder1= new ArrayList<>();
		getinorderTraversal(root1,inorder1);
		ArrayList<Integer> inorder2= new ArrayList<>();
		getinorderTraversal(root2,inorder2);
		ArrayList<Integer> arr= new ArrayList<>();
		int i=0;
		int j=0;
		while(i<inorder1.size()&&j<inorder2.size()){
			if(inorder1.get(i)<inorder2.get(j)){
				arr.add(inorder1.get(i));
				i++;
			}
			else
			{
				arr.add(inorder2.get(j));
				j++;
			}
		}
		while(i<inorder1.size()){
			arr.add(inorder1.get(i));
			i++;
		}
		while(j<inorder2.size()){
			arr.add(inorder2.get(j));
			j++;
		}
		return createBST(arr,0,arr.size()-1);
			
	}
		
	public static Node createBST(ArrayList<Integer> arr,int s,int e){
		if(s>e)
			return null;
		int mid=(s+e)/2;
		Node root=new Node(arr.get(mid));
		root.left=createBST(arr,s,mid-1);
		root.right=createBST(arr,mid+1,e);
		return root;
		
	}	
	
	public static void getinorderTraversal(Node root,ArrayList<Integer> inorder){
		if(root!=null){
			getinorderTraversal(root.left,inorder);
			inorder.add(root.data);
			getinorderTraversal(root.right,inorder);
		}
		
	}
	public static void printinorder(Node root){
		if(root!=null){
			printinorder(root.left);
			System.out.print(root.data+" ");
			printinorder(root.right);
		}
		
	}	
	
	public static void main(String ar[]){
		/* 
			2
		       / \
		      1   4
					
		*/
	
		Node root1 = new Node(2);
		root1. left = new Node(1);
		root1.right = new Node(4);
		/* 
			9
		       / \
		      3   12
					
		*/
	
		Node root2 = new Node(9);
		root2. left = new Node(3);
		root2.right = new Node(12);
		Node root=merge(root1,root2);
		printinorder(root1);
		System.out.println();
		printinorder(root2);
		System.out.println();
		printinorder(merge(root1,root2));
		
	}
	
}