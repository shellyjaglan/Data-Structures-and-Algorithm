class LinkNode{
	int data;
	LinkNode next;
	LinkNode(int key){
		data = key;
		next = null;
	}
}

//in this method static head is used..
// so to access head we donot neeed obj..head can be refered using class name.

class LinkedListIntro2{
	static LinkNode head;
	public static void main(String[] args) {
		LinkedListIntro2.head = new LinkNode(1);
 		LinkNode second = new LinkNode(2);
 		LinkNode third = new LinkNode(3);

 		LinkedListIntro2.head.next = second;
 		second.next  = third;
 		//no obj.printlost is used as this method is static
 		printList(LinkedListIntro2.head);
	}

	static void printList(LinkNode node){
 		while(node != null){
 			System.out.println(node.data+" ");
 			node = node.next;
 		}
 	}
}