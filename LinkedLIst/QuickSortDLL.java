class Node{
	int data;
	Node next;
	Node pre;
	Node(int key){
		data = key;
		pre = next = null;
	}
}

class QuickSortDLL{
	Node head;
	public static void main(String[] args) {
		QuickSortDLL obj = new QuickSortDLL();
		obj.push(8);
		obj.push(15);
		obj.push(5);
		obj.push(2);
		obj.push(10);
		obj.push(4);

		if(obj.head == null){
			System.out.println("cscksack");			
		}

		System.out.println("list before: ");
		obj.printLL(obj.head);

		// if(obj.head != null){
		// 	System.out.println("head not null "+obj.head.data);			
		// }

		System.out.println("list after: ");
		obj.quickSort_doublyll(obj.head);
		obj.printLL(obj.head);

	}

	void quickSort_doublyll(Node head){
		if(head == null)
			return;
		Node last = last_node(head);
		quick_sort(head,last);
	}

	void quick_sort(Node low,Node high){
		if(high != null && low != high && low != high.next){
			Node part = partition(low,high);
			quick_sort(low,part.pre);
			quick_sort(part.next,high);
		}
	}

	Node partition(Node low, Node high){
		System.out.println("low : "+low.data);
		System.out.println("high : "+high.data);
		int pivot = high.data;
		Node j = high.pre;
		Node i = low;

		while(i != j){
			if(i.data < pivot){
				i = i.next;
			}
			else{
				//exchange data of j and i and decemnt j
				int temp = i.data;
				i.data = j.data;
				j.data = temp;
				j = j.pre;
			}
		}
		Node p = low;
		System.out.println("low aftre loop while: "+low.data);
		while(p.data <= pivot && p != high){
			p = p.next;
		}
		high.data = p.data;
		p.data = pivot;
		System.out.println("p value: "+p.data);
		return p;
	}

	Node last_node(Node node){
		if(node == null)
			return null;
		while(node.next != null){
			node = node.next;
		}
		return node;
	}

	/* Function to insert a node at the beginging of the Doubly Linked List */
    void push(int new_Data)
    {
        Node new_Node = new Node(new_Data);     /* allocate node */
         
        // if head is null, head = new_Node
        if(head==null){
            head = new_Node;
            return;
        }
         
        /* link the old list off the new node */
        new_Node.next = head;
         
        /* change prev of head node to new node */
        head.pre = new_Node;
         
        /* since we are adding at the begining, prev is always NULL */
        new_Node.pre = null;
         
        /* move the head to point to the new node */
        head = new_Node;
        System.out.println("head is:"+head.data);
    }

    void printLL(Node node){
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
}