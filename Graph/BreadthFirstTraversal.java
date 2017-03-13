import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

class BreadthFirstTraversal{
	int V;
	LinkedList<Integer> adj[];
	String color;

	BreadthFirstTraversal(int v){
		V = v;
		//color = "white";
		adj = new LinkedList[V];
		for(int i =0;i < v;i++){
			adj[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		BreadthFirstTraversal obj = new BreadthFirstTraversal(4);
		obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);

		//obj.addEdge(0, 1);
        //obj.addEdge(0, 2);
        // obj.addEdge(1, 4);
        // obj.addEdge(4, 6);
        // obj.addEdge(6, 7);
        // obj.addEdge(7, 7);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        obj.BFS(2);
	}
	void addEdge(int v, int d){
		adj[v].add(d);
	}
	void BFS(int s){
		boolean visited[] = new boolean[V];
		 LinkedList<Integer> queue = new LinkedList<Integer>();
		 visited[s] = true;
		 //s.color = "grey";
		 queue.add(s);
		 while(queue.size() >0){
		 	s = queue.poll();
		 	System.out.print(s+" ");
		 	Iterator<Integer> itr = adj[s].listIterator();
		 	while(itr.hasNext()){
		 		int n = itr.next();
		 		if(!visited[n]){
		 			visited[n] = true;
		 			queue.add(n);
		 		}
		 	}
		}
	}
}