//this code does the inorder tree traversal without using recursion using stack..
import java.util.Stack;
 
class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left = right = null;
	}
}
class InorderTreeTraversal{
	Node root;
	void inorder(){
		Node node = root;
		Stack<Node> stack = new Stack<Node>();

		while(node != null){
			stack.push(node);
			node = node.left;
		}
		while(stack.size() > 0){
			node = stack.pop();
			System.out.print(node.data+" ");
			if(node.right != null){
				node = node.right;
				while(node != null){
					stack.push(node);
					node= node.left;
				}
			}
		}
	}
	public static void main(String[] args) {
		InorderTreeTraversal obj = new InorderTreeTraversal();
		obj.root = new Node(2);
		obj.root.left = new Node(7);
		obj.root.right = new Node(5);
		obj.root.left.left = new Node(14);
		obj.root.left.right = new Node(6);
		obj.root.left.right.left = new Node(1);
		obj.root.left.right.right = new Node(11);
		obj.root.right.left = new Node(8);
		obj.root.right.right = new Node(9);
		obj.root.right.right.left = new Node(4);

		System.out.println(" ");
		System.out.print("inorder traversal for this tree is: ");
		obj.inorder();
	}
}

