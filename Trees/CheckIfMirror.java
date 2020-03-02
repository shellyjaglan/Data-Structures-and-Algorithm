import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class CheckIfMirror{
	Node root;
	public static void main(String[] args) {
		CheckIfMirror obj = new CheckIfMirror();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(2);
		obj.root.left.left = new Node(3);
		obj.root.left.right = new Node(4);
		obj.root.right.left = new Node(4);
        //obj.root.right.right = new Node(4);
		//obj.root.left.left = new Node(3);

		
		System.out.println(obj.ismirror(obj.root.left, obj.root.right));
	}

	boolean ismirror(Node a, Node b){
        if(a == null && b == null)
            return true;
        if(a!= null && b != null){
            return (
                a.data == b.data &&
                ismirror(a.left, b.right) &&
                ismirror(a.right, b.left)
            );
        }

        return false;
    }



	void inorder(Node node){
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+"  ");
		inorder(node.right);
	}
}