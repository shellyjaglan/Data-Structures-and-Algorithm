//height and max depth are the same
//height is refered to as the maximum edge/node between root and leaf node....in our case
//we consider height of root node as 1 as we are considering nodes..if we were to 
//consider edges then height of root is 0
//depth is calculated in context of root node
//depth is distance from root node to the perticular node


class Node{
	int data;
	Node left,right;
	Node(int k){
		data = k;
		left=right=null;
	}
}

public class Height extends BTreePrinter{
	public static void main(String[] args) {
		// Height tree = new Height();
 		
  //       tree.root1 = new Node(1);
  //       tree.root1.left = new Node(2);
  //       tree.root1.right = new Node(3);
  //       tree.root1.left.left = new Node(4);
  //       tree.root1.left.right = new Node(5);
 		
 		BTreePrinter obj = new BTreePrinter();
 		obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);

      //  System.out.println("Height of tree is : " + tree.findHeight(root1));
        obj.printNode(root);
	}

	// int findHeight(Node node){
	// 	//int count =0;
	// 	if(node == null){
	// 		return 0;
	// 	}
	// 	else {
             
 //            /* compute the depth of each subtree */
 //            int lDepth = findHeight(node.left);
 //            int rDepth = findHeight(node.right);
 
 //            /* use the larger one */
 //            if (lDepth > rDepth) {
 //                return (lDepth + 1);
 //            } else {
 //                return (rDepth + 1);
 //            }
	// 	}
	// }
}