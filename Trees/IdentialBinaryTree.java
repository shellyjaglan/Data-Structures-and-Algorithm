 class Node{
	int data;
	Node left,right;
	public  Node(int item){
		data = item;
		left = right = null;
	}
}

 class IdenticalBinaryTree{
 	static Node root1, root2 ;
	public static void main(String[] args) {
		
		IdenticalBinaryTree obj = new IdenticalBinaryTree();
		obj.root1 = new Node(1);
		obj.root1.left = new Node(2);
		obj.root1.right = new Node(3);
		obj.root1.left.left = new Node(4);
		obj.root1.left.right = new Node(5);

		obj.root2 = new Node(1);
		obj.root2.left = new Node(2);
		obj.root2.right = new Node(3);
		obj.root2.left.left = new Node(4);
		obj.root2.left.right = new Node(5);

		if(obj.identicalTrees(root1,root2))
			System.out.println("identical");
		else
			System.out.println("not identical");
	}
	public boolean identicalTrees(Node a,Node b){
		if(a == null && b == null){
			return true;
		}
		if(a != null && b != null){
			if(a.data == b.data){
				if(identicalTrees(a.left,b.left)){
					if(identicalTrees(a.right,b.right)){
						return true;
					}
				}
			}
		}
		return false;
	}
}

//another way to write this method
/*
public boolean identicalTrees(Node a,Node b){
	if (a == null && b == null) {
			return true;
		}

		// 2. both non-empty -> compare them 
		if (a != null && b != null) {
			return (a.data == b.data
					&& identicalTrees(a.left, b.left)
					&& identicalTrees(a.right, b.right));
		}

		// 3. one empty, one not -> false 
		return false;
	}
*/