class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class RotateLL{
	Node head;
	public static void main(String[] args) {
		RotateLL obj = new RotateLL();

		obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        obj.head.next.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        obj.printLL(obj.head);

        int k = 7;//rotating number;
 		Node res = obj.rotate(obj.head,k);

 		System.out.print("First List is ");
 		obj.printLL(res);

	}

	Node rotate(Node head,int k){
		if(head == null)
			return null;
		Node temp = head;
		int count =0 ;
		Node pre = null,h2 = head;
		while(temp.next != null){
			count++;
			temp = temp.next;
		}
		if(k >= count){
			return null;
		}
		//System.out.println("last node is: "+temp.data);
		//return null;
		temp.next = head;
		int c = 0;
		while(c < k && h2 != null){
			pre = h2;
			h2 = h2.next;
			c++;
		}
		if(h2 == null)
			return null;
		//head = h2;
		pre.next = null;
		return h2;

	}

	void printLL(Node node){
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
}