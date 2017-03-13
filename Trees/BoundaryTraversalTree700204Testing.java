import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} 

class BoundaryTraversalTree700204Testing{
	Node head;
	public static void main(String[] args) {
		BoundaryTraversalTree700204Testing obj = 
		new BoundaryTraversalTree700204Testing();

       //  obj.head = new Node(20);
       //  obj.head.left = new Node(8);
       //  obj.head.right = new Node(24);
       //  obj.head.left.left = new Node(4);
       //  obj.head.left.right = new Node(12);
       //  obj.head.left.right.left = new Node(10);
       //  obj.head.left.right.right = new Node(14);
       //  obj.head.right.right = new Node(25);


        obj.head = new Node(1);
        obj.head.right = new Node(2);
        obj.head.right.right = new Node(4);
        obj.head.right.right.right = new Node(5);
        obj.head.right.right.right.right = new Node(6);
        obj.head.right.right.right.right.right = new Node(7);
        obj.head.right.right.right.right.right.right = new Node(8);
    //    obj.head.right.right.right.right.right.right.right = new Node(8);

        obj.printBoundary(obj.head);
	}

	void printBoundary(Node head){
		if(head != null){
			System.out.print(head.data+" ");

			printBoundaryLeft(head.left);

			printLeaves(head.left);
			printLeaves(head.right);

			printBoundaryRight(head.right);
		}
	}
	void printBoundaryLeft(Node node){
		if(node != null){
			if(node.left != null){
				System.out.print(node.data+" ");
				printBoundaryLeft(node.left);
			}
			else if(node.right != null){
				System.out.print(node.data+" ");
				printBoundaryLeft(node.right);
			}
		}
	}
	void printBoundaryRight(Node node){
		if(node != null){
			if(node.right != null){
				
				printBoundaryRight(node.right);
				System.out.print(node.data+" ");
			}
			else if(node.left != null){
				printBoundaryRight(node.left);
				System.out.print(node.data+" ");
			}
		}
	}
	void printLeaves(Node node){
		if(node != null){
			System.out.println("pf leave node is : "+node.data);
			printLeaves(node.left);
			if(node.left == null && node.right == null)
				System.out.print(node.data+" ");
			printLeaves(node.right);
		}
	}
}