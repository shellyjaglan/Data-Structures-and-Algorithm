//import java.HashMap;
import java.util.*;
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

class NoofLeafPaths{
	Node head;
//	static paths = 0;
	public static void main(String[] args) {
		NoofLeafPaths obj = new NoofLeafPaths();
		obj.head = new Node(2);
        obj.head.left = new Node(4);
        obj.head.right = new Node(5);
     //   obj.head.left.left = new Node(1);
    //    obj.head.left.right = new Node(3);
        obj.head.right.left = new Node(6);

        obj.noOfLeafPaths(obj.head);
	}

	void noOfLeafPaths(Node node){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		noOfLeafPathsRecursion(node,map,1);

		// Iterator itr = map.entrySet().iterator();
		// while(itr.hasNext()){
		// 	(Map.Entry) me = (Map.Entry)itr.next();
		// 	System.out.print((int)me.getKey()+" "+(int)me.getValue());
		// 	System.out.print(" $");
		// }
		Set<Map.Entry<Integer,Integer>> e = map.entrySet();
		for(Map.Entry me : e){
			System.out.print((int)me.getKey()+" "+(int)me.getValue());
			System.out.print(" $");
		}
		System.out.println();
	}

	void noOfLeafPathsRecursion(Node node,HashMap<Integer,Integer> map,int len){
		if(node == null)
			return; 

		if(node.left == null && node.right == null){
			if(map.containsKey(len)){
				int val = (int) map.get(len);
				map.put(len,val+1);
			}
			else{
				map.put(len,1);
			}
		}

		noOfLeafPathsRecursion(node.left,map,len+1);
		noOfLeafPathsRecursion(node.right,map,len+1);
	}
}