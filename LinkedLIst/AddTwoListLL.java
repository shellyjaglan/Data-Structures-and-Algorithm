/* Given two numbers represented by two lists, write a function that returns sum list. 
The sum list is list representation of addition of two input numbers.
ex: Input:
  First List: 5->6->3  // represents number 365
  Second List: 8->4->2 //  represents number 248
Output
  Resultant list: 3->1->6  // represents number 613 */

//prog done using carry and making res list simultansly insead of making array and later making ll
  
class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class AddTwoListLL{
	Node head1,head2;
	public static void main(String[] args) {
		AddTwoListLL obj = new AddTwoListLL();

		// creating first list
        obj.head1 = new Node(7);
        obj.head1.next = new Node(5);
        obj.head1.next.next = new Node(9);
        obj.head1.next.next.next = new Node(4);
       // obj.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        obj.printLL(obj.head1);
 
        // creating seconnd list
        obj.head2 = new Node(8);
        obj.head2.next = new Node(4);
        System.out.print("Second List is ");
        obj.printLL(obj.head2);

        Node res = obj.addList(obj.head1,obj.head2);
        System.out.println("result list is ");
        obj.printLL(res);
	}

	Node addList(Node h1,Node h2){
		int sum, carry = 0;
		Node temp = null,res = null,pre = null;
		if(h1 == null && h2 == null)
			return null;
		while(h1 != null || h2 != null){
			sum = carry + (h1 != null ? h1.data :0) + (h2 != null ? h2.data :0);
			carry = (sum >= 10 ?1 : 0);
			sum = sum % 10;
			temp = new Node(sum);

			if(res == null){
				res = temp;
			}
			else{
				pre.next = temp;
			}
			pre = temp;
			if (h1 != null) {
                h1 = h1.next;
            }
            if (h2 != null) {
                h2 = h2.next;
            }
		}
		if(carry > 0){
			temp.next = new Node(carry);
		}
		return res;
	}


	void printLL(Node node){
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
}