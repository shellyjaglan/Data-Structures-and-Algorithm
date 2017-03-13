class Node{
	int data;
	Node left,right;
	Node(int key){
		data = key;
		left=right=null;
	}
}

class MinBSTNode{
	static Node root;
	public static void main(String[] args) {
		MinBSTNode obj = new MinBSTNode();
		obj.insert(50);
		//obj.insert(30);
		//obj.insert(20);
		obj.insert(40);
		obj.insert(70);
		obj.insert(60);
		obj.insert(80);
		obj.insert(90);

		obj.min(root);
	}
	void insert(int key){
		if(root != null){
	  	//	System.out.println("root initially: "+ root.data);  
		}
		else{
	    //	System.out.println("root initially: "+ root);
		}
		root = insertRecur(root,key);
		//System.out.println("node is: "+ root.data);

	}
	Node insertRecur(Node node,int key){
		if(node == null){
			node = new Node(key);
		//	System.out.println("node in if null: "+node.data);
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
	void min(Node node){
		//Node min;
		node = minRecur(node);
		System.out.println("the mini node is: "+node.data);
	}
	Node minRecur(Node node){
		if(node == null)
			return node;
		if(node.left == null){
			System.out.println("node is: "+node.data);
			//this is the node we looking for
			return node;
		}
		else{
			node.left = minRecur(node.left);
			return node.left;
		}
		//return node;
	}


	int minvalue(Node node) {
        Node current = node;
 
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    
}