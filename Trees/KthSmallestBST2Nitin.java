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
		obj.calculateRank(obj.root);
		Node ans = obj.findKthRecursive(obj.root, k);
		if (ans != null) {
			System.out.println("Ans node is: " + ans.data);
		} else {
			System.out.println("No node found");
		}
	}
	Node findKthRecursive(Node node, int k) {
		if (node == null || k <= 0 || k > node.countLeft + node.countRight + 1)
			return null;
		if (k == node.countLeft + 1) {
			return node;
		} else if (k < node.countLeft + 1) {
			return findKthRecursive(node.left, k);
		} else {
			k -= (node.countLeft + 1);
			return findKthRecursive(node.right, k);
		}
	}

	void calculateRank(Node node) {
		if(node == null)
			return;
		if (node.left != null) {
			calculateRank(node.left);
			node.countLeft = node.left.countLeft + node.left.countRight + 1;
		}
		if (node.right != null) {
			calculateRank(node.right);
			node.countRight = node.right.countLeft + node.right.countRight + 1;
		}
	}

}