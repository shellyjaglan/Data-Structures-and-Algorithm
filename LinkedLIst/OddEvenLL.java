import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class OddEvenLL{
    ListNode head;
    public static void main(String[] args){
        OddEvenLL obj =  new OddEvenLL();

        obj.head = new ListNode(1);
        obj.head.next = new ListNode(2);
        obj.head.next.next = new ListNode(3);
        obj.head.next.next.next = new ListNode(4);
        obj.head.next.next.next.next = new ListNode(5);
        obj.head.next.next.next.next.next = null;

        //obj.printLL(obj.head);
        ListNode res = obj.oddEvenList(obj.head);
        obj.printLL(res);
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        
        ListNode oddRoot = head;
        ListNode evenRoot = head.next;

        ListNode oddnode = oddRoot;
        ListNode evennode = evenRoot;

        while(oddnode.next != null && evennode.next != null){
            oddnode.next = oddnode.next.next;
            oddnode = oddnode.next;

            evennode.next = evennode.next.next;
            evennode = evennode.next;
        }

        oddnode.next = evenRoot;
        return oddRoot;
    }

    void printLL(ListNode node){
		while(node!= null){
			System.out.print(node.val+" ");
			node = node.next;
		}
	}
}