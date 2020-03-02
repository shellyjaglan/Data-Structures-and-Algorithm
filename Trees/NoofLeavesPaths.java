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

class NoofLeavesPaths{
	Node head;
	public static void main(String[] args) {
		NoofLeavesPaths obj = new NoofLeavesPaths();
		obj.head = new Node(2);
        obj.head.left = new Node(4);
        obj.head.right = new Node(5);
        obj.head.left.left = new Node(1);
        obj.head.left.right = new Node(3);
        obj.head.right.left = new Node(6);

        obj.noofLeafPaths(obj.head);
	}
}