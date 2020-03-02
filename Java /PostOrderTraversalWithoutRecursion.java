import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left=right = null;
	}
}

class PostOrderTraversalWithoutRecursion{
	Node head;
	public static void main(String[] args) {
		PostOrderTraversalWithoutRecursion obj = new PostOrderTraversalWithoutRecursion();
		obj.head = new Node(50);
		obj.head.left = new Node(30);
		obj.head.left.left = new Node(20);
		obj.head.left.left.left = new Node(10);
		obj.head.left.right = new Node(40);
		obj.head.left.left.right = new Node(25);
		obj.head.right = new Node(700);
		obj.head.right.right = new Node(80);
		obj.head.right.left = new Node(5);
		obj.head.right.right.right = new Node(100);

		obj.printPostOrder(obj.head);
		System.out.println();

		obj.head = new Node(10);
		obj.head.left = new Node(5);
		obj.head.left.left = new Node(1);
		obj.head.left.right = new Node(7);
		obj.head.right = new Node(20);
		obj.head.right.left = new Node(15);
		obj.head.right.right = new Node(30);

		System.out.print("post : ");
		obj.printPostOrder(obj.head);
		System.out.println();

		System.out.print("pre : ");
		obj.printPreOrder(obj.head);
		System.out.println();

		System.out.print("inorder : ");
		obj.printInOrder(obj.head);
		System.out.println();


		//System.out.println("preorder traversal is: "+obj.printPreOrder(obj.head));
		//System.out.println("inorder traversal is: "+obj.printInOrder(obj.head));
	}
	void printPostOrder(Node node){
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		if(node == null)
			return;
		s1.push(node);

		while(s1.size() > 0){
			node = s1.pop();
			s2.push(node);

			if(node.left != null)
				s1.push(node.left);
			if(node.right != null)
				s1.push(node.right);

		}

		while(s2.size() > 0){
			node = s2.pop();
			System.out.print(node.data +"  ");
		}
	}
	void printInOrder(Node node){
		if(node == null)
			return;
		printInOrder(node.left);
		System.out.print(node.data+" ");
		printInOrder(node.right);
	}

	void printPreOrder(Node node){
		if(node == null)
			return;
		System.out.print(node.data+" ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
}