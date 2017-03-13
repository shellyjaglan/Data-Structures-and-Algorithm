class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}


class ReverseGroupsLL {
	Node head;
	public static void main(String[] args) {
		ReverseGroupsLL obj = new ReverseGroupsLL();
		// obj.insertAtEnd(1);
		// obj.insertAtEnd(2);
		// obj.insertAtEnd(3);
		// obj.insertAtEnd(4);
		// obj.insertAtEnd(5);
		// obj.insertAtEnd(6);
		// obj.insertAtEnd(7);
		// obj.insertAtEnd(8);

		obj.insertAtEnd(4);
		obj.insertAtEnd(1);
		obj.insertAtEnd(3);
		obj.insertAtEnd(2);
		obj.insertAtEnd(5);
		obj.insertAtEnd(6);
		
		
		System.out.println("ll before:");
		obj.printLL(obj.head);

		int k = 3;
		Node res = obj.reverseInGroups(obj.head,k);

		System.out.println("ll after reversing in groups:");
		obj.printLL(res);

	}

	Node reverseInGroups(Node node,int k){
		Node current = node;
		Node prev = null;
		Node next = null;
		int count = 0;

		while(count < k && current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		//now next will be pointing to k+1 elemtn
		//recursvly call reverse func and pass next and add it to the head of the prevoius result
		if(next != null){
			node.next = reverseInGroups(next,k);
		}
		System.out.println("prev is: "+prev.data);
		return prev;
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