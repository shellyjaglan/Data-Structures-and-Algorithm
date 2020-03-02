class Node{
	int data;
	Node next;
	Node(int key){
		data = key;
		next = null;
	}
}

class MergeList{
	Node list1,list2;
	public static void main(String[] args) {
		MergeList obj = new MergeList();

		//LengthOfLL obj1 = new LengthOfLL();

		//two sorted list
		obj.list1 = new Node(5);
		obj.list1.next = new Node(7);
		obj.list1.next.next = new Node(12);
		obj.list1.next.next.next = new Node(20);
		//obj.list1.next.next.next.next = new Node();

		//System.out.println("length of ll iss: "+ obj1.findLength(obj.list1));

		obj.list2 = new Node(7);
		obj.list2.next = new Node(9);
		obj.list2.next.next = new Node(15);
		obj.list2.next.next.next = new Node(20);
		// obj.list2.next.next.next.next = new Node(35);
		// obj.list2.next.next.next.next.next = new Node(45);

		//obj.list1 = new Node(0);
		Node res = obj.merge1(obj.list1,obj.list2);
	//	Node res = obj.merge2(obj.list1,obj.list2);
	//	Node res = obj.merge3(obj.list1,obj.list2);

		obj.printLL(res);
	}

	Node merge1(Node list1, Node list2){
		Node x;
	
		if(list1 == null && list2 == null)
			return null;
		if(list1 == null)return list2;
	 	if(list2 == null)return list1;

	 	if(list1.data > list2.data){
	 		x = list2;
	 		list2 = list2.next;
	 	}
	 	else{
	 		x = list1;
	 		list1 = list1.next;
	 	}
	 	Node head = new Node(x.data);
	 	Node res1 = head;

		while(list1 != null || list2 != null){
			if(list1 != null && list2 !=null){
				if(list1.data < list2.data){
				//	System.out.println("111");
					//list1 has smaller element
					res1.next = list1;
					list1 = list1.next;
				}
				else{
				//	System.out.println("222");
					//list2 has smaller element
					res1.next = list2;
					list2 = list2.next;
				}
				res1 = res1.next;	
			}
			else if(list1 == null){
			//	System.out.println("1 is null");
			//list1 is empty
				res1.next = list2;
				list2 = list2.next;
				res1 = res1.next;
			}
			else if(list2 == null){
			//	System.out.println("2 is null");
				res1.next = list1;
				list1 = list1.next;
				res1 = res1.next;
			}
		}
		return head;
	}

	// Node merge2(Node list1,Node list2){

	// 	if(list1 == null && list2 == null)
	// 		return;
	// 	if(list1 == null)return list2;
	// 	if(list2 == null)return list;

	// 	Node head;
	// 	if(list1.data < list2.data){
	// 		head = list1;
	// 	}
	// 	else{
	// 		head = list2;
	// 		list2 = list1;
	// 		list1 = head;
	// 	}
	// 	while(list1 != null){
	// 		if(list1.data > list2.data){
	// 			Node temp = list1.data;
	// 			list1.data = list2.data;
	// 			list2.data = temp;
	// 			list1 = list1.next;
	// 		}
	// 		list1 = list1.next;
	// 	}
	// 	list1.next = list2;
	// 	return head;
	// }

	Node merge3(Node list1,Node list2){

		if(list1 == null && list2 == null)
			return null;
		if(list1 == null)return list2;
		if(list2 == null)return list1;

		if(list1.data < list2.data){
			list1.next = merge3(list1.next,list2);
			return list1;
		}
		else{
			list2.next = merge3(list1,list2.next);
			return list2;
		}
	}

	void printLL(Node node){
		while(node!= null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
}