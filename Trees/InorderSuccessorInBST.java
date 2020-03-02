class Node{
	int data;
	Node left,right,parent;
	Node(int key){
		data = key;
		left=right=parent=null;
	}
}


class InorderSuccessorInBST{
	static Node root;
	public static void main(String[] args) {
		InorderSuccessorInBST obj =  new InorderSuccessorInBST();
		root= obj.insert(root,20);
		root=obj.insert(root,22);
		root=obj.insert(root,8);
		root=obj.insert(root,12);
		root=obj.insert(root,4);
		root=root=obj.insert(root,10);
		root=obj.insert(root,14);
		//int key = 8;
		System.out.println("root: "+root.data);
		Node temp = root.right;
		Node ans = obj.findSucc(root,temp);
		if(ans != null){
			System.out.println("the succ of "+temp.data+" "+"is: "+ans.data);
		}
		else
			System.out.println("no succ found");
	}
	Node findSucc(Node root,Node node){
		
		if(node.right != null){
			return min(node.right);
		}
		
		Node p = node.parent;
		while(p != null && node == p.right){
			node = p;
			p = p.parent;
		}
		return p;
		
	}
	Node min(Node node){
		Node current = node;
		while(current.left != null){
			current = current.left;
		}
		return current;
	}

	
	Node insert(Node node,int key){
		if(node == null){
			node = new Node(key);
			return node;
		}
		else{
			Node temp = null;
			
			if(key < node.data){
				temp = insert(node.left,key);
				node.left = temp;
				temp.parent = node;
			}
			else{
				temp = insert(node.right,key);
				node.right = temp;
				temp.parent = node; 
			}
			return node;
		}
	}
}