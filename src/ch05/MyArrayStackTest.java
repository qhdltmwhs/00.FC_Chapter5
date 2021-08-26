package ch05;

public class MyArrayStackTest {

	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack(3);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		stack.printAll();
		System.out.println("pop element " + stack.pop());

		System.out.println("peek element " + stack.peek());
		stack.printAll();

		System.out.println("stack size " + stack.getSize());

	}

}
