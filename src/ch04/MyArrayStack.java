package ch04;

import ch02.MyArray;

public class MyArrayStack {

	private int top;
	private MyArray arrayStack;

	public MyArrayStack() {
		arrayStack = new MyArray();
	}

	public MyArrayStack(int size) {
		arrayStack = new MyArray(size);
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(top - 1);
	}

	public int getSize() {
		return top;
	}

	private boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}

	private boolean isFull() {
		if (top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		return false;
	}

	public void printAll() {
		arrayStack.printAll();
	}

}
