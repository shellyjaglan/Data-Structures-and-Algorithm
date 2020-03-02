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

class BoundaryTraversalTree700204{
	Node head;
	public static void main(String[] args) {
		BoundaryTraversalTree700204 obj = new BoundaryTraversalTree700204();
        obj.head = new Node(20);
        obj.head.left = new Node(8);
        obj.head.right = new Node(24);
        obj.head.left.left = new Node(4);
        obj.head.left.right = new Node(12);
        obj.head.left.right.left = new Node(10);
        obj.head.left.right.right = new Node(14);
        obj.head.right.left = new Node(23);
        obj.head.right.right = new Node(25);

        obj.printBoundary(obj.head);
	}

	void printBoundary(Node head){
		Node temp = head;
		Stack<Node> s = new Stack<Node>();

		while(temp != null){
			s.push(temp);
			System.out.print(temp.data +" ");
			temp = temp.left;
		}
		//s.push(temp);

		while((Node)s.peek() != head){
			Node elem = (Node) s.pop();
			if(elem.right != null){
				Node right_ele = elem.right;
				if(right_ele.left == null && right_ele.right == null){
					System.out.print(right_ele.data +" ");
				}
				else{
					if(right_ele.left != null){
						Node temp2 = right_ele.left;
						while(temp2 != null){
							temp2 = temp2.left;
						}
						System.out.print(temp2.data +" ");
					}
					else if(right_ele.right != null){
						Node temp3 = right_ele.right;
						while(temp3 != null){
							temp3 = temp3.right;
						}
						System.out.print(temp3.data +" ");
					}
				}
			}
		}
		// Node top = (Node)s.pop();
		// Node topR = top.right;
		// while(topR != null){
		// 	s.push(topR);
		// 	topR = topR.right;
		// }
		// while(s.size() > 0){
		// 	Node elem = (Node)s.pop();

		// }
	}
}