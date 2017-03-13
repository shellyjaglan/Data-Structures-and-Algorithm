class Node{
	int data;
	Node left,right,parent;
	Node(int key){
		data = key;
		left=right=parent=null;
	}
}
class KthSmallestBST{
	public static void main(String[] args) {
		KthSmallestBST obj = new KthSmallestBST();
	}

	void insert(int key){
		root = insertRecur(root,key);
	}
	Node insertRecur(Node node,int key){
		if(node == null){
			node = new Node(key);
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
}