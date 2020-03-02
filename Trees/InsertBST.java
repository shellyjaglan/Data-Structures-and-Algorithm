class Node{
	int data;
	Node left,right;
	Node(int key){
		data = key;
		left=right=null;
	}
}

class InsertBST{ 
	static Node root;
	public static void main(String[] args) {
		InsertBST obj = new InsertBST();
		obj.insert(50);
		obj.insert(30);
		obj.insert(20);
		obj.insert(40);
		obj.insert(70);
		obj.insert(60);
		obj.insert(80);
		obj.insert(90);

		obj.inorder(root);
	}
	void insert(int key){
		if(root != null){
	  		System.out.println("root initially: "+ root.data);  
		}
		else{
	    	System.out.println("root initially: "+ root);
		}
		root = insertRecur(root,key);
		System.out.println("node is: "+ root.data);

	}
	Node insertRecur(Node node,int key){
		if(node == null){
			node = new Node(key);
			System.out.println("node in if null: "+node.data);
			return node;
		}
		if(key < node.data){
			node.left = insertRecur(node.left,key);
		}
		if(key > node.data){
			node.right = insertRecur(node.right,key);
		}
		return node;
	}
	void inorder(Node node){
		//inorderRecur(root);
		if(node != null){
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	void inorderRecur(Node node){
		if(node != null){
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
}