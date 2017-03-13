//pid=1578
import java.util.*;

class StringRerverseWithoutDuplicate{
	public static void main(String[] args) {
		StringRerverseWithoutDuplicate obj = 
		new StringRerverseWithoutDuplicate();
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		//System.out.println("t is: "+t);
		for(int i=0 ; i<t ; i++){
		//	System.out.println("in loop");
		    String s = in.nextLine();
		 //   System.out.println("s is: "+s);
		    String res = obj.reverse(s);
		    System.out.println(res);
		}
	}

	String reverse(String s){
		StringBuffer sb = new StringBuffer();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=s.length()-1 ; i>=0 ; i--){
			char ch = s.charAt(i);
			if(ch == ' ')
				continue;
			if(!set.contains(ch)){
				sb.append(ch);
				set.add(ch);
			}
		}
		return sb.toString();
	}
}