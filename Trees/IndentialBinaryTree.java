public class Node{
	Node data;
	Node left,right;
	public  Node(int item){
		data = item;
		left = right = null;
	}
}

public class IdenticalBinaryTree{
	public static void main(String[] args) {
		IdenticalBinaryTree obj = new IdenticalBinaryTree();
		obj.root1 = new Node(1);
		obj.root1.left = new Node(2);
		obj.root1.right = new Node(3);
		obj.root1.left.left = new Node(2);
		obj.root1.left.right = new Node(2);

		obj.root2 = new Node(1);
		obj.root2.left = new Node(2);
		obj.root2.right = new Node(3);
		obj.root2.left.left = new Node(2);
		obj.root2.left.right = new Node(2);

		if(obj.identicalTrees(root1,root2))
			System.out.println("identical");
		else
			System.out.println("not identical");
	}
	public boolean identicalTrees(Node a,Node b){
		if(a == null && b == null)
			return true;
		if(a != null && b != null){
			if(a == b){
				if(identicalTrees(a.left,b.left)){
					if(identicalTrees(a.right,a.right)){
						return true;
					}
				}
			}
		}
		return false;
	}
}