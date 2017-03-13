class Node{
	int data;
	Node  left,right;
	Node(int key){
		data = key;
		left=right=null;
	}
}

class FixSwapedNodesBST{

	static Node root;
	public static void main(String[] args) {
		FixSwapedNodesBST obj = new FixSwapedNodesBST();
		obj.root = new Node(6);
		obj.root.left = new Node(10);
		obj.root.right = new Node(2);
		obj.root.left.left = new Node(1);
		obj.root.left.right = new Node(3);
		obj.root.right.left = new Node(7);
		obj.root.right.right = new Node(12);
		//Node first,middle,last,pre = null;

	//	System.out.println("Inorder Traversal of the original tree");
    	obj.printInorder(root);
		obj.correctBST(root);
		//System.out.println("Inorder Traversal of the corrected tree");
    	obj.printInorder(root);

	}
	void correctBST(Node node){
		Node first,middle,pre,last;
		first = middle = last = pre = null;
		correctUntilBST(node,first,middle,last,pre);
	//	System.out.print("first aftr func: "+first);
		//System.out.println("last: "+last);
		if(first != null && last != null){
			swap(first.data,last.data);
		}

			
		else if(first != null && middle != null)
			swap(first.data,middle.data);
	}
	void correctUntilBST(Node node,Node first,Node middle,Node last,Node pre){
		if(first == null && node != null){
			System.out.println("node value when first is null-- " + node.data);
		}
		if(node != null){
			correctUntilBST(node.left,first,middle,last,pre);
			if(pre != null && node.data < pre.data){
				System.out.println("node data: "+node.data);
				if(first == null){
					first = pre;
				//	System.out.println("first: "+first.data);
					middle = node;
				//	System.out.println("middle: "+middle.data);
				}
				else
					last = node;
			}
			pre = node;
		//	System.out.print("pre: "+pre.data);
			//System.out.println("node: "+node.data);
			//System.out.println("node first: "+first.data);

			correctUntilBST(node.right,first,middle,last,pre);
				//	System.out.println("node first after: "+first.data);
		//	if(node.data == 12){
		//	System.out.println("node: "+node.data);
		//	System.out.println("first data:"+first.data);

		//	}

		}
		
	}
	void swap(int node1,int node2){
		// System.out.print("in swap");
		// System.out.print("node1: "+node1);
		// System.out.println("node2: "+node2);
		int t = node1;
		node1 = node2;
		node2 = t;
	//  System.out.print("node2: "+node2);
	//	System.out.println("node1: "+node1);
	}
	void printInorder(Node node){
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}
}