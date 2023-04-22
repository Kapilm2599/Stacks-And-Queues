package com.blz.stackqueue;

public class LinkedList {
	Node head; 

	class Node {
		Object data;
		Node ref;
		Node(Object data) {
			this.data = data;
		}
	}

	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.ref = head;
		head = newNode;
	}

	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null)
			head = newNode;
		else if (head.ref == null)
			head.ref = newNode;
		else {
			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}

	public void deleteFirst() {
		head = head.ref;
	}

	public void display() {
		if (head == null)
			System.out.println("No elements in list");
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.ref != null)
					System.out.print(temp.data + " > ");
				else
					System.out.println(temp.data);

				temp = temp.ref;
			}
		}
	}

	public void deleteLast() {
		if (head == null)
			System.out.println("List is Empty");
		else if (head.ref == null)
			head = null;
		else {
			Node temp = head;
			while (temp.ref.ref != null) {
				temp = temp.ref;
			}
			temp.ref = null;
		}
	}

	public Object searchData(Object input) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == input) {
				return temp.data;
			}

			temp = temp.ref;
		}
		return null;
	}

	public void addNodeAtPosition(Object data, int position) {
		Node newNode = new Node(data);
		int index = 0;
		Node left = head;
		Node right = left.ref;
		while (index < position) { 
			index++;
			left = left.ref;
			right = right.ref;
		}
		newNode.ref = right;
		left.ref = newNode;
	}

	public void deleteNodeAtPosition(int position) {
		int index = 0;
		Node left = head;
		Node right = left.ref;
		while (index < position - 1) {
			left = left.ref;
			right = right.ref;
			index++;
		}
		left.ref = right.ref;
	}
}
