import java.util.*;

class Node {
	Node left,right;
	int data;
	Node(int key){
		data = key;
		left = right = null;
	}
}

class TreeTopView {
	Node head;
	public static void main(String[] args) {
		TreeTopView obj = new TreeTopView();
		obj.head = new Node(3);
		obj.head.left = new Node(5);
		obj.head.right = new Node(2);
		obj.head.left.left = new Node(1);
		obj.head.left.right = new Node(4);
		obj.head.left.left.right = new Node(9);
		obj.head.right.right = new Node(7);
		obj.head.right.left = new Node(6);
		obj.head.right.right.left = new Node(8);
		
		obj.top_view(obj.head);
	}
	void top_view(Node node){
		// if(node == null)
		// 	return;
		// top_view(node.left);
		// System.out.print(node.data+" ");
		// top_view(node.right);
		// System.out.print(node.data+" ");
		LinkedList list = new LinkedList();
		Node temp = node;

		while(temp != null){
			list.addFirst(temp.data);
			temp = temp.left;
		}
		temp = node;
		while(temp.right != null){
			temp = temp.right;
			list.addLast(temp.data);
		}
		//System.out.println("list is: "+ list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}
}