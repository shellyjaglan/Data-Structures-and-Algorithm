class Node{
	Node left,right ;
	int key;
	Node(int data){
		key = data;
		left = right = null;
	}
}

class TreeTraversalLocal{

	void printPostorder(Node node){
		if(node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key+" ");
	}


	void printInorder(Node node){
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.key+" ");
		printInorder(node.right);
		
	}


	void printPreorder(Node node){
		if(node == null)
			return;
		System.out.print(node.key+" ");
		printPreorder(node.left);
		printPreorder(node.right);
		
	}

	public static void main(String[] args) {

		//root as local variable
		Node root = new Node(2);

		TreeTraversal obj = new TreeTraversal();

		root.left = new Node(7);
		root.right = new Node(5);
		root.left.left = new Node(14);
		root.left.right = new Node(6);
		root.left.right.left = new Node(1);
		root.left.right.right = new Node(11);
		root.right.left = new Node(8);
		root.right.right = new Node(9);
		root.right.right.left = new Node(4);

		System.out.println(" ");

		System.out.print("postorder traversal for this tree is: ");
		obj.printPostorder(root); 

		System.out.println(" ");

		System.out.print("inorder traversal for this tree is: ");
		obj.printInorder(root);

		System.out.println(" ");

		System.out.print("preorder traversal for this tree is: ");
		obj.printPreorder(root);

		System.out.println(" ");

	}

	
}