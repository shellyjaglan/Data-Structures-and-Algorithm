class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class Width{
	static Node root;
	public static void main(String[] args) {
		Width tree = new Width();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);
 
        System.out.println("Maximum width is " + tree.getMaxWidth(root));
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

    int getMaxWidth(Node node){
    	int maxWidth = 0;
        int width;
        int h = height(node);
        int i;
 
        /* Get width of each level and compare 
         the width with maximum width so far */
        for (i = 1; i <= h; i++) {
            width = getWidth(node, i);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
 
        return maxWidth;
    }

    int getWidth(Node node,int level){
    	if(node == null)
    		return 0;
    	if(level == 1)
    		return 1;
    	else if(level > 1){
    		int a = getWidth(node.left,level-1);
    		int b = getWidth(node.right,level-1);
    		return (a+b);
    	}
    	return 0;
    }

}