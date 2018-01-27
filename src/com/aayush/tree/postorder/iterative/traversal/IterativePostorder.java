package com.aayush.tree.postorder.iterative.traversal;

import java.util.Stack;

public class IterativePostorder {

	// Two stacks as used in explanation
	static Stack<Node> s1, s2;

	static void postOrderIterative(Node root) {
		// Create two stacks
		s1 = new Stack<>();
		s2 = new Stack<>();

		if (root == null)
			return;

		// push root to first stack
		s1.push(root);

		// Run while first stack is not empty
		while (!s1.isEmpty()) {
			// Pop an item from s1 and push it to s2
			Node temp = s1.pop();
			s2.push(temp);

			// Push left and right children of
			// removed item to s1
			if (temp.left != null)
				s1.push(temp.left);
			if (temp.right != null)
				s1.push(temp.right);
		}

		// Print all elements of second stack
		while (!s2.isEmpty()) {
			Node temp = s2.pop();
			System.out.print(temp.data + " ");
		}
	}

	public static void main(String[] args) {
		// Let us construct the tree
		// shown in above figure

		Node root = null;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		postOrderIterative(root);
	}
}
