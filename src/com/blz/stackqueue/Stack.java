package com.blz.stackqueue;

public class Stack {
		
	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addLast(data);
	}

	public void display() {
		list.display();
	}
	
	public void pop() {
		list.deleteFirst();
	}

	public static void main(String[] args) {
		System.out.println("welcome to stack program");

		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}
