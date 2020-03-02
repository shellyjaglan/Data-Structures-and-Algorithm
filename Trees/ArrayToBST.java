import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left = right = null;
	}
}
class ArrayToBST{
	Node head;
	public static void main(String[] args) {
		ArrayToBST obj = new ArrayToBST();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int j=0 ; j<n ; j++){
				arr[j] = in.nextInt();
			}
			//pass to func..
			obj.convert(arr);
			//System.out.println();
		}
	}
	void convert(int[] arr){
		int length= arr.length;
		int m = length/2;
		//head = new Node(arr[m]);
		Node n = convertUntil(arr,0,length-1);
		printPreorder(n);
	}
	Node convertUntil(int[] arr,int start,int end){
		// if(node == null)
		// 	return null;
		if(start > end)
			return null;
		int mid = (start + end)/2;
		Node node = new Node(arr[mid]);

		node.left = convertUntil(arr, start, mid-1);
		node.right = convertUntil(arr,mid+1, end);
		
		return node;
	}
	void printPreorder(Node node){
		if(node == null)
			return;
		System.out.print(node.data+" ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
}