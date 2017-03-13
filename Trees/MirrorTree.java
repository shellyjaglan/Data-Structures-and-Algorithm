import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class MirrorTree{
	Node root;
	public static void main(String[] args) {
		MirrorTree obj = new MirrorTree();
		obj.root = new Node(10);
		obj.root.left = new Node(5);
		obj.root.right = new Node(20);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(7);
	//	obj.root.right.right = new Node(30);

		System.out.println("inorder before: ");
		obj.inorder(obj.root);
		Node n = obj.createMirror(obj.root);
		System.out.println("inorder after: ");
		obj.inorder(n);
	}

	Node createMirror(Node node){
		if(node == null){
			return null;
		}
		Node temp = createMirror(node.left);
		node.left = createMirror(node.right);
		node.right = temp;
		return node;
	}

	void inorder(Node node){
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+"  ");
		inorder(node.right);
	}
}