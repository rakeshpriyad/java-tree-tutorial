package com.aayush.tree.inorder.morrish.traversal;

public class BinaryTree {
	Node root;

	public void morrisTraversal(Node root) {
		Node current, prev;
		current = root;
		while (current != null) {
			if (current.left == null) {
				System.out.println(current.data + " ");
				current = current.right;
			} else {
				prev = current.left;
				while (prev.right != null && prev.right != current) {
					prev = prev.right;
				}

				if (prev.right == null) {
					prev.right = current;
					current = current.left;
				} else {
					prev.right = null;
					System.out.println(current.data + " ");
					current = current.right;
				}
			}
		}
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
		
		tree.morrisTraversal(tree.root);
	}
}
