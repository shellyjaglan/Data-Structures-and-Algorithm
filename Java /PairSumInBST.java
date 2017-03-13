import java.util.Stack;

class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left = right = null;
	}
}

class PairSumInBST{
	static Node root;
	public static void main(String[] args) {
		
		PairSumInBST obj = new PairSumInBST();
		obj.root = new Node(15);
		obj.root.left = new Node(10);
		obj.root.right = new Node(20);
		obj.root.left.left = new Node(8);
		obj.root.left.right = new Node(12);
		obj.root.right.right = new Node(25);
		obj.root.right.left = new Node(15);
		int target  = 32;
		//boolean result = obj.checkForPair(root,target);
		if(obj.checkForPair(root,target) == false){
			System.out.println("no such pair exits");
		}
		

	}

	boolean checkForPair(Node node,int target){
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		boolean done1,done2;
		done1=done2=false;
		int val1 =0, val2 =0;
		Node curr1 = root ;
		Node curr2 = root;

		while(true){
			while(done1 == false){
				if(curr1 != null){
					s1.push(node);
					curr1 = node.left;
				}
				else{
					if(s1.size()== 0){
						done1 = true;
					}
					else{
						curr1 = s1.pop();
						val1 = curr1.data;
						curr1 = node.right;
						done1 = true;
					}
				}
			}
		}

		while(true){
			while(done2 == false){
				if(curr2 != null){
					s2.push(node);
					curr2 = node.right;
				}
				else{
					if(s2.size()==null){
						done2 = true;
					}
					else{
						curr2 = s2.pop();
						val2 = curr2.data;
						curr2 = node.right;
						done2 = true;
					}
				}
			}
		}

		if((val1 != val2) && (val1 + val2 == target)){
			System.out.println("pair found in the func val1: "+val1+" val2: "+val2);
			return true;
		}
		else if(val1 + val2 < target){
			done1 = false;
		}
		else if(val1 + val2 > target){
			done2 = false;
		}
		if(val1 >= val2){
			return false;
		}
	}
}