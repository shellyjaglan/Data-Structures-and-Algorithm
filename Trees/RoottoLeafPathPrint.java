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

class RoottoLeafPathPrint{
    Node head;
    public static void main(String[] args) {
        RoottoLeafPathPrint obj = new RoottoLeafPathPrint();
        obj.head = new Node(2);
        obj.head.left = new Node(4);
        obj.head.right = new Node(5);
        obj.head.left.left = new Node(1);
        obj.head.left.right = new Node(3);
        obj.head.right.left = new Node(6);

        obj.printRootLeafPaths(obj.head);
    }
    void  printRootLeafPaths(Node node){
       int[] path = new int[100];
       printRootLeafPathsRecur(node,path,0);
    }
    void printRootLeafPathsRecur(Node node,int[] path,int patrnlen){
        if(node == null)
            return;
        path[patrnlen] = node.data;
        patrnlen++;

        if(node.left == null && node.right == null){
            printArray(path,patrnlen);
        }
        else{
            printRootLeafPathsRecur(node.left,path,patrnlen);
            printRootLeafPathsRecur(node.right,path,patrnlen);
        }
    }
    void printArray(int[] arr,int len){
        for(int i=0 ; i<len ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

}
