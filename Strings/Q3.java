import java.util.Scanner;
import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

class Q3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();

		Q3 obj = new Q3();
		System.out.println("the two strings are permutable ? : " + obj.isPermutable(str1,str2));
	}

	public boolean isPermutable(String s1, String s2){

		int len1 = s1.length();
		int len2 = s2.length();

		if(len1 != len2){
			return false;
		}

		Hashtable ht = new Hashtable();
		for(int i = 0;i < len1;i++){
			char c = s1.charAt(i);
			if(ht.containskey(c)){
				int val = ((int)ht.get(c)) + 1;
				ht.put(c,val);
			}
			else
				ht.put(c,1);
		}
		for(int i = 0;i < len2;i++){
			char c = s2.charAt(i);
			if(ht.containskey(c)){
				int val = (int)ht.get(c);
				if(val == 0){
					return false;
				}
				val--;
				ht.put(c,val);
			}
			else{
				return false;
			}
		}
		
		// Iterator itr = ht.entrySet().iterator();

		// while(itr.hasNext()){
		// 	System.out.println("key :"+itr.getKey());
		// 	System.out.println("value: "+itr.getValue());
		// }

		Set keys = ht.keySet();

		// for(Character k :keys){
		// 	if(ht.get(k) != 0)
		// 		return false;
		// }

		char ch;
		Iterator itr = keys.iterator();
		while(itr.hasNext()){
			ch = (char)itr.next();
			System.out.println("char is: "+ch+"value is: "+ht.get(ch));
		}
		return true;
	}

}