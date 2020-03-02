//pallindrome in ll...

class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class PallindromeLL{
	Node head, end1, start2,start1;
    public static void main(String[] args) {
        PallindromeLL obj = new PallindromeLL();

		obj.head = new Node(1);
		obj.head.next = new Node(2);
        obj.head.next.next = new Node(2);
		obj.head.next.next.next = new Node(3);

		// obj.head.next.next = new Node(3);
		// obj.head.next.next.next = new Node(4);
		// obj.head.next.next.next.next = new Node(5);

        //System.out.println(obj.ifPallindrome(obj.head));

        // Node ans = obj.remove(obj.head, 1);
        // obj.printll(ans);

        System.out.println(obj.checkPractice(obj.head));
    }

    public boolean checkPractice(Node head){
        int len = 0;
        Node curr = head;
        Node pre = null;
        Node next = null;
        Node start1, start2;

        while(curr != null){
            len++;
            curr = curr.next;
        }

        int mid = (int)Math.floor(len/2);

        while(mid > 0 && curr != null){
            next = curr.next; 
            curr.next = pre; 
            pre = curr; 
            curr = next;
            mid--;
        }

        start1 = pre;
        start2 = curr;
    
        if(len%2 != 0 && start2 != null)
            start2 = start2.next;


        while(start1 != null && start2 != null){
            if(start1.data != start2.data){
                return false;
        }
            start1 = start1.next;
            start2 = start2.next;
        }

        return true;
    }

    public Node remove(Node head, int n){
        //remove the nth element from the end ...function...
        if(n <= 0)
            return head;
        int len = findLength(head);
        if(n >= len){
            return head.next;
        }

        if(n == 1 && len == 1)
            return null;
        Node pre, current;
        current = head;
        pre = null;
        
        for(int i=0 ; i<(len-n) ; i++){
            pre = current;
            current = current.next;
        }
        if(current != null){
            pre.next = current.next;
        }

        return head;
    }

    public boolean ifPallindrome(Node head){
        //returns if the ll is a paliindrome or not...
        if(head == null)
            return false;
        if(head.next == null)
            return true;

        //Node end1, start1, start2;
        end1 = start2 = null;
        start1 = head;

        int len = findLength(head);
        int mid = len/2;

        reverse(start1, mid);
        if(len%2 == 0 ){
          
        }else{
            if(start2 != null)
                start2 = start2.next;
        }

        return compare();
    }

    public boolean compare(){
        System.out.println("here in comapre");
        Node s1 = end1;
        Node s2 = start2;

        while(s1 != null && s2 != null){
            if(s1.data != s2.data){
                return false;
            }
            s1 = s1.next;
            s2= s2.next;
        }
        return true;
    }

    public void reverse(Node head, int mid){
        if(head == null || head.next == null)
            return;

        Node next = null;
        Node pre = null;
        Node node = head;

        while(mid > 0 && node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
            mid--;
        } 

        end1 = pre;
        start2 = node;
      //  System.out.println("here end start etc: "+ end1.data+ " " + start2.data);
        return;
        
    //original reverse....
        // Node next = null;
        // Node pre = null;
        // Node node = head;

        // while(node != null) {
        //     next = node.next;
        //     node.next = pre;
        //     pre = node;
        //     node = next;
        // } 

        // head = pre;
        // return head;
    }

    void printll(Node head){
        while(head != null){
            System.out.print(head.data + "  ");
            head = head.next;
        }
    }

    int findLength(Node node){
        int len = 0;
        if(node == null)
            return 0;

        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }
}