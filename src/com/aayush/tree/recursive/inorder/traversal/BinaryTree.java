package com.aayush.tree.recursive.inorder.traversal;
/**
 * InOrder traversal
 * Left, Root, Right
 * @author aayushraj
 *
 */
public class BinaryTree {
	Node root;
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		/**
		 * Binary tree will be like
		 * 
		 * 		1
		 *    /   \
		 *    2    3
		 *   /  \
		 *  4     5
		 *  
		 *  In Order output should be like
		 *  4 2 5 1 3
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.inOrder(tree.root);
	}
}
