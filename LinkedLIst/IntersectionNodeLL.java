class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class IntersectionNodeLL{
	Node head, head2;
    public static void main(String[] args) {
		IntersectionNodeLL obj = new IntersectionNodeLL();

        obj.head = new Node(1);
		obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
		obj.head.next.next.next.next = new Node(5);

		// obj.head2 = new Node(1);
		// obj.head2.next = new Node(2);
        // obj.head2.next.next = new Node(2);
		// obj.head2.next.next.next = new Node(3);
		// obj.head2.next.next.next.next = new Node(5);
		obj.head2 = obj.head;

		//obj.printll(obj.head2);
		Node ans = obj.getIntersectionNode(obj.head, obj.head2);
		System.out.println("here ans node: "+ ans.data);
    }

	public Node getIntersectionNode(Node heada, Node headb) {
        if(heada == null || headb == null)
            return null;

          int len1 = 0, len2 = 0;
          Node curr1 = heada, curr2 = headb;

          while(curr1 != null){
              len1++;
              curr1 = curr1.next;
          }

          while(curr2 != null){
            len2++;
            curr2 = curr2.next;
          }
            
        if((len1 == 1 && len2 == 1) && (heada.data == headb.data)){
            return heada;
        }
        
        if(heada.next == headb || headb.next == heada)
            return heada;
        
          int diff = 0;
          diff = Math.abs(len1-len2);

          if(len1 > len2){
            while(diff > 0 && heada != null ){
              heada = heada.next;
              diff--;
            }
          }else{
            while(diff > 0 && headb != null){
              headb = headb.next;
              diff--;
            }
          }

        System.out.println("here heada: "+heada.data);
        System.out.println("here headb: "+headb.data);
        
          while(heada != null || headb != null){
            // if(heada.data == headb.data){
            //   return heada;
            // }
			if(heada == head){
				return heada;
			}
             if((heada.next != null && headb.next != null) && (heada.next == headb.next))
                 return heada.next;
             heada = heada.next;
             headb = headb.next;
          }

          return null;
    }

	void printll(Node head){
        while(head != null){
            System.out.print(head.data + "  ");
            head = head.next;
        }
    }
}