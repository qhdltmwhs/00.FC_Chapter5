package ch04;

public class MyListNode {
	
	private String data; 	//자료
	public MyListNode next;	//다음 노드를 가리키는 링크
	
	public MyListNode() {
		
	}

	public MyListNode(String data) {
		this.data = data;
	}

	public MyListNode(String data, MyListNode next) {
		this.data = data;
		this.next = next;
	}

	public String getData() {
		return data;
	}
	
}
