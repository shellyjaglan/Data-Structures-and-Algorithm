class Node{
	int data;
	Node left,right;
	Node(int key){
		data = key;
		left= right= null;
	}
}

class CeilBST{
	static Node root;
	public static void main(String[] args) {
		CeilBST obj = new CeilBST();
		obj.root = new Node(8);
		obj.root.left = new Node(4);
		obj.root.right = new Node(12);
		obj.root.left.left = new Node(2);
		obj.root.left.right = new Node(6);
		obj.root.right.left = new Node(10);
		obj.root.right.right = new Node(14);

		int minimum = obj.min(root);
		System.out.println("min is: "+ minimum);
		for(int i = 0;i < 15;i ++){
			Node d = obj.ceil(root,i);
			int f = obj.floor(root,i,minimum);
			System.out.println(i + " ceil: " + d.data +" floor: "+ f);
			//System.out.println(i + " " + f);
		}

	}
	Node ceil(Node node,int key){
		Node pre = null;
		while(node != null){
			if(node.data > key){
				pre = node;
				node =node.left;
			}
			else if(node.data < key){
				node = node.right;
			}
			else{
				return node;
			}
		}
		return pre;
	}

	int floor(Node node,int key,int m){
		if(key < m){
			return key;
		}
		Node pre = null;
		while(node != null){
			if(node.data > key){
				node =node.left;
			}
			else if(node.data < key){
				pre = node;
				node = node.right;
			}
			else{
				return (node.data);
			}
		}
		return (pre.data);
	}
	int min(Node node){
		int m = 0;
		if(node == null)
			return 0;
		while(node != null){
			
			m = node.data;
			node = node.left;
		}
		return m;
	}
}