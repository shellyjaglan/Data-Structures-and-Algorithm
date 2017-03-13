import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

class DetectCycleInDirectedGraph{
	public HashMap<Integer,List<Integer>> hm;
	
	DetectCycleInDirectedGraph(){
		hm = new HashMap<Integer,List<Integer>>();
	}
	public static void main(String[] args) {
		DetectCycleInDirectedGraph obj = new DetectCycleInDirectedGraph();
		obj.addEdge(1,2);
		obj.addEdge(1,3);
		obj.addEdge(2,3);
		//obj.addEdge(4,1);
		obj.addEdge(4,5);
		obj.addEdge(5,6);
		obj.addEdge(6,4);
		obj.addEdge(3,3);
		obj.printGraph();
		
		if(obj.hasCycle())
			System.out.println("has cycle");
		else
			System.out.println("does not have cycle");
	}
	boolean hasCycle(){
		HashSet<Integer> white = new HashSet();
		HashSet<Integer> grey = new HashSet();
		HashSet<Integer> black = new HashSet();

		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()){
			white.add(itr.next());
		}
		Iterator<Integer> setItr = white.iterator();
		while(setItr.hasNext()){
			int current = setItr.next();
			if(dfs(current,white,grey,black)){
				return true;
			}
		}
		return false;
	}
	boolean dfs(int current,Set<Integer> white,Set<Integer> grey,Set<Integer> black){
		moveVertex(current,white,grey);
		Iterator<Integer> hmitr = hm.get(current).iterator();
		while(hmitr.hasNext()){
			int element = hmitr.next();
			if(black.contains(element)){
				continue;
			}
			else if(grey.contains(element)){
				return true;
			}
			else if(dfs(element,white,grey,black)){
				return true;
			}
		}
		moveVertex(current,grey,black);
		return false;
	}
	void moveVertex(int current,Set<Integer> removeSet,Set<Integer> addtoSet){
		if(removeSet.contains(current)){
			removeSet.remove(current);
		}
		addtoSet.add(current);
	}
	void addEdge(int s,int d){
		//adds edge in directed graph..
		List<Integer> list;
		if(hm.containsKey(s)){
			list = hm.get(s);
			list.add(d);
			hm.put(s,list);
		}
		else{
			list = new ArrayList<Integer>();
			list.add(d);
			hm.put(s,list);
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