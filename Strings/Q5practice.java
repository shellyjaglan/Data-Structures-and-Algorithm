import java.util.*;
import java.util.ArrayList;

class Q5practice{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = in.nextLine();
		Q5practice obj = new Q5practice();
		String ans = obj.compress(s);
		System.out.println("compressed string is: " + ans);

	}
	String compress(String s){
		//ArrayList list = new ArrayList();
		int len = s.length();
		char pre = s.charAt(0);
		int count = 1;
		StringBuffer buff = new StringBuffer();

		for(int i = 1; i< len;i++){
			if(pre == s.charAt(i)){
				count++;
			}
			else{
				buff.append(pre);
				buff.append(count);
				count = 1;
			}
			pre = s.charAt(i);
		}
		buff.append(pre);
		buff.append(count);
		
		if(buff.length() >= len){
			return s;
		}
		//return Arrays.deepToString(list.toArray());
		return buff.toString();
	}
}