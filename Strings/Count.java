import java.util.*;
import java.lang.*;
import java.io.*;

class Count {
	public static void main (String[] args) {
		Scanner in  = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			String s = in.next();
			System.out.println(findcount(s,s.length()));
		}
	}

	static int findcount(String s,int len){
		int zero = 0,one = 0,count=0;

		for(int i=0 ; i<len ; i++){
			char c = s.charAt(i);
			if(c == '1' && one == 0 ){
				one = 1;
			}
			else if(c == '1' && zero >=1 && one == 1){
				count++;
				one = 1;
				zero = 0;
			}
			else if(c == '0' && one == 1){
				zero ++;
			}
			else if(c == '1'){
				zero = 0;
				one = 1;
			}
			else{
				zero=0;
				one=0;
			}
		}
		return count;
	}
}
