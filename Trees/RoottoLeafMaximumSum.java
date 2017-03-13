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

class RoottoLeafMaximumSum{
    Node head;
    Node target_node = null;
    int sum = Integer.MIN_VALUE;
    public static void main(String[] args) {
        RoottoLeafMaximumSum obj = new RoottoLeafMaximumSum();
        obj.head = new Node(2);
        obj.head.left = new Node(4);
        obj.head.right = new Node(5);
        obj.head.left.left = new Node(1);
         obj.head.left.right = new Node(3);
        obj.head.right.left = new Node(6);
      //  obj.head.right.right = new Tree(8);
        int curr = 0;
        //System.out.println(obj.maxSum(obj.head,sum));
        obj.findMaxSumandPath(obj.head,obj.sum,curr);
    }

    void findMaxSumandPath(Node node,int sum,int curr){
       // int sum  = 0;
        int max_sum = maxSum(node,sum,curr);
        System.out.println("max sum is: "+ max_sum);

        printTragetPath(node,target_node);
    }

    int maxSum(Node node, int sum,int curr){
        if(node == null){
            return curr += 0;
        }
        curr = curr + node.data;
        if(curr > sum){
            sum = curr;
            target_node = node;
        }
        int leftSum = maxSum(node.left,sum,curr);
        int rightSum = maxSum(node.right,sum,curr);

        return (leftSum > rightSum? leftSum:rightSum);
    }

    boolean printTragetPath(Node node,Node target_node){
        if(node == null)
            return false;
        if(node == target_node || printTragetPath(node.left,target_node) || printTragetPath(node.right,target_node)){
            System.out.println(node.data+" ");
            return true;
        }
        return false;
    } 
}