import java.util.*;
import java.util.ArrayList;

class GraphTest{
	private HashMap<Integer, List<Integer>> adj;

	GraphTest(){
		adj = new HashMap<Integer,List<Integer>>();
	}

	public static void main(String[] args) {
		GraphTest obj = new GraphTest();
		obj.addEdge(1,2);
		obj.addEdge(2,3);
		obj.addEdge(3,4);
		obj.addEdge(4,1);
		obj.addEdge(1,3);
		obj.printedge();
	}

	public void addEdge(int s,int d){
		List<Integer> list;
		if(adj.containsKey(s)){
			System.out.println("contain s: "+s);
			list = adj.get(s);
			list.add(d);
			adj.put(s,list);
			if(adj.containsKey(d)){
				System.out.println("contain d: "+d);
				list = adj.get(d);
				list.add(s);
				adj.put(d,list);
			}
			else{
				System.out.println("not contain d: "+d);
				list = new ArrayList<Integer>();
				list.add(s);
				adj.put(d,list);
			}
		}
		else if(!adj.containsKey(s)){
			System.out.println("not contain s: "+s);
			list = new ArrayList<Integer>();
			list.add(d);
			adj.put(s,list);
			if(adj.containsKey(d)){
				System.out.println("contain d: "+d);
				list = adj.get(d);
				list.add(s);
				adj.put(d,list);
			}
			else{
				System.out.println("not contain d: "+d);
				list = new ArrayList<Integer>();
				list.add(s);
				adj.put(d,list);
			}
		}
	}

	public void printedge(){
		for(Integer key : adj.keySet()){
			System.out.print(key + ":");
			for(Integer val : adj.get(key)){
				System.out.print(val +" ");
			}
			System.out.println();
		}
	}
}