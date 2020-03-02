class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class SubtreeCheck{

	static Node root1 ,root2;

	public static void main(String[] args) {
		SubtreeCheck tree = new SubtreeCheck();

		tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4);
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);
  		
  		tree.root2 = new Node(10);
        tree.root2.right = new Node(6);
        tree.root2.left = new Node(4);
        tree.root2.left.right = new Node(30);
  
        if (tree.isSubtree(tree.root1, tree.root2))
            System.out.println("Tree 2 is subtree of Tree 1 ");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");

	}
	boolean isSubtree(Node t,Node s){
		if(s == null)
			return true;
		if(t == null)
			return false;
		if(areIdentical(t,s))
			return true;
		return isSubtree(t.left,s) || isSubtree(t.right,s);
	}
	boolean areIdentical(Node node1, Node node2){
		if(node1 == null && node2 == null)
			return  true;
		if(node1 == null || node2 == null)
			return false;
		return(root1.data == root2.data && areIdentical(root1.left,root2.left) 
			&& areIdentical(root1.right,root2.right));
	}
}