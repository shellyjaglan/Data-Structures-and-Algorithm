import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

class DetectCycleInUNDirectedGraph{
	public HashMap<Integer,List<Integer>> hm;
	
	DetectCycleInUNDirectedGraph(){
		hm = new HashMap<Integer,List<Integer>>();
	}
	public static void main(String[] args) {
		DetectCycleInUNDirectedGraph obj = new DetectCycleInUNDirectedGraph();
		obj.addEdge(1,2);
		obj.addEdge(1,3);
		//obj.addEdge(2,3);
		//obj.addEdge(4,1);
		obj.addEdge(3,5);
		obj.addEdge(5,4);
	///	obj.addEdge(4,3);
	//	obj.addEdge(3,3);
		obj.printGraph();
		if(obj.hasCycle())
			System.out.println("has cycle");
		else
			System.out.println("does not have cycle");
	}

	boolean hasCycle(){
		int size = hm.size();
		System.out.println("size is: "+size);
		boolean[] visited = new boolean[size+1];
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()){
			int element = itr.next();
			if(!visited[element]){
				if(dfs(element,visited,-1))
					return true;
			}
		}
		return false;
	}
	boolean dfs(int element,boolean[] visited,int parent){
		System.out.println("element is: "+element+" parent is: "+parent);
		visited[element] = true;
		Iterator<Integer> itr = hm.get(element).iterator();
		while(itr.hasNext()){
			int next = itr.next();
			System.out.println("next is: "+next);
			if(!visited[next]){
				if(dfs(next,visited,element))
					return true;
			}
			else if(next != parent){
				return true;
			}
		}
		return false;
	}
	
	void addEdge(int s,int d){
		//adds edge in directed graph..
		List<Integer> list;
		if(hm.containsKey(s)){
			list = hm.get(s);
			list.add(d);
			hm.put(s,list);
			if(hm.containsKey(d)){
				list = hm.get(d);
				list.add(s);
				hm.put(d,list);
			}
			else{
				list = new ArrayList<Integer>();
				list.add(s);
				hm.put(d,list);
			}
		}
		else{
			list = new ArrayList<Integer>();
			list.add(d);
			hm.put(s,list);
			if(hm.containsKey(d)){
				//System.out.println("contain d: "+d);
				list = hm.get(d);
				list.add(s);
				hm.put(d,list);
			}
			else{
				//System.out.println("not contain d: "+d);
				list = new ArrayList<Integer>();
				list.add(s);
				hm.put(d,list);
			}
		}
	}
	void printGraph(){
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()){
			int nxt = itr.next();
			Iterator<Integer> itrlist = hm.get(nxt).iterator();
			System.out.print(nxt+": ");
			while(itrlist.hasNext()){
				System.out.print(itrlist.next()+" ");
			}
			System.out.println();
		}
	}
}