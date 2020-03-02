class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class SwapNodes{
	Node head;
	public static void main(String[] args) {
		SwapNodes obj = new SwapNodes();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);
		System.out.println("ll before: ");
		obj.printLL(obj.head);
		//obj.swap(1,3);
		obj.swap2(2,5);
		System.out.println("ll after: ");
		obj.printLL(obj.head);
	}

	//my func will work perfectly but if one of the node is head then it will not work
	//for the node to be head the code is esy bt i have not writtn it.
	//because ill be writing another func much simpler. //
	void swap(int data1,int data2){
		Node last1 = head;
		Node last2 = head;
		Node pre1, pre2,temp1,temp2;

		while(last1.next.data != data1){
			last1 = last1.next;
		}
		pre1 = last1;
		while(last2.next.data != data2){
			last2 = last2.next;
		}
		pre2 = last2;
		temp1 = pre1.next;
		temp2 = pre2.next;
		Node c = temp2.next;
		Node b = temp1.next;
		if(temp1.next == temp2){
			temp1.next = c;
			temp2.next = temp1;

			pre1.next = temp2;
			pre2.next = c;
		}
		else if(temp1.next != temp2){
			temp1.next = c;
			temp2.next = b;

			pre1.next = temp2;
			pre2.next = temp1;
		}
	}

	void swap2(int x,int y){
		if(x == y)
			return;
		Node prex = null, currx = head; 
		while(currx != null && currx.data != x){
			prex = currx;
			currx = currx.next;
		}
		Node prey = null, curry = head;
		while(curry != null && curry.data != y){
			prey = curry;
			curry = curry.next;
		}
		if(curry == null || currx == null)
			return;

		if(prex != null)
			prex.next = curry;
		else
			head = curry;

		if(prey != null)
			prey.next = currx;
		else
			head = currx;
		Node temp = currx.next;
		currx.next = curry.next;
		curry.next = temp;
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