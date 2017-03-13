import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.lang.*;

class RankFindPermutationGiven{
	public static void main(String[] args) {
		String s = "3241";
		int rank = find_Rank(s);
		System.out.println(rank);
	}
	public static int find_Rank(String s){
		int l = s.length();
		int ans = 0;
		//newstr = s;
		StringBuffer newstr = new StringBuffer(s);
		System.out.println("len of newstr: "+newstr.length());
		if(l <= 1)
			return 0;
		
		for(int i = 0;i < l-1; i++){
			System.out.println("str : "+newstr);
			//ans = ans + rank * (n-1)!;
			ans = ans + give_rank_of_each_element(newstr.toString(),s.charAt(i)) *factorial(newstr.length()-1);
			newstr.deleteCharAt(0);	
			System.out.println("str : "+newstr);
			System.out.println("ans: "+ans);
		}
		return ans;
	}
	public static int give_rank_of_each_element(String newstr,char c){
		String str2 = new String(newstr);
		int arr[] = new int[str2.length()];
		for(int j = 0; j < str2.length(); j++){
			arr[j] = Integer.valueOf(str2.charAt(j));
		}
		Arrays.sort(arr);
		int count = 0;
		int ans = -1;
		for(int i = 0; i < str2.length();i++){
			if(arr[i] == c){
				count++;
				ans = i;
			}
		}
		if(count == 0){
			return -1;
		}
		else{
			return ans;
		}
	}
	public static int factorial(int n) {
		//System.out.println("n is: "+n);
		
	    if (n == 1)
	      return 1;
	    return factorial(n-1) * n;
  	}

}