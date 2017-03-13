import java.util.ArrayList;

class Node{
	int data;
	Node left,right,parent;
	Node(int key){
		data = key;
		left=right=parent=null;
	}
}
class KthSmallestBST{
	static Node root;
	public static void main(String[] args) {
		KthSmallestBST obj = new KthSmallestBST();
		obj.insert(20);
		obj.insert(22);
		obj.insert(8);
		obj.insert(12);
		obj.insert(4);
		obj.insert(10);
		obj.insert(14);
		int k = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans = obj.addInorder(root,list);
		int size = ans.size();
		System.out.println("size : "+size);
		if(k > 0 && k <= size){
			int a;
			a = ans.get(k-1);
			System.out.println("the smalles elemt at k th place is: "+a);
		}
		else
			System.out.println("no k the elemnt found");

	}

	ArrayList<Integer> addInorder(Node node,ArrayList<Integer> arrlist){
		if(node == null)
			return arrlist;
		addInorder(node.left,arrlist);
		//System.out.print(node.key+" ");
		arrlist.add(node.data);
		addInorder(node.right,arrlist);
		return arrlist;
	}
	void insert(int key){
		root = insertRecur(root,key);
	}
	Node insertRecur(Node node,int key){
		if(node == null){
			node = new Node(key);
			return node;
		}
		if(key < node.data){
			node.left = insertRecur(node.left,key);
		}
		if(key > node.data){
			node.right = insertRecur(node.right,key);
		}

		return node;
	}
}