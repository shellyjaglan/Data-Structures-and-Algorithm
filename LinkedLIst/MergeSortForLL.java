class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class MergeSortForLL{
	Node head;
	public static void main(String[] args) {
		MergeSortForLL obj = new MergeSortForLL();
		obj.insertAtEnd(10);
		obj.insertAtEnd(2);
		obj.insertAtEnd(8);
		obj.insertAtEnd(5);
		obj.insertAtEnd(15);
		obj.insertAtEnd(35);
		obj.insertAtEnd(1);
		obj.insertAtEnd(9);
		

		System.out.println("ll before: ");
		obj.printLL(obj.head);

		Node result = obj.mergeSort(obj.head);

		System.out.println("ll after: ");
		obj.printLL(result);
	}

	Node mergeSort(Node node){
		if(node == null || node.next == null)
			return node;

		Node slow = node, fast= node.next;
		while(fast != null){
			fast = fast.next;
			if(fast != null){
				slow = slow.next;
				fast = fast.next;
			}
		}	
		Node r,l;
		l = node;
		r = slow.next;
		slow.next = null;
		Node h1 = mergeSort(l);
		Node h2 = mergeSort(r);
		Node result = merge(h1,h2);
		return result;
	}

	Node merge(Node list1,Node list2){

		if(list1 == null && list2 == null)
			return null;
		if(list1 == null)return list2;
		if(list2 == null)return list1;

		if(list1.data < list2.data){
			list1.next = merge(list1.next,list2);
			return list1;
		}
		else{
			list2.next = merge(list1,list2.next);
			return list2;
		}
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