class LinkedList{
	public static void main(String[] args) {
		Node head = new Node(0);
		Node tail = head;
		for(int i=1;i<=5;i++){
			Node newNode = new Node(i);
			tail.next = newNode;
			tail = newNode;
		}
		// Head, tail
		Node ptr = head;
		while(ptr != null){
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}

class LList{
	private Node head;
	private Node tail;
	int length;
	LList(){
		length = 0;
		head = null;
		tail = null;
	}
	void add(Node newNode){
		tail.next = newNode;
		tail = newNode;
	}
	Node getHead(){
		return head;
	}
}
class Node{
	public int data;
	public Node next;
	Node(int x){
		data = x;
		next = null;
	}
}