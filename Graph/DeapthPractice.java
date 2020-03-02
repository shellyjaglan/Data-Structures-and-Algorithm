class DeapthPractice{
	int V;
	LinkedList<Integer> arr[];
	DeapthPractice(int v){
		V= v;
		arr[] = new LinkedList[V];
		for(int i=0 ; i<V ; i++){
			arr[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		DeapthPractice obj  = new DeapthPractice();
		obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        obj.DFS();
	}
	void addEdge(int s,int d){
		arr[s].add(d);
	}

	void DFS(){
		boolean visited[] = new boolean[V];
		for(int i=0 ; i<V ; i++){
			if(visited[i] == false)
				DFS_until(i,visited);
		} 
	}
	DFS_until(int i,boolean[] visited){
		visited[i] = true;
		System.out.println(i+" ");
		Iterator<Integer> itr = arr[i].listIterator();
		while(itr.hasNext()){
			//System.out.println(otr.next()+" ");
			if(visited[itr.next()] == fasle)
				DFS_until(itr.next(),visited);
		}
	}
}