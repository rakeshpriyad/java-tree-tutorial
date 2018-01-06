package com.aayush.tree.bfs.traversal;

//Recursive Java program for level order traversal of Binary Tree

class BinaryTreeBFSWithoutQueue {
	// Root of the Binary Tree
	Node root;

	public BinaryTreeBFSWithoutQueue() {
		root = null;
	}

	/* function to print level order traversal of tree */
	void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 */
	int height(Node root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			/* find the height of left sub tree */
			int lheight = height(root.left);
			/* find the height of right sub tree */
			int rheight = height(root.right);
			
			/* return the max height from left and right sub tree */
			return Math.max(lheight, rheight) + 1;/* use the larger one */
		}
	}

	/* Print nodes at the given level */
	void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		BinaryTreeBFSWithoutQueue tree = new BinaryTreeBFSWithoutQueue();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is ");
		tree.printLevelOrder();
	}
}
