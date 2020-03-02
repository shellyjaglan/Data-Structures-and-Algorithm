class Node{
	int data;
	Node left,right;
	Node(int key){
		data = key;
		left = right=null;
	}
}

class InorderPreSucOfNodeInBST{
	static Node root;
	public static void main(String[] args) {
		InorderPreSucOfNodeInBST obj = new InorderPreSucOfNodeInBST();
		obj.insert(50);
		obj.insert(30);
		obj.insert(20);
		obj.insert(40);
		obj.insert(70);
		obj.insert(60);
		obj.insert(80);
		obj.insert(90);

		int key = 30;
		Node pre = null;
		Node suc = null;
		obj.predecessorAndSuccessor(root,key,pre,suc);
		//System.out.println("for your key "+key);
		if(pre != null){
			System.out.println("predecessor "+pre.data);
		}
		else{
			System.out.println("no predecessor ");

		}
	//	System.out.println("Successor "+suc.data);
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

	void predecessorAndSuccessor(Node node,int key,Node pre,Node suc){
		if(node == null)
			return;
		if(node.data == key){
			System.out.println("node = key"+node.data);
			if(node.left != null){
				Node temp = node.left;
				while(temp.right != null){
					temp = temp.right;
				}
				pre = temp;
				System.out.println("pre value"+pre.data);

			}
			if(node.right != null){
				Node temp = node.right;
				while(temp.left != null){
					temp = temp.left;
				}
				suc = temp;
				System.out.println("suc value"+suc.data);
			}
			return;
		}
		if(node.data > key){
				System.out.println("in key < node"+node.data);
			suc = node;
			predecessorAndSuccessor(node.left,key,pre,suc);
		}
		if(node.data < key){
			pre = node;
			predecessorAndSuccessor(node.right,key,pre,suc);
		}
		//return;
	}	
}