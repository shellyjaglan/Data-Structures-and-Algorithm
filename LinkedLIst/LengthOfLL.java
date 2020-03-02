class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class LengthOfLL{
	Node head;
	public static void main(String[] args) {
		LengthOfLL obj = new LengthOfLL();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);

		//for simple function
		// int length = obj.findLength(obj.head);
		// System.out.println("length of ll is: "+length);

		//for recursive function
		System.out.println("recursive length is: "+ obj.getLength(obj.head));

	}

	int  findLength(Node node){
		if(node == null)
			return 0;
		int count = 0;
		while(node != null){
			count++;
			node = node.next;
		}
		return count;
	}
	//recursive solution
	int getLength(Node node){
		return getLengthRec(node);
	}
	int getLengthRec(Node node){
		if(node == null)
			return 0;
		return 1 + getLengthRec(node.next);
	}

	void printLL(Node node){
	
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
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
}