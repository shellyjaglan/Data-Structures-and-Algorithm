import java.util.*;

class RemoveDuplicateString2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0 ; i<t ; i++){
        	String s = in.next();
        	System.out.println(removeDuplicate(s));
        }
	}
	static String removeDuplicate(String s){
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0 ; i<s.length() ; i++){
			list.add(s.charAt(i));
		}
		//System.out.println(list);
		int c = 0;
		while(true){
			c = 0;
			for(int i=0 ; i<list.size()-1 ; i++){
				if((char)list.get(i) == (char)list.get(i+1)){
					c = 1;
					while((i+1) < list.size() && (char)list.get(i) == (char)list.get(i+1)){
						list.remove(i+1);
					}
					list.remove(i);
					i--;
				}
			}
			if(c == 0)
				break;
		}
		String res ="";

		for(int i=0 ; i<list.size() ; i++){
			res = res + (char)list.get(i);
		}
		return res;
	}
}