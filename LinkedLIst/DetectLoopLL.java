import java.util.*;

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
		DetectLoopLL obj = new DetectLoopLL();

		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
		obj.head.next.next.next.next = obj.head.next.next;

		// Hashmap hm = new Hashmap();
		// hm.put(1,0);
		// hm.put(2,0);
		// hm.put(3,0);
		// hm.put(4,0);
		//hm.put(1,0);
		//Set set = hm.entrySet();




		boolean res = obj.detectLoop(obj.head);
		if(res == true)
			System.out.println("loop found");
		else
			System.out.println("loop not found");
		

	//	obj.head.next.next.next.next.next = new Node(45);
	}

	boolean detectLoop(Node node){
		if(node == null)
			return false;
		if(node.next == null)
			return false;

		HashSet hm = new HashSet();
		Node current = node;
		System.out.println("head node is "+ current.data);
		while(current.next != null){
			if(hm.contains(current)){
				System.out.println("node is "+ current.data);
		 		return true;
			}
			else{
				hm.add(current);
				current = current.next;
			}
		}
		return false;
	}
	void printLL(Node node){
	
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}


}