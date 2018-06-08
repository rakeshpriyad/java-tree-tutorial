package com.test.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class InOrder {

	public void inOrder(Node<String> root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(" " + root.getData());
			inOrder(root.getRight());
		}
	}

	public List<String> inOrderNonRec(Node<String> root) {
		List<String> res = new ArrayList<String>();
		if (root == null) {
			return null;
		}

		Node<String> curr = root;
		boolean done = false;
		ArrayDeque<Node<String>> stck = new ArrayDeque<Node<String>>();

		while (!done) {
			if (curr != null) {
				stck.push(curr);
				curr = curr.getLeft();
			} else {
				if (stck.isEmpty()) {
					done = true;
				} else {
					curr = stck.pop();
					res.add(curr.getData());
					curr = curr.getRight();
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
		 * 			    	A 
		 * 				  /   \ 
		 *               B      C 
		 *              / \    / \
		 *             D   E  F   G 
		 *            / 
		 *           H
		 * 
		 * in order output expected: H D B E A F C G
		 */
		InOrder p = new InOrder();

		p.inOrder(root);
		System.out.println("");
		System.out.println(p.inOrderNonRec(root).toString());
	}
}
