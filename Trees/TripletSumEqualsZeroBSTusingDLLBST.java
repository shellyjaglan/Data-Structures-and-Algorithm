//this java program finds whether there three int numbers such that the sum equals 0
//we are first converting the balanced binary tree into doubly link list
//time com is O(n^2) nad extra space used is log(n).
//this the better solution as compared to others.
class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left = right = null;
	}
}


class TripletSumEqualsZeroBSTusingDLLBST{
	static Node root= null;
	public static void main(String[] args) {
		TripletSumEqualsZeroBSTusingDLLBST obj = new TripletSumEqualsZeroBSTusingDLLBST();
		root= obj.insert(root,6);
		root= obj.insert(root,-12);
		root=obj.insert(root,8);
		root=obj.insert(root,4);
		root=obj.insert(root,-22);
		root=obj.insert(root,10);
		boolean bo = obj.isTripletPresent(root);
		if(bo == true){
			System.out.println("present");
		}
		else
			System.out.println("not present");

	}
	Node insert(Node root, int key)
	{
	    if (root == null)
	       return new Node(key);
	    if (root.data > key)
	       root.left = insert(root.left, key);
	    else
	       root.right = insert(root.right, key);
	    return root;
	}
 

	boolean isTripletPresent(Node root){
		Node head,tail;
		head= tail = null;
		if(root == null){
			return false;
		}
		//calls dll conversion
		convertBSTtoDLL(root,head,tail);
		System.out.println("sdsdsdd");
		if(head == null)
			System.out.println("head vallll: ");
		System.out.println("tail vallll: "+ tail.data);
		while((head.right != tail) && (head.data < 0)){
			System.out.println("head -ve: "+head.data);

			if(isPresentInDLL(head,tail,head.data)){
				return true;
			}
			else{
				head = head.right;
			}
		}
		return false;
	}
	void convertBSTtoDLL(Node root,Node head,Node tail){
		// System.out.println("root node: "+root.data);
		// if(head == null)
		// 	System.out.println("head null ");
		// if(tail == null)
		// 	System.out.println("tail nail");
		if(root == null)
			return;
		if(root.left != null)
			convertBSTtoDLL(root.left,head,tail);
		root.left = tail;
		if(tail == null){
			System.out.println("node: "+root.data);
			head = root;
			System.out.println("head: "+head.data);
		}
		else{
			tail.right = root;
		}
		tail = root;
		System.out.println("tail: "+tail.data);
		System.out.println("head: "+head.data);

		if(root.right != null){
			convertBSTtoDLL(root.right,head,tail);
		}
	}

	boolean isPresentInDLL(Node head,Node tail,int sum){
		while(head != tail){
			int s = head.data + tail.data;
			if(s == sum){
				return true;
			}
			else if(s < sum){
				head = head.right;
			}
			else if(s > sum){
				tail = tail.left;
			}
		}
		return false;
	}


}