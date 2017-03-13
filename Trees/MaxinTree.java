class Node{
	int key;
	Node left,right ;
	Node(int data){
		key = data;
		left = right = null;
	}
}


class MaxinTree{
	static Node root;
	public static void main(String[] args) {
		MaxinTree obj = new MaxinTree();
		obj.root = new Node(2);
		obj.root.left = new Node(7);
		obj.root.right = new Node(5);
		obj.root.left.left = new Node(14);
		obj.root.left.right = new Node(6);
		obj.root.left.right.left = new Node(1);
		obj.root.left.right.right = new Node(11);
		obj.root.right.left = new Node(8);
		obj.root.right.right = new Node(9);
		obj.root.right.right.left = new Node(4);

		// int maxi = root.key;
		//System.out.println("maxi:"+ maxi);
		System.out.println("the max of binary tree is: "+ obj.max(root));
		System.out.println("the min of binary tree is: "+ obj.min(root));
	}

	int max(Node node){
		if(node == null)
			return Integer.MIN_VALUE;
		int res = node.key;
		int lmax  = max(node.left);
		int rmax = max(node.right);
		if(lmax > res)
			res = lmax;
		if(rmax > res)
			res = rmax;
		
	return res;
	}

	int min(Node node){

		if(node == null){
			System.out.println("in null node");
			return Integer.MAX_VALUE;
		}

		int res = node.key;
		System.out.println("node val:"+node.key);
		int lmin  = min(node.left);
		int rmin = min(node.right);
		if(lmin < res)
			res = lmin;
		if(rmin < res)
			res = rmin;
		
	return res;
	}

}