import java.util.*;

class Node{
	int data;
	Node  left,right;
	Node(int key){
		data = key;
		left=right=null;
	}
}

class ConstructBSTUsingPreorder{
    public static void main(String[] args){
        ConstructBSTUsingPreorder obj = new ConstructBSTUsingPreorder();
        int[] pre = {10, 5, 1, 7, 40, 50};

        Node ans = obj.constructBST(pre, pre.length);
        obj.printInorder(ans);
    }

    Node constructBST(int[] pre, int size){
        if(size <= 0)
            return null;
        
        Node root = new Node(pre[0]);

        Stack<Node> s = new Stack<Node>();
        s.push(root);

        
        int i = 1;

        while(i < size){
            Node temp = null;

            while(s.size() != 0 && pre[i] > s.peek().data){
                temp = s.pop();
            }

            if(temp == null){
                temp = s.peek();
                temp.left = new Node(pre[i]);
                s.push(temp.left);
            }else{
                temp.right = new Node(pre[i]);
                s.push(temp.right);
            }

            i++;
        }

        return root;
    }

    void printInorder(Node node){
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}
}