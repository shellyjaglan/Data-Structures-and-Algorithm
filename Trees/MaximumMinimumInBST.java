import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class MaximumMinimumInBST{
	Node root;
	int max = Integer.MIN_VALUE;
 	static int min = Integer.MAX_VALUE;

	static int max2 = Integer.MIN_VALUE;
	static int min2 = Integer.MAX_VALUE;

	public static void main(String[] args) {
		MaximumMinimumInBST obj = new MaximumMinimumInBST();
		obj.root = new Node(10);
		obj.root.left = new Node(5);
		obj.root.right = new Node(25);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(7);
		obj.root.right.right = new Node(2);
		
		// int m = obj.maxcheck(obj.root);
		// System.out.println("max is: "+ m);

		// obj.maxcheck2(obj.root);
		// System.out.println("max2 is: "+ max2);

		int m3 = obj.maxcheck3(obj.root,-100);
		System.out.println("max3 is: "+ m3);


		// int minimum = obj.mincheck(obj.root);
		// System.out.println("minimum is: "+ minimum);

		// obj.mincheck2(obj.root);
		// System.out.println("minimum2 is: "+ min2);

		//max check 3 nad min check 3 was for check bst func to cal min and max recursivly..
		// int x = -100;
		// int y = 200;
		// System.out.println(obj.bstCheck(obj.root,x,y));
	}


	//1nd method to find max..this is correct..
	int maxcheck(Node node){
		if(node == null)
			return max;
		if(node.data > max){
			max = node.data;
		}
		int maxleft = maxcheck(node.left);
		int maxright = maxcheck(node.right);
		return (maxright > maxleft)?maxright:maxleft;
	}

	//practice.... 2nd method to find max..this is also correct..
	void maxcheck2(Node node){
		if(node == null)
			return;
		// System.out.println();
		// System.out.println("root is: "+node.data+ " max is: "+max);
		if(node.data > max){
			max2 = node.data;
		}
		maxcheck2(node.left);
		maxcheck2(node.right);
		return;
	}

	int maxcheck3(Node node,int x){
		if(node == null)
			return x;
		if(node.data > x){
			x = node.data;
		}
		int maxleft = maxcheck3(node.left,x);
		int maxright = maxcheck3(node.right,x);
		return (maxright > maxleft)?maxright:maxleft;
	}

	
	int mincheck(Node node){
		if(node == null)
			return min;
		if(node.data < min){
			min = node.data;
		}
		int minleft = mincheck(node.left);
		int minright = mincheck(node.right);
		return (minright < minleft)?minright:minleft;
	}
	//method 2 for checking minimum..

	void mincheck2(Node node){
		if(node == null)
			return;
		if(node.data < min2){
			min2 = node.data;
		}
		//System.out.println("root is: "+node.data+ " min2 is: "+min2);
		mincheck2(node.left);
		mincheck2(node.right);
		return;
	}

	int mincheck3(Node node,int y){
		if(node == null)
			return y;
		if(node.data < y){
			y = node.data;
		}
		int minleft = mincheck3(node.left,y);
		int minright = mincheck3(node.right,y);
		return (minright < minleft)? minright : minleft;
	}
}