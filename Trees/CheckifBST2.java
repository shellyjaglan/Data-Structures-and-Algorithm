import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class CheckifBST2{
	Node root;
	Node pre = null;
	public static void main(String[] args) {
		CheckifBST2 obj  = new CheckifBST2();
		obj.root = new Node(10);
		obj.root.left = new Node(5);
		obj.root.right = new Node(25);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(7);
		obj.root.right.right = new Node(30);

		System.out.println("ans is: "+obj.isBSTcheckEfficient1(obj.root));

		System.out.println("ans is : "+obj.isBSTcheckEfficient2(obj.root));
	}

	boolean isBSTcheckEfficient1(Node node){
		return isBSTcheckEfficientUntil1(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	boolean isBSTcheckEfficientUntil1(Node node,int min,int max){
		if(node == null)
			return true;
		if(node.data < min || node.data > max){
			return false;
		}
		return (isBSTcheckEfficientUntil1(node.left,min,node.data-1) && 
			isBSTcheckEfficientUntil1(node.right,node.data-1,max));
	}

	boolean isBSTcheckEfficient2(Node node){
		if(node == null)
			return true;

		if(!isBSTcheckEfficient2(node.left))
			return false;
		if(pre != null && node.data < pre.data)
			return false;

		pre = node;
		return isBSTcheckEfficient2(node.right);
	}
}
