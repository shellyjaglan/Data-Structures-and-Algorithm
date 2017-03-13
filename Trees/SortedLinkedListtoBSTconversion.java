class BSTNode{
	int data;
	BSTNode left,right;
	 BSTNode(int item){
		data = item;
		left = right = null;
	}
}

class Node{
	int data;
	Node next;
	 Node(int item){
		data = item;
		next = null;
	}
}

class SortedLinkedListtoBSTconversion{
	public static Node head= null;

	// SortedLinkedListtoBSTconversion(){
	// 		Node(1);
	// 		BSTNode(1);
	// 	}

	public static void main(String[] args) throws java.lang.Exception{
		SortedLinkedListtoBSTconversion obj = new SortedLinkedListtoBSTconversion();
		

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		//head tail = new Node(7);
		//head.next.next.next.next.next.next = tail;
		int s = obj.size();
		BSTNode ans = obj.LLtoBST(1,s);
		System.out.println("the bst made inorder is:");
		obj.inorder(ans);
	}

	int size(){
		Node curr = head;
		int size = 0;
		while(curr != null){
			curr = curr.next;
			size++;
		}
		return size;
	}

	void inorder(BSTNode root){
		if(root == null)
			return;
		inorder(root.left);
		System.out.println(" "+root.data);
		inorder(root.right);
	}

	BSTNode LLtoBST(int start,int end){
		if(start > end)
			return null;
		int mid = (start + end)/2;
		BSTNode leftnode = LLtoBST(start,mid-1);
		BSTNode root = new BSTNode(head.data);
		root.left = leftnode;
		head = head.next;
		root.right = LLtoBST(mid+1,end);
		return root;
	}

}