import java.util.ArrayList;

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

class RoottoLeafSumBT700225{
    Node head;
   // int sum = 0;
    public static void main(String[] args) {
        RoottoLeafSumBT700225 obj = new RoottoLeafSumBT700225();
        obj.head = new Node(2);
        obj.head.left = new Node(4);
        obj.head.right = new Node(5);
        obj.head.left.left = new Node(1);
         obj.head.left.right = new Node(3);
        obj.head.right.left = new Node(6);
      //  obj.head.right.right = new Tree(8);
        int sum = 7;
        if(obj.hasPathSum(obj.head,sum))
            System.out.println("true");
        else
            System.out.println("False");
        ArrayList<Node> visited = new ArrayList<Node>();
        obj.printRootLeafPaths(obj.head,visited);
    }
    boolean hasPathSum(Node node, int sum){
        if(node == null){
            return false;
        }
        int newsum = sum - node.data;
        if (node.left == null && node.right == null && newsum == 0) {
            return true;
        }
        return (hasPathSum(node.left,newsum) || hasPathSum(node.right,newsum));
    }

    
}