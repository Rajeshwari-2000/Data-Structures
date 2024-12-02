package com.demo.test;

import com.demo.trees.BinarySearchTree;

public class TestBinarySearchTree {
public static void main(String[] args) {
	BinarySearchTree bt= new BinarySearchTree();
	bt.insertValue(13);
	bt.insertValue(7);
	bt.insertValue(15);
	bt.insertValue(3);
	bt.insertValue(8);
	bt.insertValue(14);
	bt.insertValue(19);
	bt.insertValue(18);
	
	System.out.println("================== inorder ======================");
	bt.inorder();
	
	System.out.println("================== preorder =====================");
	bt.preorder();
	
	System.out.println("================= postorder =====================");
	bt.postorder();
	
	if(bt.binarySearchValue(10)) {
		System.out.println("Data found");
	}else {
		System.out.println("Data not found");
	}
	if(bt.binarySearchValue(100)) {
		System.out.println("Data found");
	}else {
		System.out.println("Data not found");
	}
	
	
}
}
