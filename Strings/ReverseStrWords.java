import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseStrWords {
	public static void main (String[] args) {
	
		String str = "j c ";

		StringBuffer sb = new StringBuffer();

		int len = str.length();
		int start = -1,end = -1,gap = -1;

		for(int i=0; i <len ; i++){
			char ch = str.charAt(i);
			if(ch == ' '){
				if(start != -1){
					if(gap != -1){
						sb.insert(0," ");
					}
					sb.insert(0,str.substring(start,end+1));
					start = -1;
					end = -1;
					
					gap = 1;
				}
			}
			else{
				if(start == -1){
					start = i;
				}
				end = i;
			}
		}
		// System.out.println("start is: "+start);
		// System.out.println("end is: "+end);
		if(start != -1){
			if(gap != -1){
				sb.insert(0," ");
			}
			sb.insert(0,str.substring(start,end+1));
		}
		// System.out.println(sb);
		for(int j=0 ; j<sb.length() ; j++){
			System.out.println(sb.charAt(j));
		}
	}
}