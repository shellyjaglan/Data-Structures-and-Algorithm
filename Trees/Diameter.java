class Node{
	int key;
	Node left,right ;
	Node(int data){
		key = data;
		left = right = null;
	}
}
class Diameter{
	static Node root;
	public static void main(String[] args) {
		Diameter obj = new Diameter();
		// obj.root = new Node(1);
		// obj.root.left = new Node(2);
		// obj.root.right = new Node(3);
		// obj.root.left.left = new Node(4);
		// obj.root.left.right = new Node(5);
		// int l = obj.leftHeight(root);

		obj.root = new Node(2);
		obj.root.left = new Node(7);
		obj.root.right = new Node(5);
		obj.root.left.left = new Node(14);
		obj.root.left.right = new Node(6);
		obj.root.left.right.left = new Node(1);
		obj.root.left.right.right = new Node(11);
		obj.root.right.right = new Node(9);
		obj.root.right.right.left = new Node(4);



		int l = obj.leftHeight(root);
		System.out.println("lheight finall:"+l);
		int r = obj.rightHeight(root);
		System.out.println("rheight finall:"+r);
		int res = l +r -1;
		System.out.println("Level order traversal of binary tree is "+ res);
	}

	int leftHeight(Node node){
		
		
		if(node == null)
			return 0;
		else{
			
			System.out.println("node:"+node.key);
			int lheight = leftHeight(node.left);
			System.out.println("lheight:"+lheight);
			return (lheight+1);
		}
		
	}
	
	int rightHeight(Node node){
		if(node == null)
			return 0;
		else{
			
			System.out.println("node:"+node.key);
			int rheight = rightHeight(node.right);
			System.out.println("lheight:"+rheight);
			return (rheight+1);
		}
		
	}

}