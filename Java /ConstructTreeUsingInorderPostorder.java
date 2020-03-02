import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left=right = null;
	}
}
class Index{
	int	index; 
}
class ConstructTreeUsingInorderPostorder{
	Node head;
	public static void main(String[] args) {
		ConstructTreeUsingInorderPostorder obj = new ConstructTreeUsingInorderPostorder();
		
		// obj.head = new Node(10);
		// obj.head.left = new Node(5);
		// obj.head.left.left = new Node(1);
		// obj.head.left.right = new Node(7);
		// obj.head.right = new Node(20);
		// obj.head.right.left = new Node(15);
		// obj.head.right.right = new Node(30);

		System.out.print("pre : ");
		obj.printPreOrder(obj.head);
		System.out.println();

		int in[] ={1,5,7,10,15,20};
		int post[] ={1,7,5,15,20,10};
		int size = in.length;
		Node ans = obj.constructTree(in,post,size);
		obj.printPreOrder(ans);

	}
	Node constructTree(int[] in,int[] post,int size){
		Index pindex = new Index();
		pindex.index = size-1;
		//int n = size-1;
		return constructTreeUntil(in,post,0,size-1,pindex);
	}
	Node constructTreeUntil(int[] in, int[] post,int start,int end,Index pindex){
		System.out.print("pindex: "+pindex.index);
		if(start > end)
			return null;
		Node node = new Node(post[pindex.index]);
		(pindex.index)--;

		if(start == end)
			return node;
		//find index of node in inorder ...
		int index = findIndex(in,start,end,node.data);

		node.right = constructTreeUntil(in,post,index+1,end,pindex);
		node.left = constructTreeUntil(in,post,start,index-1,pindex);

		return node;
	}
	int findIndex(int[] in,int start,int end,int value){
		int i;
		for(i=start ; i<=end ; i++){
			if(in[i] == value){
				break;
			}
		}
		return i;
	}
	void printPreOrder(Node node){
		if(node == null)
			return;
		System.out.print(node.data+" ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
}