class Node{
	int data;
	Node left,right;
	Node(int key){
		data = key;
		left=right=null;
	}
}

class LowestCommonAncestor{
	static Node root = null;
	public static void main(String[] args) {
		LowestCommonAncestor obj = new LowestCommonAncestor();
		obj.insert(20);
		obj.insert(22);
		obj.insert(8);
		obj.insert(12);
		obj.insert(4);
		obj.insert(10);
		obj.insert(14);
		int key1 = 10;
		int key2 = 14;
		
		Node ans = obj.lST(root,key1,key2);
		System.out.println("the lST of "+key1 +" "+ key2 +"is:"+ans.data);

	}

	Node lST(Node node,int n1,int n2){
		if(node == null)
			return null;
		if(node.data > n1 && node.data > n2){

			return lST(node.left,n1,n2);
		}
		if((node.data < n1) && (node.data < n2)){
			return lST(node.right,n1,n2);
		}
		if(node.data > n1 && node.data < n2){
			//System.out.println("in if 3"+node.data);
			return node;
		}
		return node;
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