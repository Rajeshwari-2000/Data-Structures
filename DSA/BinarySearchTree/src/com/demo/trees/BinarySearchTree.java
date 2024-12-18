package com.demo.trees;

public class BinarySearchTree {

	class Node{
		Node left;
		int Data;
		Node right;

		public Node(int val) {
			this.left=null;
			this.right=null;
			Data=val;
		}
	}
	Node root;


	public BinarySearchTree() {
		super();
		this.root = root;
	}

	public void insertValue(int val) {
		root=insertData(root,val);
	}

	private Node insertData(Node root, int val) {
		Node newnode=new Node(val);
		if(root==null) {
			root=newnode;
			return root;

		}
		if(val<root.Data) {
			root.left=insertData(root.left,val);

		}else {
			root.right=insertData(root.right,val);
		}
		return root;
	}
	public void inorder() {
		inorderTraversal(root);
		

	}

	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.println(root.Data);
			inorderTraversal(root.right);
		}

	}

	public void preorder() {
		preorderTraversal(root);
		


	}

	private void preorderTraversal(Node root) {

		if(root!=null) {
			System.out.println(root.Data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

	}


	public void postorder() {
		postorderTraversal(root);
	


	}

	private void postorderTraversal(Node root) {

		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.Data);
		}

	}

	public boolean binarySearchValue(int val) {
		return binarySearchData(root,val);

	}

	private boolean binarySearchData(Node root, int val) {
		if(root==null) {
			return false;

		}
		if(root.Data==val) {
			return true;

		}

		else if(val<root.Data){
			return binarySearchData(root.left,val);

		}else {
			return binarySearchData(root.right,val);
		}

	}


}







