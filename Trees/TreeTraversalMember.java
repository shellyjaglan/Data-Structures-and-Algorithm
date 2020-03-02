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

	// class mycolor{
	// 	static string count_of_objects;
	// 	String color;
	// 	void mycolor(String color) {
	// 		this.color = color;
	// 		count_of_objects += 1;
	// 	}
	// }

	// mycolor n1 = new mycolor('red');
	// mycolor n2 = new mycolor('yellow');

	// n2.color = 'black'
	// n2.count_of_objects = 3




	public static void main(String[] args) {

		TreeTraversalMember obj = new TreeTraversalMember();

		// obj.root = new Node(2);
		// obj.root.left = new Node(7);
		// obj.root.right = new Node(5);
		// obj.root.left.left = new Node(14);
		// obj.root.left.right = new Node(6);
		// obj.root.left.right.left = new Node(1);
		// obj.root.left.right.right = new Node(11);
		// obj.root.right.left = new Node(8);
		// obj.root.right.right = new Node(9);
		// obj.root.right.right.left = new Node(4);


		//second tree...
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.left.right = new Node(5);
		obj.root.left.left.right.left = new Node(6);
		obj.root.left.left.right.right = new Node(7);
		obj.root.right.left = new Node(8);

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