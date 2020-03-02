//refer to hackerrank for full ques info
//t means in a string there are only two unique char and no same char is adjacent..
//t eg..- abab

import java.util.*;

class TwoCharacters{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String str = in.nextLine();
		boolean bool = ist(str);
		System.out.println(bool);
	}
	static boolean ist(String s){
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
	// void maket(String s){
	// 	if(ist(s))
	// }
}