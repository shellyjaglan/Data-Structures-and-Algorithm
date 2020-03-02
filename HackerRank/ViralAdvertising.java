import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising{
    public static void main(String[] args) {
    	Scanner in  = new Scanner(System.in);
    	int n = in.nextInt();
    	if(n < 1 || n > 50)
    		return;
    	int m =5,ans =0,people_like = 0;

    	for(int day = 1; day <= n;day++){
    		people_like = (int)Math.floor(m/2);
    	//	System.out.println("people_like: "+people_like);
    		ans += people_like;
    	//	System.out.println("ans: "+ans);
    		m = people_like * 3;
    	//	System.out.println("m : "+m);
    	}
    	System.out.println(ans);
    }
}