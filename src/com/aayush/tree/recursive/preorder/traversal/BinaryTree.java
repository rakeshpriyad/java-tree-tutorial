package com.aayush.tree.recursive.preorder.traversal;
/**
 * InOrder traversal
 *  Root, Left, Right
 * @author aayushraj
 *
 */
public class BinaryTree {
	Node root;
	public void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
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
		 *  Pre Order output should be like
		 *  1 2 4 5 3
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.preOrder(tree.root);
	}
}
