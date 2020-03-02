class Node{
	int key;
	Node left,right ;
	Node(int data){
		key = data;
		left = right = null;
	}
}
class LevelOrderTraversal{
	 Node root;

	int height(Node node){
		int lheight,rheight;
		if(node == null)
			return 0;
		else{
			lheight = height(node.left);
			System.out.println("l height:"+lheight);
			rheight = height(node.right);
			System.out.println("r height:"+rheight);

			if(lheight > rheight)
				return (lheight+1);
			else
				return (rheight+1);	
		}
	}

	void printLevelOrder(){
		int h = height(root);
		System.out.println("h is:"+h);
		for(int i =1;i <= h;i++){
			printGivenLevel(root,i);
		}
	}

	void printGivenLevel(Node node,int level){
		if(node == null)
			return;
		if(level == 1){
			//System.out.println("node value :"+node.key);
			System.out.print(node.key+" ");
		}
		else if(level > 1){
		//	System.out.println("node value before left and right:"+ node.key);
			printGivenLevel(node.left,level-1);
			printGivenLevel(node.right,level-1);
		}

	}

	public static void main(String[] args) {
		LevelOrderTraversal obj = new LevelOrderTraversal();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		System.out.println("Level order traversal of binary tree is ");
		obj.printLevelOrder();
	}
}
