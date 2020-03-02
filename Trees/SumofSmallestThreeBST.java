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

class SumofSmallestThreeBST{
	Node  root;
	//static int sum = 0;
	//static int k = 3;
	public static void main(String[] args) {
		SumofSmallestThreeBST obj = new SumofSmallestThreeBST();
		obj.insert(90);
		obj.insert(50);
		obj.insert(20);
		obj.insert(10);
		obj.insert(5);
		obj.insert(25);
		obj.insert(15);
		obj.insert(100);


		// obj.insert(10);
		// obj.insert(20);
		// obj.insert(30);
		// obj.insert(40);
		// obj.insert(50);

		obj.inorder(obj.root);

		int r  = obj.findSum(obj.root,0,3);
		System.out.println("sum is: "+ r);
	}

	int findSum(Node node,int count,int k){
		if(node == null)
			return 0;
		if(count > k)
			return 0;

		int res = findSum(node.left,count,k);
		if(count >= k)
			return res;
		res += node.data;
		count++;
		if(count >= k)
			return res;

		return (res + findSum(node.right,count,k));
	}

	void insert(int key){
		root = insertRecur(root,key);
	//	System.out.println("node is: "+ root.data);
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
	void inorder(Node node){
		if(node != null){
			inorder(node.left);
			System.out.print(node.data+"  ");
			inorder(node.right);
		}
	}
}