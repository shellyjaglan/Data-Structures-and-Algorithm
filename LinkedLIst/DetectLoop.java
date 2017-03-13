class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class DetectLoopLL{
	Node head;
	public static void main(String[] args) {
		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
		obj.head.next.next.next.next = obj.head.next.next;

		obj.detectLoopLL
	//	obj.head.next.next.next.next.next = new Node(45);
	}

	void printLL(Node node){
	
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}


}