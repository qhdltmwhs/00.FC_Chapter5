package ch06;

import ch04.MyLinkedList;
import ch04.MyListNode;

interface Queue {

	public void enQueue(String data);

	public String deQueue();

	public void printQueue();

}

public class MyLInkedQueue extends MyLinkedList implements Queue {

	MyListNode front;
	MyListNode rear;

	@Override
	public void enQueue(String data) {

		MyListNode newNode;

		if (isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		} else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + "\t<== added");

	}

	@Override
	public String deQueue() {
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		String data = removeElement(0).getData();
		//data = front.getData(); 
		front = front.next;
		
		if(front==null) {
			rear = null;
		}
		return data;
		
	}

	@Override
	public void printQueue() {
		printAll();
	}

}
