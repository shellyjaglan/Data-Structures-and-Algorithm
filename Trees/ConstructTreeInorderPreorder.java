class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class ConstructTreeInorderPreorder{
	int preindex = 0;
	Node root;
	public static void main(String[] args) {
		ConstructTreeInorderPreorder obj = new ConstructTreeInorderPreorder();
		int arr_in[]= new int[] {14,7,1,6,11,2,8,5,4,9};
		int arr_pre[]= new int[] {2,7,14,6,1,11,5,8,9,4};
		int length = arr_in.length;
		Node n = obj.constructTree(arr_in,arr_pre,0,length -1);
		System.out.println("Inorder:");
		obj.printInorder(n);
		
	}
	//func to const tree using inorder and preorder traversals and return root node
	Node constructTree(int in[],int pre[],int start,int end){
		if(start > end)
			return null;
		Node tnode = new Node(pre[preindex++]);
		if(start == end)
			return tnode;
		int in_index = search(tnode.data,start,end,in);
		tnode.left = constructTree(in,pre,start,in_index-1);
		tnode.right = constructTree(in,pre,in_index+1,end);
		return tnode;
	}
	//function to print the inorder
	void printInorder(Node node){
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);

	}
	//helper function...
	int search(int node,int s,int e,int i[]){
		int j;
		for(j= s;j < e;j++){
			if(i[j] == node){
				return j; 
			}
		}
		return j;
	}
}