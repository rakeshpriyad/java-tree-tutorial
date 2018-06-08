package com.test.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PostOrder {

	public void postOrder(Node<String> root) {
		if (root != null) {

			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(" " + root.getData());
		}
	}

	public List<String> postOrderNonRec(Node<String> root) {
		List<String> res = new ArrayList<String>();
		if (root == null) {
			return null;
		}

		ArrayDeque<Node<String>> stck = new ArrayDeque<Node<String>>();
		ArrayDeque<Boolean> visited = new ArrayDeque<Boolean>();
		stck.push(root);
		visited.push(false);

		while (!stck.isEmpty()) {
			Node<String> curr = stck.pop();
			boolean isVisited =visited.pop();
			if (isVisited) {
				res.add(curr.getData());
			} else {
				stck.push(curr);
				visited.push(true);
				if (curr.right != null) {
					stck.push(curr.right);
					visited.push(false);
				}
				if (curr.left != null) {
					stck.push(curr.left);
					visited.push(false);
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		Node<String> root = new Node<String>("A");
		Node<String> b = new Node<String>("B");
		Node<String> c = new Node<String>("C");
		Node<String> d = new Node<String>("D");
		Node<String> e = new Node<String>("E");
		Node<String> f = new Node<String>("F");
		Node<String> g = new Node<String>("G");
		Node<String> h = new Node<String>("H");
		root.setLeft(b);
		root.setRight(c);
		b.setLeft(d);
		b.setRight(e);

		c.setLeft(f);
		c.setRight(g);
		d.setLeft(h);
		/**
		 * 				A 
		 * 			   / \ 
		 *            B   C 
		 *           / \ 
		 *          D   E 
		 *         / \ 
		 *        F   G 
		 *       / 
		 *      H
		 * 
		 * post order output expected: H D E B F G C A
		 */
		PostOrder p = new PostOrder();

		p.postOrder(root);
		System.out.println("");
		System.out.println(p.postOrderNonRec(root).toString());
	}
}
