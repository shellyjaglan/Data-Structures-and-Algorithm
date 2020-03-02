import java.util.*;
import java.lang.*;
import java.io.*;
//input ==  shelly.jag.hai
//output == yllehs.gaj.iah

class StringWordReverse {
	public static void main (String[] args) {
		//code
		StringWordReverse obj = new StringWordReverse();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
		    String s = in.next();
		    StringBuffer res = new StringBuffer();
		    for(String sh : s.split("s")){
		        StringBuffer sb = new StringBuffer(sh);
		        sb.reverse();
		        res.append(sb);
		        res.append('.');
		    }
		    res.deleteCharAt(res.length()-1);
		    System.out.println(res);
		}
	}
}