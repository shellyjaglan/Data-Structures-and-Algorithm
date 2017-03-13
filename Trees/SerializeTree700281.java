//deSerialize  and seriaze using a BST whwre inorder is in inc order...

import java.util.*;

class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}
class SerializeTree700281{
	Tree head;
	int size = 0;
	public static void main(String[] args) {
		SerializeTree700281 obj = new SerializeTree700281();
		ArrayList<Integer> aa = new ArrayList<Integer>();
		obj.head = new Tree(5);
		obj.head.left = new Tree(2);
		obj.head.right = new Tree(7);
		obj.head.left.left = new Tree(1);
	//	obj.head.left.right = new Tree(3);
		obj.head.right.left = new Tree(6);
		obj.head.right.right = new Tree(8);
		ArrayList<Integer> ab = obj.serialize(obj.head,aa);
		System.out.println(ab);

		Tree ans = obj.deSerialize(ab);
		obj.printTree(ans);
	}

	public ArrayList<Integer> serialize(Tree root,ArrayList<Integer> aa) {
		if(root == null){
			aa.add(-1);
			return aa;
		}
		aa.add(root.data);
		aa = serialize(root.left,aa);
		aa = serialize(root.right,aa);
		return aa;
	}

	public Tree deSerialize(ArrayList<Integer> aa) {
	//	System.out.println("aa size is: "+aa.size());
		if(size >= aa.size())
			return null;
		if((int) aa.get(size) == -1){
			size++;
			System.out.println("in -1 size: "+size);
			return null;
		}
		Tree node = new Tree((int) aa.get(size));
		size++;
		System.out.println("size is: "+size);
		node.left = deSerialize(aa);
		node.right = deSerialize(aa);
		return node;
	}
	void printTree(Tree node){
		if(node == null)
			return;
		System.out.print(node.data+" ");
		printTree(node.left);
		
		printTree(node.right);
	}
}
