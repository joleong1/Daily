package Daily;

import java.util.ArrayList;
import java.util.List;

/*
 * An XOR linked list is a more memory efficient doubly linked list. 
 * Instead of each node holding next and prev fields, 
 * it holds a field named both, which is an XOR of the 
 * next node and the previous node. Implement an XOR linked list;
 *  it has an add(element) which adds the element to the end,
 *   and a get(index) which returns the node at index.

 * If using a language that has no pointers (such as Python),
 * you can assume you have access to get_pointer and dereference_pointer
 * functions that converts between nodes and memory addresses.
 */
public class UnivalTree {
	public static void main(String[] args) {
		
		Node node = new Node(0,new Node(1),
				new Node(0
						,new Node(0,new Node(1),new Node(1)),new Node(0)));
		UnivalTreesAndRoots(node);
		System.out.println(count);
	}
		
	static int count = 0;
	public static void UnivalTreesAndRoots(Node root) {
		if(root.left != null) {
			UnivalTreesAndRoots(root.left);
		}
		if(root.right != null) {
			UnivalTreesAndRoots(root.right);
		}
		if(root.left == null && root.right == null) {
			count++;
			return;
		}
		if(root.left.value == root.value && root.right.value == root.value) {
			count++;
			return;
		}
		return;
	}
}

class Node{
	int value;
	Node left;
	Node right;
	public Node(int value, Node left, Node right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public Node() {
		super();
	}
	public Node(int value) {
		super();
		this.value = value;
	}
}