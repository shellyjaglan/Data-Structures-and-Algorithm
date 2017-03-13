class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left=right = null;
	}
}

class PreOrderTraversalWithoutRecursion{
	Node head;
	public static void main(String[] args) {
		PreOrderTraversalWithoutRecursion obj = new PreOrderTraversalWithoutRecursion();
		obj.head = new Node(50);
		obj.head.left = new Node(30);
		obj.head.left.left = new Node(20);
		obj.head.left.left.left = new Node(10);
		obj.head.left.right = new Node(40);
		obj.head.left.left.right = new Node(25);

		obj.head.right = new Node(70);
		obj.head.right.right = new Node(80);
		obj.head.right.left = new Node(60);
		obj.head.right.right.right = new Node(100);

		System.out.println("preorder traversal is: "+obj.printPreOrder(obj.head));
		System.out.println("inorder traversal is: "+obj.printInOrder(obj.head));
	}
	void printPreOrder(Node node){
		 // Base Case
        if (node == null) {
            return;
        }
 
        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(head);
 
        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {
             
            // Pop the top item from stack and print it
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();
 
            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
	}
	void printInOrder(Node node){
		if(node == null)
			return;
		printInOrder(node.left);
		System.out.println(node.data);
		printInOrder(node.right);
	}
}