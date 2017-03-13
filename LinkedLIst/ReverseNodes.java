class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class ReverseNodes{
	Node head;
	public static void main(String[] args) {
		ReverseNodes obj = new ReverseNodes();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);
		System.out.println("ll before: ");
		obj.printLL(obj.head);

		//this is the iterate method
		//Node new_h = obj.reverse(obj.head,obj.findLength(obj.head));

		//this is the recursive method
		Node new_h2 = obj.reverseUtil(obj.head,null);	


		System.out.println("");
		System.out.println("ll after: ");
		//obj.printLL(new_h);
		obj.printLL(new_h2);

	}

	//recursive method
	Node reverse(Node node,int length){
		Node data = null,pre,current,head_new = null;

		for(int i = 1;i <= length;i++){
			current = head;
			pre = null;
			while(current.next != data){
				pre = current;
				current = current.next;
			}
			if(i == 1){
				head_new = current;
			}
			data = current;
			current.next = pre;
		}
		return head_new;
	}

	Node reverseUtil(Node curr, Node prev) {
 
        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;
 
            /* Update next to prev node */
            curr.next = prev;
            return null;
        }
 
        /* Save curr->next node for recursive call */
        Node next1 = curr.next;
 
        /* and update next ..*/
        curr.next = prev;
 
        reverseUtil(next1, curr);
        return head;
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