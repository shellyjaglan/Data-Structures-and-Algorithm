class Node{
	int data;
	Node left,right;
    Boolean isThreaded = false;
	Node(int item){
		data = item;
		left = right = null;
	}
}

class ThreadedTree{
    Node root;
    public static void main(String[] args){
        ThreadedTree obj = new ThreadedTree();

        obj.root = new Node(6);
		obj.root.left = new Node(3);
		obj.root.right = new Node(8);
		obj.root.left.left = new Node(1);
		obj.root.left.right = new Node(5);
		obj.root.right.left = new Node(7);
		obj.root.right.right = new Node(11);
        obj.root.right.right.left = new Node(9);
		obj.root.right.right.right = new Node(13);

        obj.makeThreadedTree(obj.root);
        obj.printInorder(obj.root);
    }

    public Node makeThreadedTree(Node node){
        if(node == null)
            return null;
        if(node.left == null && node.right == null)
            return node;
        
        if(node.left != null){
            Node node1 = makeThreadedTree(node.left);
           
            node1.right = node;
            node1.isThreaded = true;
        }

        if(node.right == null)
            return node;
        return makeThreadedTree(node.right);
    }

    public void printInorder(Node node){
        if(node == null)
            return;
        
        // Node curr = leftmostNode(node);
        // while(curr != null){
        //     System.out.print(curr.data + " ");

        //     if(curr.isThreaded){
        //         curr = curr.right;
        //     }else{
        //         curr = leftmostNode(curr.right);
        //     }
        // }

        while(node != null && node.left != null){
            node = node.left;
        }

        while(node != null){
            System.out.print(node.data + " ");

            if(node.isThreaded){
                node = node.right;
            }else{
                node = leftmostNode(node.right);
            }
        }
    }

    Node leftmostNode(Node node){
        while(node != null && node.left != null)
            node = node.left;
        return node;
    }
}