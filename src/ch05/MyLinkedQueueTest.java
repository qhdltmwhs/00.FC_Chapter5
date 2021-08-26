package ch05;

public class MyLinkedQueueTest {

	public static void main(String[] args) {

		MyLInkedQueue queue = new MyLInkedQueue();

		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");

		queue.printQueue();

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		queue.printQueue();

		queue.enQueue("모");
		queue.enQueue("네");

		queue.printQueue();

	}

}
