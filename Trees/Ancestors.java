class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}


class Ancestors{
	static Node root;
	
	public static void main(String[] args) {
		Ancestors tree = new Ancestors();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
 
        tree.printAncestors(root, 7);
 
	}

	boolean printAncestors(Node node,int target){
		if(node == null)
			return false;
		if(node.data == target)
			return true;
		if(printAncestors(node.left,target) || printAncestors(node.right,target)){
			System.out.print(node.data+" ");
			return true;
		}
		return false;
	}
}