class Node{
	int data;
	Node left,right;
	Node(int key){
		data = key;
		left = right = null;
	}	
}

class ChangeNodeBST{
	Node root ;
	public static void main(String[] args) {
		ChangeNodeBST obj = new ChangeNodeBST();
		// obj.root = new Node(50);
		// obj.root.left = new Node(30);
		// obj.root.right = new Node(70);
		// obj.root.right.right = new Node(80);
		// obj.root.right.left = new Node(60);
		// obj.root.left.left = new Node(20);
		// obj.root.left.right= new Node(40);
		
		obj.root = obj.insert(obj.root,50);
		obj.root = obj.insert(obj.root,30);
		obj.root = obj.insert(obj.root,40);
		obj.root = obj.insert(obj.root,20);
		obj.root = obj.insert(obj.root,60);
		obj.root = obj.insert(obj.root,70);
		obj.root = obj.insert(obj.root,80);
		obj.root = obj.insert(obj.root,90);

		System.out.println("old inorder ");
		obj.printInorder(obj.root);

		int oldNode = 40;
		int newNode = 10;
		obj.root = obj.changeKey(obj.root,oldNode,newNode);

		System.out.println("new inorder ");
		obj.printInorder(obj.root);


	} 

	Node insert(Node node,int key){
		if(node == null){
			node = new Node(key);
			return node;
		}
		if(key < node.data){
			node.left = insert(node.left,key);
		}
		else if(key > node.data){
			node.right = insert(node.right,key);
		}
		return node;
	}

	void printInorder(Node node){
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}
	Node changeKey(Node node,int oldNode,int newNode){
		//delete the old node first.
		node = deleteNode(node,oldNode);
		//then insert the new node
		node = insert(node,newNode);
		return node;
	}
	Node deleteNode(Node node,int key){
		if(node == null)
			return node;
		if(key < (node.data)){
			node.left = deleteNode(node.left,key);
		}
		else if(key > (node.data)){
			node.right = deleteNode(node.right,key);
		}
		//means key == node.data
		else{
			if(node.left == null){
				return node.right ;
			}
			if(node.right == null){
				return node.left;
			}
			if(node.left != null && node.right != null){
				//both left and right childs are present 
				// so the node here will be replaced by the
				// minimum node in the right sub tree.
				Node temp = minimum(node.right);
				node.data = temp.data;
				//we have now replaced the node with the mini in the right tree
				//now we have to remove that mini node from right sub tree.
				node.right = deleteNode(node.right,node.data);
			}
		}
		return node;
	}
	Node minimum(Node node){
		Node current = node;
		while(current.left != null){
			current = current.left;
		}
		return current;
	}
}