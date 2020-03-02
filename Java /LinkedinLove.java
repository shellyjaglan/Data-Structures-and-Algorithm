import java.util.*;
//import java.ArrayList;


class LinkedinLove{
	public static void main(String[] args) {
		LinkedinLove obj  = new LinkedinLove();
		//Scanner in = new Scanner(System.in);
		String str = "abcdelinlinasdli";
		int len =  str.length();
		System.out.println("len of original string: "+len);
		obj.countEdits(str);

	}
	void countEdits(String s){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int l = s.length();
		String linked = "linkedin";

		String s1 = s.substring(0,(l/2));
		System.out.println("substring s1 is: "+s1);
		String s2;

		if(l % 2 != 0){
			//odd length
			s2 = s.substring(l/2+1,l);
		}	
		else{
			//even len ex.16 /18
			s2 = s.substring(l/2,l);
		}
		System.out.println("substring s2 is: "+s2);
		pass(s1,s2,linked,list);
		pass(s1,s2,linked,list);

		//int min = Collections.min(list);
		Iterator<Integer> itr = list.iterator();
		int min  = 2;
		int z = list.size();
		System.out.println(" size: "+z);
		while(itr.hasNext()){
			int i = (int)itr.next();
			System.out.println(" sdasdas");
			System.out.println(" "+i);
			if(i < min){
				min = i;
			}
		}
		System.out.println("min is: "+min);
	}

	void pass(String s1,String s2,String linked,ArrayList<Integer> list){
		System.out.println("in pass 1");
		//StringBuilder sb = new StringBuilder();
		for(int i = 0;i <= (s1.length() - 8); i ++){
			StringBuilder sb = new StringBuilder();
		//	System.out.println(" w");
			int edits = 0;
			for(int j = 0; j <8;j++){
				System.out.println(" ssssdsdssdasdas");
				if(s1.charAt(i+j) != linked.charAt(j)){
					edits++;
				}
				sb.append(linked,i+j,1);
			}
			edits = edits + compare(sb.toString(),s2);
			System.out.println(" edits: "+edits);
			list.add(edits);
		}
		System.out.println(" ssssssdasdas");
	}
	int	compare(String s1,String s2){
		int edits = 0;
		int i ,j;
		StringBuilder sb2 = new StringBuilder();

		for(i =  s1.length()-1,j = 0 ; i >= 0 && j <s2.length()-1 ;i--,j++){
			if(s1.charAt(i) != s2.charAt(j)){
				edits++;
			}
			char c = s1.charAt(i);
			sb2.append(c);
		}
		return edits;
	}

}