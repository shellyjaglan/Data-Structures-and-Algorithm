class Node{
	int key;
	Node left,right ;
	Node(int data){
		key = data;
		left = right = null;
	}
}

class SizeofTree{
	static Node root;

	public static void main(String[] args) {
		SizeofTree obj = new SizeofTree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		System.out.println("the size of binary tree is"+ obj.sizeofTree(root));
		//obj.sizeofTree(root);	
	}
	int sizeofTree(Node node){
		int lsize,rsize;
		if(node == null)
			return 0;
		else{
		//	System.out.println("node is:"+node.key);
			 lsize = sizeofTree(node.left);
		//	  System.out.println("lsize:"+lsize);

		//	  System.out.println("node is:"+node.key);
			  rsize = sizeofTree(node.right);
		//	  System.out.println("rsize:"+rsize);
			//return (sizeofTree(node.left) +1 + sizeofTree(node.right));
		}
		return (lsize+1+rsize);
		
	}
}