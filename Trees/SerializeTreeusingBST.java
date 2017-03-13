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
class SerializeTreeusingBST{
	Tree head;
	public static void main(String[] args) {
		SerializeTreeusingBST obj = new SerializeTreeusingBST();
		ArrayList<Integer> aa = new ArrayList<Integer>();
		obj.head = new Tree(4);
		obj.head.left = new Tree(2);
		obj.head.right = new Tree(6);
		obj.head.left.left = new Tree(1);
		obj.head.left.right = new Tree(3);
		obj.head.right.left = new Tree(5);
		obj.head.right.right = new Tree(7);
		ArrayList<Integer> ab = obj.serialize(obj.head,aa);
		System.out.println(ab);
		Tree ans = obj.deSerialize(ab);
		obj.printTree(ans);
	}

	public ArrayList<Integer> serialize(Tree root,ArrayList<Integer> aa) {
		if(root == null){
			return aa;
		}
		aa = serialize(root.left,aa);
		aa.add(root.data);
		//System.out.println(aa);
		aa = serialize(root.right,aa);
		return aa;
	}

	public Tree deSerialize(ArrayList<Integer> aa) {
		int length = aa.size();
		int mid = length/2;
		Tree root = new Tree((int) aa.get(mid));
		System.out.println("root  is: "+ root.data);
	
		root.left = deSerializeUntil(aa,0,mid-1);
		System.out.println("root left  is: "+ root.left.data);

		root.right = deSerializeUntil(aa,mid+1,length-1);
		System.out.println("root right is: "+ root.right.data);
		return root;
	}
	Tree deSerializeUntil(ArrayList<Integer> aa,int start,int end){

	//	System.out.println("in util");
	//	System.out.println("start is: "+start);
	//	System.out.println("end is: "+end);

		int mid =  (start + end)/2;
	//989	System.out.println("mid is: "+mid);

		Tree root = new Tree((int) aa.get(mid));
	//	System.out.println("root is: "+root.data);
		
		if(start < end){
			root.left = deSerializeUntil(aa,start,mid-1);
		//	System.out.println("root.left is: "+root.left.data);
			root.right = deSerializeUntil(aa,mid+1,end);
		//	System.out.println("root.right is: "+root.right.data);
		}
		return root;
	}

	void printTree(Tree node){
	//	System.out.println("in print");
		if(node == null)
			return;
		printTree(node.left);
		System.out.print(node.data+" ");
		printTree(node.right);
	}
}
