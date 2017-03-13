class PrintGraphLL{
	int vertex;
	LinkedList<Integer> arr[];

	PrintGraphLL(int v){
		vertex = v;
		arr = new LinkedList();
		for(int i=0 ; i<vertex ;i++){
			arr[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		PrintGraphLL obj = new PrintGraphLL();
		obj.addEdge(3,4);
		obj.addEdge(3,5);
		obj.addEdge(4,5);
		obj.addEdge(5,5);
		obj.addEdge(5,7);
		obj.addEdge(7,7);

		obj.printGraph();
	}
	void addEdge(int s,int d){
		for(int i=0 ; i<vertex ; i++){
			arr[i].add(s);
		}
	}
	void printGraph(){

	}
}