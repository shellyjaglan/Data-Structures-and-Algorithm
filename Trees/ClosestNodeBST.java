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

class ClosestNodeBST{
	Node head;
	public static void main(String[] args) {
		ClosestNodeBST obj = new ClosestNodeBST();
		obj.head = new Node(9);
        obj.head.left = new Node(4);
        obj.head.right = new Node(17);
        obj.head.left.left = new Node(3);
        obj.head.left.right = new Node(6);
        //obj.head.right.left = new Node(14);
        obj.head.right.right = new Node(22);
        int key = 12;
        int result = obj.closestNode(obj.head,key);
        System.out.println("res is: "+result);
	}

	int closestNode(Node node,int key){
		int close = 1000;
		int c = closestNodeUntil(node,key,close,null);
		return c;
	}

	int closestNodeUntil(Node node,int key,int close,Node close_node){
		//System.out.println("close is: "+close);
		if(node == null){
			return close_node.data;
		}
		//close = min(close,Math.abs(key-node.data))
		if(node.data == key){
			close = 0;
			close_node = node;
			//System.out.println("close is: "+close);
			return close_node.data;
		}
		if(Math.abs(key-node.data) < close){
		//	System.out.println("abs  is: "+ Math.abs(key-node.data));
			close_node = node;
			close = Math.abs(key-node.data);
		//	System.out.println("2close is: "+close);
		}
		if(node.data > key){
			return	closestNodeUntil(node.left,key,close,close_node);
		}
		else if(node.data < key){
			return closestNodeUntil(node.right,key,close,close_node);
		}
		return close_node.data;
	}

	int min(int a,int b){
		return (a<b)?a:b;
	}
}