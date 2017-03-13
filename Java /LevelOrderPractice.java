class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left=right = null;
	}
}

class LevelOrderPractice{
	Node head;
	public static void main(String[] args) {
		LevelOrderPractice obj = new LevelOrderPractice();
		obj.head = new Node(1);
		obj.head.left = new Node(2);
		obj.head.left.left = new Node(4);
		obj.head.left.right = new Node(5);
		obj.head.right = new Node(3);
		obj.head.right.right = new Node(6);
		obj.level_order(obj.head);
		System.out.println();
		obj.level_order_reverse(obj.head);
	}
	void level_order_reverse(Node node){
		int height = heightcal(node);
		for(int i=height ; i>=1 ; i--){
			print_level_reverse(node,i);
		}
	}
	void print_level_reverse(Node node,int level){
	//	System.out.println("in func :");
		if(node == null)
			return;
		if(level == 1){
			System.out.print(node.data+"  ");
		}
		else{
			print_level_reverse(node.left,level-1);
			print_level_reverse(node.right,level-1);
		}
		return;
	}
	void level_order(Node node){
		int height = heightcal(node);
		for(int i=1 ; i<=height ; i++){
			print_level(node,i);
		}
	}
	void print_level(Node node,int level){
		if(node == null)
			return;
		if(level == 1){
			System.out.print(node.data+ "  ");
		}
		else{
			print_level(node.left,level-1);
			print_level(node.right,level-1);
		}
		return;
	}
	int heightcal(Node node){
		if(node == null)
			return 0;
		int left_height = heightcal(node.left);
		int right_height = heightcal(node.right);

		return (max(left_height,right_height) +1);
	}
	int max(int a,int b){
		return (a>b?a:b);
	}
}