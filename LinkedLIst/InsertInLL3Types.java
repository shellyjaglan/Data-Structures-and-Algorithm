// in this program we will insert elements in link list in 3 types...
class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class InsertInLL3Types {
	//head as a member variable..accesed as object.head
	Node head;
	public static void main(String[] args) {
		InsertInLL3Types obj = new InsertInLL3Types();
		obj.insertAtStart(2);
		obj.insertAtStart(1);
		obj.insertAtEnd(4);
		obj.insertAfterNode(obj.head.next,3);
		obj.insertAtEnd(5);

		while(obj.head != null){
			System.out.print(obj.head.data+" ");
			obj.head = obj.head.next;
		}
	}
	//this func inserts element at the start of the link list
	void insertAtStart(int new_data){
		Node new_node = new Node(new_data);
		// if(head == null){
		// 	new_node.next = null;
		// 	head = new_node;
		// 	return;
		// }
		new_node.next = head;
		head = new_node;

	}
	//this func adds element at a specified node in between the link list
	void insertAfterNode(Node node, int new_data){
		if (node == null){
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	    Node new_node = new Node(new_data);
		new_node.next = node.next;
		node.next = new_node;
	}
	//this func inserts the node at the end or the last of the link list
	void insertAtEnd(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new Node(new_data);
		}

		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		
		new_node.next = last.next;
		last.next = new_node;
	}
}