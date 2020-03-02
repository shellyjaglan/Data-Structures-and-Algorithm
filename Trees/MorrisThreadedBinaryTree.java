class Node{
	int data;
	Node left,right;
    Boolean isThreaded = false;
	Node(int item){
		data = item;
		left = right = null;
	}
}

//Morris traversal is that we can do Inorder traversal without using stack or 
//recursion which saves us memory consumed by stack or recursion call stack.

//Reverse Morris traversal is just the reverse of Morris traversal which is 
//majorly used to do Reverse Inorder traversal with constant O(1) extra memory 
//consumed as it does not uses any Stack or Recursion.


class MorrisThreadedBinaryTree{
    Node head;

    public static void main(String[] args){
        MorrisThreadedBinaryTree obj = new MorrisThreadedBinaryTree();

        obj.head = new Node(50);
        obj.head.left = new Node(30);
        obj.head.right = new Node(70);
        obj.head.left.left = new Node(20);
        obj.head.left.right = new Node(40);
        obj.head.right.left = new Node(60);
        obj.head.right.right = new Node(80);

        int key = 40;

        Node ans = obj.threadedTree(obj.head, key);
        if(ans != null)
            System.out.println("here kth largest elem is: "+ ans.data);
    }

    Node threadedTree(Node node, int k){
        int count = 0;
        Node kth = null;
        Node pre = null;

        Node current = node;

        while(current != null){
            if(current.right == null){
                if(++count == k)
                    kth = current;
                current = current.left;
            }else{
                pre = current.right;

                while(pre.left != null && pre.left != current)
                    pre = pre.left;
                
                if(pre.left == null){
                    pre.left = current;
                    current = current.right;
                }else{
                    pre.left = null;
                    if(++count == k)
                        kth = current;

                    current = current.left;
                }
            }
        }

        return kth;
    }
}