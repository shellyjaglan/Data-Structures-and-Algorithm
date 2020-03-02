import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left=right = null;
	}
}


class InOrderTraversalWithoutRecursion{
	Node head;
	public static void main(String[] args) {
		InOrderTraversalWithoutRecursion obj = new InOrderTraversalWithoutRecursion();

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
		obj.printInOrder(obj.head);
	//	System.out.println("preorder traversal is: "+obj.printPreOrder(obj.head));
	//	System.out.println("inorder traversal is: "+obj.printInOrder(obj.head));	
	}

	void printInOrder(Node node){
		if(node == null)
			return;
		Stack<Node> s = new Stack<Node>();

		while(node != null){
			s.push(node);
			node = node.left;
		}

		while(s.size() > 0){
			node = s.pop();
			System.out.println(node.data);

			if (node.right != null) {
				node = node.right;

				while(node != null){
					s.push(node);
					node = node.left;
				}
			}
		}
	}
}