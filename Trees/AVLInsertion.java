class Node{
	int data,height;
	Node left,right;
	Node(int key){
		data = key;
		height = 1;
		left=right=null;
	}
}

class AVLInsertion{
	static Node root;
	public static void main(String[] args) {
		AVLInsertion obj = new AVLInsertion();

		root = obj.insert(root,10);
	//	System.out.println("root1: "+root.data);
		root = obj.insert(root,5);
	//	System.out.println("root2: "+root.data);
		root = obj.insert(root,20);
	//	System.out.println("root3 is: "+root.data);
		root = obj.insert(root,30);
	//	System.out.println("root4 is: "+root.data);
		
		root = obj.insert(root,35);
	//	System.out.println("root5 is: "+root.data);
		root = obj.insert(root,25);
	//	System.out.println("root6 is: "+root.data);

		// obj.insert(root,40);
		// obj.insert(root,50);
		// obj.insert(root,25);

		System.out.println("The inorder traversal of constructed tree is : ");
        obj.inOrder(root);
	}
	Node insert(Node node,int key){
		if(node == null){
			//add new node
			return (new Node(key));
		}
		if(key < node.data){
			node.left = insert(node.left,key);
		}
		else
			node.right = insert(node.right,key);

		node.height = max(height(node.left),height(node.right)) + 1;
		//System.out.println("node is: "+node.data +" height is: "+node.height);

		int balanced = getBalanced(node);
		if(balanced > 1 && (key < node.left.data)){
			System.out.println("in 1 node is: "+node.data);
			return rightRotate(node);
		}
		if(balanced > 1 && (key > node.left.data)){
			System.out.println("in 2 node is: "+node.data);
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		if(balanced < -1 && (key > node.right.data)){
			System.out.println("in 3 node is: "+node.data);
			return leftRotate(node);
		}
		if(balanced < -1 && (key < node.right.data)){
			System.out.println("in 4 node is: "+node.data);
			node.right = rightRotate(node.right);
			return rightRotate(node);
		}
		return node;
	}
	int max(int a,int b){
		return (a > b)?a:b;
	}
	int height(Node node){
		if(node == null)
			return 0;
		return (node.height);
	}
	int getBalanced(Node node){
		if(node == null)
			return 0;
		return height(node.left) - height(node.right);
	}
	Node leftRotate(Node x){
		System.out.println("x is: "+x.data);
		Node y = x.right;
		System.out.println("y is: "+ y.data);
		Node T2 = y.left;
		if(T2 != null)
			System.out.println("t2 is: "+ T2.data);

		y.left = x;
		x.right = T2;

		System.out.println("y left is: "+ x.data);
		System.out.println("x right is: "+ T2.data);

		x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
 
        
        return y;
	}
	
	Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
 
        // Return new root
        return x;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
}	