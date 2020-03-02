//refer to hackerrank for full ques info
//t means in a string there are only two unique char and no same char is adjacent..
//t eg..- abab

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

class TwoCharacters2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		String str = in.next();
		maket(str);
		//System.out.println(bool);
	}
	
	static void maket(String s){
		// System.out.println("here");
		// return;
		char c = '\0';
		if(ist(s) == true){
			//ok print string
			System.out.println(s);
			System.out.println(s.length());
			return;
		}
		else{
			System.out.println("in else after ist");
			StringBuffer sb  = new StringBuffer(s);
			while(hasDuplicate(sb.toString()) == true){
				//1 check two occuring together..
			//	System.out.println("duplicate ");
				sb = removeDuplicate(sb.toString());
				System.out.println(sb);
			}
			if(ist(sb.toString()) == true){
				//ok print string
				System.out.println(sb);
				System.out.println(sb.length());
				return;
			}
			//means still not t string..
			//means dublicate has been removed means no of char are > 2..
		//	ArrayList canremove = new ArrayList();
			System.out.println(sb);
			ArrayList cannotremove = new ArrayList();
			for(int i=0 ; i<sb.length()-2 ; i++){
				if(sb.charAt(i) == sb.charAt(i+2)){
					cannotremove.add(sb.charAt(i+1));
				}
			}
			// for(int i=0 ; i<sb.length() ; i++){
			// 	if(cannotremove.contains(sb.charAt(i)) == false){
			// 		canremove.add(sb.charAt(i));
			// 	}
			// }
			// Iterator itr = canremove.iterator();
			// int l = sb.length();
			// while(itr.hasNext()){
			// 	char nextchar = (char)itr.next();
			// 	//delete char..
			// 	for(int i=0 ; i<l ; i++){
			// 		if(sb.charAt(i) == nextchar){
			// 			//delete
			// 			sb.deleteCharAt(i);
			// 			l--;
			// 		}
			// 	}
			// 	if(ist(sb.toString())==true){
			// 		System.out.println(sb);
			// 		System.out.println(sb.length());
			// 		return;
			// 	}
			// }
			//commented arryalist made can remove..and whole while..
			System.out.println(cannotremove);
			HashMap hm = new HashMap();
			for(int i=0 ; i<sb.length() ; i++){
				if(cannotremove.contains(sb.charAt(i)) == false){
					if(hm.containsKey(sb.charAt(i))){
						int val = (int) hm.get(sb.charAt(i));
						hm.put(sb.charAt(i),val+1);
					}
					else{
						hm.put(sb.charAt(i),1);
					}
				}
			}
			System.out.println(hm);
			HashMap sortedCanDelete = sortbyValue(hm);
			System.out.println("sorted hm is: ");
			System.out.println(sortedCanDelete);

			Iterator itr = sortedCanDelete.keySet().iterator();
			while(itr.hasNext()){
				char now = (char)itr.next();
				System.out.println("now is: "+now);
				for(int i=0 ; i<sb.length() ;){
					if(sb.charAt(i) == now){
						sb.deleteCharAt(i);
					}
					else{
						i++;
					}
				}
				if(ist(sb.toString()) == true){
					System.out.println(sb);
					System.out.println(sb.length());
					return;
				}
			}
			System.out.println(0);
			return;
		}
	}

	static HashMap sortbyValue(HashMap hm){
		List list = new LinkedList(hm.entrySet());

		Collections.sort(list, new Comparator(){
			public int compare(Object o1,Object o2){
				 return (  (Comparable) ( (Map.Entry) (o1) ).getValue()  )
                  .compareTo( ( (Map.Entry) (o2) ).getValue() );
			}
		});

		HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
	}

	static boolean ist(String s){
		System.out.println("in ist");
		HashSet hs = new HashSet();
		for(int i=0 ; i <s.length()-1 ; i++){
			if(s.charAt(i) == s.charAt(i+1)){
				return false;
			}
			else{
				hs.add(s.charAt(i));
			}
		}
		hs.add(s.charAt(s.length()-1));
		if(hs.size() > 2){
			return false;
		}
		return true;
	}

	static StringBuffer removeDuplicate(String s){
		System.out.println("in remove duplicate ");
		//int length = s.length();
		StringBuffer sb = new StringBuffer(s);
		char c = '\0';
		for(int i=0 ; i<sb.length()-1 ; i++){
			if(sb.charAt(i) == sb.charAt(i+1)){
				 c = sb.charAt(i);
				 //remove c char from string..
				 break;
			}
		}
		System.out.println("c is: "+c);
		//int length = sb.length();
		if(c != '\0'){
			for(int i=0 ; i<sb.length() ;){
				if(sb.charAt(i) == c){
					sb.deleteCharAt(i);
					//length--;
					//i=i;
				}
				else
					i++;
			}
		}
		return sb;
	}
	static boolean hasDuplicate(String sb){
		for(int i=0 ; i<sb.length()-1 ; i++){
			if(sb.charAt(i) == sb.charAt(i+1)){
				System.out.println("sb char : "+sb.charAt(i));
				return true;
			}
		}
		return false;
	}
}