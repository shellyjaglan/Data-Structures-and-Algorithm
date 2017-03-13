/* So if we start moving both pointers again at same speed such that one pointer (say slow) 
begins from head node of linked list and other pointer (say fast) begins from meeting point. 
When slow pointer reaches beginning of linked list (has made m steps). 
Fast pointer would have made also moved m steps as they are now moving same pace.
 Since m+k is a multiple of n and fast starts from k, they would meet at the beginning. 
 Can they meet before also? No because slow pointer enters the cycle first time after m steps. */

//this progrm detects and removes loop from ll

class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class DetectRemoveLoopLL{
	Node head;
	public static void main(String[] args) {
		DetectRemoveLoopLL obj = new DetectRemoveLoopLL();

		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
		obj.head.next.next.next.next.next = obj.head.next.next;

		obj.detectAndRemoveLoop(obj.head);
        System.out.println("Linked List after removing loop : ");
        obj.printLL(obj.head);
	}

	void detectAndRemoveLoop(Node node) {
        Node slow = node;
        Node fast = node.next;
 
        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            System.out.println("in while:");
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("slow is : "+slow.data);
        System.out.println("fast is : "+fast.data);
        /* If loop exists */
        if (slow == fast) {
            slow = node;
            while (slow != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println("2slow is : "+slow.data);
            System.out.println("2fast is : "+fast.data);
            /* since fast->next is the looping point */
            fast.next = null; /* remove loop */
 
        }
    }

    void printLL(Node node){
	
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
 
}