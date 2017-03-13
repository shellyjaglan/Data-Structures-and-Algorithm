class Node {
	int data;
	Node left, right;
	int countLeft, countRight;
	Node(int key) {
		data = key;
		left = right = null;
		countLeft = countRight = 0;
	}
}

class KthSmallestBST2Nitin{
	Node root;
	public static void main(String[] args) {
		KthSmallestBST2Nitin obj = new KthSmallestBST2Nitin();
		obj.root = new Node(50);
		obj.root.left = new Node(30);
		obj.root.right = new Node(70);
		obj.root.left.left = new Node(20);
		obj.root.left.right = new Node(40);
		obj.root.right.right = new Node(90);
		int k = 3;
		Node ans = obj.findKth(obj.root,k);
		System.out.println("ans node is: "+ans.data);
	}
	Node findKth(Node node,int k){
		int rank = giverank(node);
		//System.out.println("root right rank is: "+rank);
		return findKthrecur(node,k);
		//return null;
	}
	Node findKthrecur(Node node,int k){
		if (node != null)
			System.out.println("root rank is: " + node.cnode);
		if (node == null)
			return null;
		if (node.left.cnode + 1 == k) {
			return node;
		}
		else if(node.left.cnode >= k) {
			return findKthrecur(node.left, k);
		}
		else {
			k = k - (node.left.cnode + 1);
			return findKthrecur(node.right, k);
		}
	}

	void giverank(Node node){
		if(node == null)
			return;
		if (node.left != null) {
			giverank(node.left);
			node.countLeft = node.left.countLeft + node.left.countRight + 1;
		}
		if (node.right != null) {
			giverank(node.right);
			node.countRight = node.right.countLeft + node.right.countRight + 1;
		}
	}

}