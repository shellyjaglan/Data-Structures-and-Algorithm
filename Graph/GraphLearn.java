import java.util.*;
import java.util.ArrayList;

class GraphLearn{
	public HashMap<Integer,List<Integer>> adj;
	GraphLearn(){
		adj = new HashMap<Integer,List<Integer>>();
	}
	public static void main(String[] args) {
		GraphLearn obj = new GraphLearn();
		obj.addEdge(1,2);
		obj.addEdge(2,3);
		obj.addEdge(3,4);
		obj.addEdge(4,1);
		obj.addEdge(1,3);
		obj.printedge();
	}
	void addEdge(int s,int d){
		List<Integer> list;
		if(adj.containsKey(s)){
			//i f adj contains key s as sourse
			//then we have to get the list from s and add d (destination)..
			list = adj.get(s);
			list.add(d);
			adj.put(s,list);
			if(adj.containsKey(d)){
				list = adj.get(d);
				list.add(s);
				adj.put(d,list);
			}
			else{
				list = new ArrayList<Integer>();
				list.add(s);
				adj.put(d,list);
			}
		}
		else{
			//adj does not contain s...
			list = new ArrayList<Integer>();
			list.add(d);
			adj.put(s,list);
			if(adj.containsKey(d)){
				//System.out.println("contain d: "+d);
				list = adj.get(d);
				list.add(s);
				adj.put(d,list);
			}
			else{
				//System.out.println("not contain d: "+d);
				list = new ArrayList<Integer>();
				list.add(s);
				adj.put(d,list);
			}
		}
	}
	void printedge(){
		Iterator<Integer> itr = adj.keySet().iterator();
		while(itr.hasNext()){
			int k = itr.next();
			Iterator listitr = adj.get(k).iterator();
			System.out.print(k + ":");
			while(listitr.hasNext()){
				System.out.print(listitr.next()+" ");
			}
			System.out.println();
		}
 	}
}