class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class RemoveDuplicateElementfromSortedLL{
	Node head;
	public static void main(String[] args) {
		RemoveDuplicateElementfromSortedLL obj = new RemoveDuplicateElementfromSortedLL();

		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(2);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(4);

		obj.printLL(obj.head);
		obj.removeDuplicate(obj.head);
		obj.printLL(obj.head);
	}

	void removeDuplicate(Node node){
		if(node.next == null)
			return;
		Node pre = node;
		Node curr = node.next;
		Node nextn = curr.next;
		//System.out.println("node is: "+node.data);

		while(curr != null){
			// System.out.println("curr: "+curr.data);
			// System.out.println("pre: "+pre.data);

			if(curr.data == pre.data){
				pre.next = nextn;
				//pre = curr;
				curr.next = null;
				curr = nextn;
			//	nextn = curr.next;
			}
			else{
				pre = curr;
				curr = curr.next;
				//nextn = curr.next;
			}
			if(curr != null){
				nextn = curr.next;
			}
		}
	}

//2nd method ....goodd one
	Node deleteDuplicates(Node head)
    {
	// Your code here
    // 	if(head==null)
    // 	    return head;
		Node current = head;
		Node next1 = head;
		while(current.next!=null){
			next1 = current.next;
			if(next1.data==current.data){
				current.next = next1.next;
			next1 = next1.next;
			}
			else
			    current = current.next;
 
		}
		return head;
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