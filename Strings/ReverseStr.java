import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseStr {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t > 0){
		  //  System.out.println("Sdasdasd");
		    String s = in.next();
		  //  System.out.println(s);
		    String[] str = s.split("\\.");
		  //  System.out.println(str[0]);

		    // for(String word:str){
		    //     System.out.println(word);
		    // }
		    for(int i=str.length-1 ; i>=0 ; i--){
		        System.out.print(str[i]);
		        if(i != 0)
		       		System.out.print(".");
		    }
		    t--;
		}
	}
}