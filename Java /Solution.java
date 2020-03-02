import java.math.*;
import java.util.*;
import java.util.Scanner;

class Solution{
	//function 
	public void isFunny(String s ,int len){
			System.out.println("length is: " + len);
			String revs = new StringBuffer(s).reverse().toString();
			int a ,b,c,d;
			for(int i = 1; i < len; i++){
				a = ((int)s.charAt(i));
				b = ((int)s.charAt(i - 1));
				c = ((int)revs.charAt(i));
				d = ((int)revs.charAt(i - 1));
				if( (Math.abs(a - b)) == (Math.abs(c - d)) )
					continue;
				else{
					System.out.println("not funny");
					return ;
				}
			}
			System.out.println("funny");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no of test cases:");
		int t = in.nextInt();
		if(t < 1 )
			return;
		else if(t > 10)
			return;
		else{
			for(int i = 0;i < t;i++){
				System.out.println("enter the string:");
				String str = in.next();
				int leng = str.length();
				if(leng >= 2 && leng <= 10000){
					Solution obj = new Solution();
					obj.isFunny(str,leng);
				}
				else
					return;
			}
		}
	}
}
		//	String revStr = new StringBuffer(str).reverse().toString();
    	//  System.out.println("Reverse String is" + revStr);
		//	int len = str.length();
/*
			for(int i = 1; i <= length; i++){
				if((((int)str.charAt[i]) - ((int)str.charAt[i - 1])) == (((int)revStr.charAt[i]) - ((int)revStr.charAt[i - 1]))))
					continue;
				
			System.out.println("funny");
		*/
		//if( ( ((int)s.charAt[i]) - ((int)s.charAt[i - 1]) ) == ( ((int)revs.charAt[i]) - ((int)revs.charAt[i - 1]) )  )