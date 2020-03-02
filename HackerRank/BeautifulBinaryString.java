import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class BeautifulBinaryString{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		String str = in.next();
		int ans = minmumStepsToBeautiful(str);
		System.out.println(ans);
		
	}

	static int minmumStepsToBeautiful(String str){
        int count=0;
        String match = "010";
        StringBuffer sb = new StringBuffer(str);
        
        for(int i=0,j=3; i<sb.length()-2 && j<=sb.length(); i++,j++){
            if(sb.substring(i,j).equals(match)){
                sb.replace(i+2,i+3,"1");
                count++;
            }
        }
        return count;
	}
}