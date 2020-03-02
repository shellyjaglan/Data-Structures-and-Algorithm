class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class NodeAtDistance{
	static Node root;
	public static void main(String[] args) {
		NodeAtDistance tree = new NodeAtDistance();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
 
        tree.printKNode(root, 2);
		
	}

	int height(Node node) {
        if (node == null) {
            return 0;
        } else {
             
            /* compute the height of each subtree */
            int lHeight = height(node.left);
            int rHeight = height(node.right);
             
            /* use the larger one */
            return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
        }
    }

    int printKNode(Node node,int level){
    	if(node == null)
    		return 0 ;
    	if(level == 0){
    		System.out.print(node.data+" ");
    	}
    	else{
    		printKNode(node.left,level-1);
    		printKNode(node.right,level-1);
    	}
    	return 0;
    }
}