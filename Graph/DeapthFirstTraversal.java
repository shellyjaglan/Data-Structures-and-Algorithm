import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

class DeapthFirstTraversal{
	int V;
	LinkedList<Integer> adj[];

	DeapthFirstTraversal(int v){
		V = v;
		adj = new LinkedList[V];
		for(int i =0;i < v;i++){
			adj[i] = new LinkedList();
		}
	}

	public static void main(String[] args) {
		DeapthFirstTraversal obj = new DeapthFirstTraversal(4);
		obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);
 		
        System.out.println("Following is Deapth First Traversal "+
                           "(starting from vertex 2)");
 
        obj.DFS();
	}

	void addEdge(int v, int d){
		adj[v].add(d);
	}

	void DFS(){
		// Mark all the vertices as not visited(set as
        // false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
		for(int i = 0;i<V;i++){
			if(visited[i] == false)
				DFSuntil(i,visited);
		}
	}

	void DFSuntil(int v,boolean visited[]){
		 // Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v+" ");

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> itr = adj[v].listIterator();
		while(itr.hasNext()){
			int n = itr.next();
			if(!visited[n]){
				DFSuntil(n,visited);
			}
		}
	}
}