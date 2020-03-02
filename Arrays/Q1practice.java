import java.util.Scanner;
import java.util.*;

class Q1practice{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String s = in.nextLine();
		Q1practice obj = new Q1practice();
		if(obj.ans(s)){
			System.out.println("no duplicate");
		}
		else{
			System.out.println("yes duplicate");
		}
	}
	boolean ans(String s){
		HashSet set = new HashSet();
		for(int i = 0;i < s.length(); i++){
			if(!set.contains(s.charAt(i))){
				set.add(s.charAt(i));
			}
			//if set already contains char
			else{
				return false;
			}
		}
		return true;
	}
}