import java.util.*;

class Node{
	int data;
	Node left,right,nextRight;
	Node(int k){
		data = k;
		left = right = nextRight = null;
	}
}

class Max_level {
    int max_level;
}

class RightViewBT{
	static Node head;
	Stack s = new Stack();

	//for func2....
	Max_level max = new Max_level();

	public static void main(String[] args) {
		RightViewBT obj = new RightViewBT();

		// obj.head = new Node(1);
		// obj.head.left = new Node(2);
		// obj.head.right = new Node(3);
		// obj.head.left.left = new Node(4);
		// obj.head.left.right = new Node(5);
		// obj.head.right.right = new Node(6);

		obj.head = new Node(1);
		obj.head.left = new Node(2);
		obj.head.right = new Node(3);
		obj.head.left.left = new Node(4);
		obj.head.left.right = new Node(5);
		obj.head.right.left = new Node(6);
		obj.head.right.right = new Node(7);
		obj.head.left.left.right = new Node(8);
		
	//	obj.printRightView(obj.head);

		obj.printRightViewUntil(obj.head,1,obj.max);

	}
	//this is func1 ..which is not very good works in o n^2;
	void printRightView(Node node){
		if(node == null)
			return;
		
		int height = calHeight(node);
		for(int i =1 ; i<=height ; i++){
			addtoStack(node,i);
			System.out.print(s.pop() +" ");
		}
	}
	void addtoStack(Node node,int level){
		if(node == null)
			return;
		if(level == 1){
			s.push(node.data);
		}
		else{
			addtoStack(node.left,level-1);
			addtoStack(node.right,level-1);
		}
	}
	int calHeight(Node node){
		if(node == null)
			return 0;
		return (max(calHeight(node.left) , calHeight(node.right) )+1);
	}
	int max(int a,int b){
		return (a>b)?a:b;
	}
		
	///this is func 2 which is more efficient....
	void printRightViewUntil(Node node, int level, Max_level max_level) {
 
        // Base Case
        if (node == null) 
            return;
 
        // If this is the last Node of its level
        if (max_level.max_level < level) {
            System.out.print(node.data + " ");
            max_level.max_level = level;
        }
 
        // Recur for right subtree first, then left subtree
        printRightViewUntil(node.right, level + 1, max_level);
        printRightViewUntil(node.left, level + 1, max_level);
    }
}