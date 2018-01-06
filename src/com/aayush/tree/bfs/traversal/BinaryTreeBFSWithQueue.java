package com.aayush.tree.bfs.traversal;

import java.util.LinkedList;
import java.util.Queue;

//Recursive Java program for level order traversal of Binary Tree

class BinaryTreeBFSWithQueue {
	// Root of the Binary Tree
	Node root;

	public BinaryTreeBFSWithQueue() {
		root = null;
	}

	/**
	 * BFS breadth first search is also called level order traversal
	 * @param root
	 */
	public void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node current =queue.poll();
			/** print the visited node and add the left and right of the visited node */
			
			System.out.print(current.data+" ");
			if(current.left != null) {
				queue.add(current.left);
			}
			
			if(current.right != null ) {
				queue.add(current.right);
			}
		}
		
		
	}
	/* Driver program to test above functions */
	public static void main(String args[]) {
		BinaryTreeBFSWithQueue tree = new BinaryTreeBFSWithQueue();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is ");
		tree.levelOrder(tree.root);
	}
}
