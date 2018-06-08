package com.test.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class PreOrder {

	public void preOrder(Node<String> root) {
		if (root != null) {
			System.out.print(" " + root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public List<String> preOrderNonRec(Node<String> root) {
		List<String> res = new ArrayList<String>();
		if (root == null) {
			return null;
		}

		//Stack<Node<String>> stck = new Stack<Node<String>>();
		ArrayDeque<Node<String>> stck = new ArrayDeque<Node<String>>();
		stck.push(root);

		while (!stck.isEmpty()) {
			Node<String> curr = stck.pop();
			res.add(curr.getData());
			
			if (curr.right != null) {
				stck.push(curr.right);
			}
			if (curr.left != null) {
				stck.push(curr.left);
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
		 *  A 
		 * / \ 
		 * B C 
		 * / \ 
		 * D E
		 * / \ 
		 * F G 
		 * / 
		 * H 
		 * 
		 * preorder output exptected: A B D H E C F G
		 */
		PreOrder p = new PreOrder();
		
		p.preOrder(root);
		System.out.println("");
		System.out.println(p.preOrderNonRec(root).toString());
	}
}
