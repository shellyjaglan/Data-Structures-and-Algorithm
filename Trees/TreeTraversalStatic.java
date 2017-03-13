class Node{
	Node left,right ;
	int key;
	Node(int data){
		key = data;
		left = right = null;
	}
}

class TreeTraversalStatic{

	//root as static variable
	static Node root;

	static void printPostorder(Node node){
		if(node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key+" ");
	}


	static void printInorder(Node node){
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.key+" ");
		printInorder(node.right);
		
	}


	static void printPreorder(Node node){
		if(node == null)
			return;
		System.out.print(node.key+" ");
		printPreorder(node.left);
		printPreorder(node.right);
		
	}

	public static void main(String[] args) {

		TreeTraversal.root = new Node(2);

		TreeTraversal.root.left = new Node(7);
		TreeTraversal.root.right = new Node(5);
		TreeTraversal.root.left.left = new Node(14);
		TreeTraversal.root.left.right = new Node(6);
		TreeTraversal.root.left.right.left = new Node(1);
		TreeTraversal.root.left.right.right = new Node(11);
		TreeTraversal.root.right.left = new Node(8);
		TreeTraversal.root.right.right = new Node(9);
		TreeTraversal.root.right.right.left = new Node(4);

		System.out.println(" ");

		System.out.print("postorder traversal for this tree is: ");
		printPostorder(TreeTraversal.root); 

		System.out.println(" ");

		System.out.print("inorder traversal for this tree is: ");
		printInorder(TreeTraversal.root);

		System.out.println(" ");

		System.out.print("preorder traversal for this tree is: ");
		printPreorder(TreeTraversal.root);

		System.out.println(" ");

	}

	
}