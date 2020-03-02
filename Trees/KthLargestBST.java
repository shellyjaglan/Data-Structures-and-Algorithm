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

class KthLargestBST{
    int count= 0;
    Node head;

    public static void main(String[] args) {
        KthLargestBST obj = new KthLargestBST();

        obj.head = new Node(50);
        obj.head.left = new Node(30);
        obj.head.right = new Node(70);
        obj.head.left.left = new Node(20);
        obj.head.left.right = new Node(40);
        obj.head.right.left = new Node(60);
        obj.head.right.right = new Node(80);
        
        int key = 10;

        obj.findKthLargest(obj.head, key);
    }

    void findKthLargest(Node node, int k){
        findKthLargestRecur(node, k);
    }

    void findKthLargestRecur(Node node, int k){
        if(node == null || count > k)
            return;

        findKthLargestRecur(node.right, k);
        count ++;
        if(count == k){
            System.out.println("here ans: "+ node.data);
            return;
        }
        findKthLargestRecur(node.left,k);
    }
}