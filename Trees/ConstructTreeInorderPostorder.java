class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}
class Index{
	int index;
}
class ConstructTreeInorderPostorder{
	//int postindex = 0;
	Node root;
	public static void main(String[] args) {
		ConstructTreeInorderPostorder obj = new ConstructTreeInorderPostorder();
		// int arr_in[]= new int[] {14,7,1,6,11,2,8,5,4,9};
		// int arr_post[]= new int[] {14,1,11,6,7,8,4,9,5,2};

		int arr_in[]= new int[] {4, 8, 2, 5, 1, 6, 3, 7};
		int arr_post[]= new int[] {8, 4, 5, 2, 6, 7, 3, 1};
		
		int length = arr_in.length;
		Node n = obj.indexCal(arr_in,arr_post,length);
		System.out.println("preorder:");
		obj.preOrder(n);
		
	}
	Node indexCal(int in[],int post[],int n){
		Index obj1 = new Index();
		obj1.index = n-1;
		return constructTree(in,post,0,n-1,obj1);
	}
	Node constructTree(int in[],int post[],int start,int end,Index obj1){
		//int len = in.length;
		if(start > end)
			return null;
		Node tnode = new Node(post[obj1.index]);
		(obj1.index)--;

		if(start == end)
			return tnode;
		int in_index = search(tnode.data,start,end,in);
		tnode.left = constructTree(in,post,in_index+1,end,obj1);
		tnode.right = constructTree(in,post,start,in_index-1,obj1);
		
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
	void preOrder(Node node) 
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
 
	//helper function...
	int search(int node,int s,int e,int i[]){
		int j;
		for(j= s;j <= e;j++){
			if(i[j] == node){
				return j; 
			}
		}
		return j;
	}
}