// in this we have made inner class static 

class LinkedListIntro{
	static class LinkNode{
		int data;
		LinkNode next;
		LinkNode(int key){
			data = key;
			next = null;
		}
	}

	LinkNode head;
	public static void main(String[] args) {
		/* Start with the empty list. */
        LinkedListIntro obj = new LinkedListIntro();
 
        obj.head       = new LinkNode(1);
        LinkNode second      = new LinkNode(2);
        LinkNode third       = new LinkNode(3);
 
        obj.head.next = second; // Link first LinkedNode with the second LinkedNode
        second.next = third; // Link first LinkedNode with the second LinkedNode
 
        obj.printList(obj.head);
	}

	void printList(LinkNode node){
 		while(node != null){
 			System.out.println(node.data+" ");
 			node = node.next;
 		}
 	}
}