import java.util.*;
import java.text.DecimalFormat;

/*class SamandSubStrings{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		//System.out.println("string is: "+s);
		int l = s.length();
		//System.out.println("l is: "+l);
		if(l < 3 || l > (2*100000)){
		//	System.out.println("in l large: ");
			return;
		}
		Long sum = 0L;
		String sub;

		DecimalFormat df = new DecimalFormat("###");
		//System.out.println(df.format(answer));

		for(long i = 0 ;i < l; i++){
			for(long j = i+1; j <= l;j++){
				sub = s.substring(i,j);
				sum = sum + Long.parseLong(sub);
			}
		}
	//	Long a =(Long) sum % (Math.pow(10,9) + 7);
		System.out.println(df.format((Long) sum % (Math.pow(10,9) + 7)));
	}
}
//this method was working but giving runtime errors...in order to correct it 
//a new recursive method is writen below..
//uses clear and smart recursion
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SamandSubStrings {
    static long sum10[] = new long[200001];
    static long MOD = 1000000007L;
    static class ReturnValue {
        public long a;
        public long b;
    }
    static ReturnValue solve(String s, int index) {
        int n = s.length();
        ReturnValue ret = new ReturnValue();
        if (index == n-1) {
            ret.a = ret.b = s.charAt(index) - '0';
          //  System.out.println("1ret a: "+ret.a);
        } else {
            ReturnValue oldRet = solve(s, index + 1);
         //   System.out.println("old val a: "+oldRet.a + " old val b: "+oldRet.b);
         //   System.out.println("indx val: "+ s.charAt(index));
          //  System.out.println("indx val: "+ (s.charAt(index)- '0') * sum10[n - 1 - index]);
            ret.a = (((s.charAt(index) - '0') * sum10[n - 1 - index])%MOD + oldRet.a)%MOD;
         //   System.out.println("ret.a is: "+ret.a);
            ret.b = (ret.a + oldRet.b)%MOD;
         //   System.out.println("ret.b is: "+ret.b);
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                sum10[i] = 1;
            } else {
                sum10[i] = ((sum10[i-1] * 10)%MOD + 1)%MOD;
            }
        }
        System.out.println(solve(s, 0).b);
    }
}