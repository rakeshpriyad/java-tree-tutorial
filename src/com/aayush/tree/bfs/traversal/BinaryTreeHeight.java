package com.aayush.tree.bfs.traversal;

//Recursive Java program for level order traversal of Binary Tree

class BinaryTreeHeight {
	// Root of the Binary Tree
	Node root;
	static int callCount=1;

	public BinaryTreeHeight() {
		root = null;
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

	/* Driver program to test above functions */
	public static void main(String args[]) {
		/** Tree like below will be created 
		 * 		   100
		 * 		 /     \
		 * 		200      300
		 * 	  /   \
		 *   400   500
		 * 
		 */
		BinaryTreeHeight tree = new BinaryTreeHeight();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is ");
		/**
		 * output will be calculated like below recursion tree:
		
									    height(100)
									    return 3
									 /               \
								height(200)            height(300)
								return 2                return 1
								 /           \       /            \
								/			  \      height(null)  height(null)
							   /			   \     return 0      reutrn 0
							  /                 \    
						 height(400) 	         \										
						 return 1     	       	  \									return 1
						 /		  \           	   \       
						/          \                \
					   /            \              height(500)
					  /              \              return 1
					 /                \            /           \
					/                  \          height(null)  height(null)
				   /                    \          return 0      ret00
				height(null) 		  height(null)
				return 0   	           return 0
		 */
		 
		int x= tree.height(tree.root);
		System.out.println(x);
	}
}
