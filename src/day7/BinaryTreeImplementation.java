package day7;

import java.util.Scanner;

class Node{
	
	int data;
	Node left,right;
	
	Node(int value){
		
		data=value;
		left=right=null;
	}
	
}

class BinaryTree{
	
	Node root;
	
	BinaryTree(){
		
		root=null;
	}

	public Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			
			root=new Node(data);
			return root;
		}
		
		// decide to insert -> left or right
		
		if(data<root.data) {
			
			root.left=insert(root.left,data);
		} else if(data>root.data){
			root.right=insert(root.right,data);
		}
		
		return root;
	}

	public void inorder(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		inorder(node.left); //left 
		System.out.print(node.data + " "); // root
		inorder(node.right); // right
		
	}

	public void preorder(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return;
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
		
	}

	public void postorder(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
		
	}
}
public class BinaryTreeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		BinaryTree bt= new BinaryTree();
		
		int noofnodes=sc.nextInt();
		
		for(int i=0; i<noofnodes; i++) {
			
			int value=sc.nextInt();
			bt.root=bt.insert(bt.root,value);
		}
		
		System.out.println("Inorder: ");
		bt.inorder(bt.root);
		System.out.println();
		
		System.out.println("Pre-order: ");
		bt.preorder(bt.root);
		System.out.println();
		
		System.out.println("Post-order: ");
		bt.postorder(bt.root);
		System.out.println();
	}

}
