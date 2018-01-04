package com.aayush.tree.recursive.postorder.traversal;
/**
 * InOrder traversal
 *  Left, Right, Root
 * @author aayushraj
 *
 */
public class BinaryTree {
	Node root;
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
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
		 *  Post Order output should be like
		 *  4 5 2 3 1
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.postOrder(tree.root);
	}
}
