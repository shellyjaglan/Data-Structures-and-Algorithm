class Node{
	Node left,right ;
	int key;
	Node(int data){
		key = data;
		left = right = null;
	}
}

class TreeTraversalMember{

	//root as non-static class member
	Node root;

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

		TreeTraversal obj = new TreeTraversal();

		obj.root = new Node(2);

		obj.root.left = new Node(7);
		obj.root.right = new Node(5);
		obj.root.left.left = new Node(14);
		obj.root.left.right = new Node(6);
		obj.root.left.right.left = new Node(1);
		obj.root.left.right.right = new Node(11);
		obj.root.right.left = new Node(8);
		obj.root.right.right = new Node(9);
		obj.root.right.right.left = new Node(4);

		System.out.println(" ");

		System.out.print("postorder traversal for this tree is: ");
		obj.printPostorder(obj.root); 

		System.out.println(" ");

		System.out.print("inorder traversal for this tree is: ");
		obj.printInorder(obj.root);

		System.out.println(" ");

		System.out.print("preorder traversal for this tree is: ");
		obj.printPreorder(obj.root);

		System.out.println(" ");

	}

	
}