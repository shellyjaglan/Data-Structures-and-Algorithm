class Node{
	int key;
	Node left,right ;
	Node(int data){
		key = data;
		left = right = null;
	}
}

class PrintLeftView{
	Node root;
	int max_level = 0;
	public static void main(String[] args) {
		PrintLeftView obj = new PrintLeftView();
		// obj.root = new Node(2);
		// obj.root.left = new Node(7);
		// obj.root.right = new Node(5);
		// obj.root.left.left = new Node(14);
		// obj.root.left.right = new Node(6);
		// obj.root.left.right.left = new Node(1);
		// obj.root.left.right.right = new Node(11);
		// obj.root.right.right = new Node(9);
		// obj.root.right.right.left = new Node(4);


		obj.root = new Node(12);
        obj.root.left = new Node(10);
        obj.root.right = new Node(30);
        obj.root.right.left = new Node(25);
        obj.root.right.right = new Node(40);
		System.out.println("left view is:");
		obj.leftView();

	}
	void leftView(){
		printLeftView(root,1);
	}
	void printLeftView(Node node,int level){
		
		if(node == null){
			return;
		}
		if(max_level < level){
			System.out.print(node.key+" ");
			max_level = level;
		}
		printLeftView(node.left,level+1);
		printLeftView(node.right,level+1);
	}

	
}