//hackerrank cieser cypher encryption
import java.util.*;

class Encryption{
	public static void main(String[] args) {
		Encryption obj = new Encryption();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1 || n>100){
			System.out.println("in n");
			return;
		}
		String str = in.next();
		if(str.length() != n){
			System.out.println("in str");
			return;
		}
		int k = in.nextInt();
		if(k < 0 || k > 100)
			return;
		String s = obj.cypher(str,k);
		System.out.println(s);
	}	
	String cypher(String s,int k){
		StringBuffer sb = new StringBuffer();
		int len = s.length();
		for(int i = 0; i < len;i ++){
			char c = s.charAt(i);
			int val = (int) c;
			if(val >= 97 && val <= 122){
				int num = val -97;
				int numB = (num+k)%26;
				//sb.append((char)(numB + 97));
				//sb.append((char) j);
				c = (char) (numB + 97);
				//System.out.println("c: "+c);
			}
			else if(val >=65 && val <= 90){
				int num = val - 65;
				int numB = (num+k)%26;
				//sb.append((char)(numB + 65));
				//sb.append((char) j);
				c = (char) (numB + 65);
				//System.out.println("c: "+c);
			}

			// else{
			// 	sb.append(c);
			// }
			sb.append(c);
		}
		return sb.toString();
	}
}