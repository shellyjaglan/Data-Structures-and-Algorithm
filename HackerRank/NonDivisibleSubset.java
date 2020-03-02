import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int i;
        HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
        for(i=0 ; i<n ; i++){
            int num = in.nextInt();
            int mod = num % k;
            if(!hm.containsKey(mod)){
                hm.put(mod,1);
            }
            else{
                int val = (int)hm.get(mod);
                hm.put(mod,val+1);
            }
        }
        //so in this way we have made a hashmap of all input values of mod of key
        //hashmap of input%k store 
        int count=0;
        HashMap<Integer,Integer> hm2 =new HashMap<Integer,Integer>();
        for(i=0 ; i<k ;i++){
            if(!hm.containsKey(i)){
               hm2.put(i,0); 
            }
            else{
                hm2.put(i,(int)hm.get(i));
            }
        }
     //    System.out.println("hm2 is: "+hm2);
        // System.out.println("k/2: "+ (k/2));
        // System.out.println("fdfdfs");
        // System.out.println("ceil of: "+Math.ceil(7/2));
        // System.out.println("floor  of: "+Math.floor(7/2));
        // System.out.println("ceil is: "+Math.ceil((double)k/2));
         int j,w;
         // j< Math.ceil((double)k/2);
        for(j=1, w=k-1; j<w; j++,w--){
        //    System.out.println("fdfdfs");
          //  System.out.println("j is: "+j);
            int maxim = max((int)hm2.get(j),(int)hm2.get(w));
            count += maxim; 
        }
        if(hm2.get(0) > 0){
            count++;
        }
        if((k%2) == 0){
            if((int)hm2.get(k/2) > 0){
                count++;
            } 
        }
        System.out.println(count);
    }
    static int max(int a,int b){
        return (a>=b)?a:b;
    }
}