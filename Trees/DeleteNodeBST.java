import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

class DeleteNodeBST{
	Node root;
	public static void main(String[] args) {
		DeleteNodeBST obj = new DeleteNodeBST();
		obj.root = new Node(50);
		obj.root.left = new Node(40);
		obj.root.right = new Node(70);
		obj.root.left.left = new Node(30);
		obj.root.left.right = new Node(45);
		obj.root.right.right = new Node(80);
		obj.root.right.left = new Node(60);
		System.out.println("inorder before: ");
		obj.inorder(obj.root);
		obj.deleteNode(50);
		System.out.println("inorder after: ");
		obj.inorder(obj.root);
	}

	void deleteNode(int key){
		root = deleteNodeRecur(root,key);

	}

	Node deleteNodeRecur(Node node,int key){
		if(node == null)
			return null;
		else if(node.data < key){
			node.right = deleteNodeRecur(node.right,key);
		}
		else if(node.data > key){
			node.left = deleteNodeRecur(node.left,key);
		}

		//means key == node.data;
		else{
			if(node.right == null)
				return node.left;
			else if(node.left == null)
				return node.right;
			//if none left nad right is null
			//select min in right tree
			node.data =  min(node.right);
			//delete min node in right tree..
			node.right = deleteNodeRecur(node.right,node.data);
		}
		return node;
	}

	int min(Node node)
    {
        int minv = node.data;
        while (node.left != null)
        {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }
 
	void inorder(Node node){
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+"  ");
		inorder(node.right);
	}
}