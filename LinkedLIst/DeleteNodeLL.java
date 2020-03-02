class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class DeleteNodeLL{
	Node head;
	public static void main(String[] args) {
		DeleteNodeLL obj = new DeleteNodeLL();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);

		System.out.println("the ll is: ");
		obj.printLL(obj.head);

		//obj.deleteNode(3);
		obj.deleteAtPosition(3);

		System.out.println("the ll after delete is: ");
		obj.printLL(obj.head);

	}
	///delets the node with the given data
	void deleteNode(int node_data){
		if(head == null){
			System.out.println("no node to delete");
			return;
		}
		if(head.data == node_data){
			head = head.next;
		}
		Node last = head;
		while(last.next.data != node_data){
			last = last.next;
		}
		Node n = last.next;
		last.next = n.next;
		n.next = null;


	}
	//deletes the node with specified position in the link list
	void deleteAtPosition(int position){
		if(head == null)
			return;
		if(position == 0){
			head = head.next;
		}
		Node temp = head;
		for(int i =0;i < position-1 && temp != null ;i++){
			temp = temp.next;
		}
		if(temp == null || temp.next == null){
			return;
		}
		Node x = temp.next.next;
		temp.next = x;
	}

	void insertAtEnd(int new_data){
		
		if(head == null){
			head = new Node(new_data);
			return;
		}
		Node new_node = new Node(new_data);
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		
		new_node.next = last.next;
		last.next = new_node;
	}

	void printLL(Node node){
	
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
}