import java.util.LinkedList; 
import java.util.Queue; 

class Node{
	int data;
	Node left,right,nextRight;
	Node(int k){
		data = k;
		left = right = nextRight = null;
	}
}
class ConnectNode{
	static Node root;
	public static void main(String[] args) {
		ConnectNode obj = new ConnectNode();

		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.right = new Node(6);

		//obj.connect(root);
		obj.connectUsingQueue(root);
		System.out.println("for next pointer it will print the ans othervise -1");

		int a = (obj.root.nextRight != null)?obj.root.nextRight.data:-1 ;
		System.out.println("the next of "+obj.root.data+" is"+a);

		int b = (obj.root.left.nextRight != null)?obj.root.left.nextRight.data:-1 ;
		System.out.println("the next of "+obj.root.left.data+" is"+b);

		int c = (obj.root.right.nextRight != null)?obj.root.right.nextRight.data:-1 ;
		System.out.println("the next of "+obj.root.right.data+" is"+c);

		int d = (obj.root.left.left.nextRight != null)?obj.root.left.left.nextRight.data:-1 ;
		System.out.println("the next of "+obj.root.left.left.data+" is"+d);

		int e = (obj.root.left.right.nextRight != null)?obj.root.left.right.nextRight.data:-1 ;
		System.out.println("the next of "+obj.root.left.right.data+" is"+e);

		int f = (obj.root.right.right.nextRight != null?obj.root.right.right.nextRight.data:-1);
		System.out.println("the next of "+obj.root.right.right.data+" is"+f);
	}
	void connect(Node node){
		node.nextRight = null;
		connectRecur(node);
	}

	void connectRecur(Node p){
		if(p == null)
			return;
		if(p.left != null)
			p.left.nextRight = p.right;
		if(p.right != null){
			if(p.nextRight != null && p.nextRight.left == null)
				p.right.nextRight = (p.nextRight != null)?p.nextRight.right:null;
			else
				p.right.nextRight = (p.nextRight != null)?p.nextRight.left:null;
		}
			
		connectRecur(p.left);
		connectRecur(p.right);
	}

	void connectUsingQueue(Node node){
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		q.add(null);
		while(!q.isEmpty()){
			Node p = q.peek();
			q.remove();

			if(p != null){
				p.nextRight = q.peek();

				if(p.left != null)
					q.add(p.left);
				if(p.right != null)
					q.add(p.right); 
			}
			else if(!q.isEmpty())
				q.add(null);
		}
	}
}