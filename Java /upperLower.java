import java.util.Scanner;
import java.util.*;
class upperLower{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s ;
		System.out.println("enter the string:");
		s = in.nextLine();
		int len = s.length();
		int i,j ;

		char[] name = new char [len];
		char[] nameNew = new char[len];

		for(i=0;i<len;i++){
			name[i] = s.charAt(i);
		}
		for(i=0;i<len;i++){
			System.out.print(name[i]);
		}

		for(i=0,j=0;i<len;i++,j++){
			if(name[i] <= 'Z' && name[i] >= 'A'){
				nameNew[j] = name[i];
				nameNew[j] += 32;
			}
			else if(name[i] <= 'z' && name[i] >= 'a'){
				nameNew[j] = name[i] ;
				nameNew[j] -= 32;
			}
			else {
				nameNew[j] = name[i];
			}
		}
		String ans= new String(nameNew);
		System.out.println(ans);
	}
}