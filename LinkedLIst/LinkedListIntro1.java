class LinkNode{
	int data;
	LinkNode next;
	LinkNode(int key){
		data = key;
		next = null;
	}
}

//this method uses head node  as  a member variable..
//so using obj it is referred.

class LinkedListIntro1{
	 LinkNode head;
	public static void main(String[] args) {
		LinkedListIntro1 obj = new LinkedListIntro1();

		obj.head = new LinkNode(1);
		LinkNode second = new LinkNode(2);
		LinkNode third = new LinkNode(3);

		obj.head.next = second;
		second.next  = third;

		obj.printList(obj.head);
	}
	static void printList(LinkNode node){
		while(node != null){
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
}