import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int c[] = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int c_i=0; c_i < n; c_i++){
            //c[c_i] = in.nextInt();
            int m = in.nextInt();
            if(!hm.containsKey(m)){
                hm.put(m,1);
            }
            else{
                int val = (int) hm.get(m);
                hm.put(m,val+1);
            }
        }
        Iterator itr = hm.keySet().iterator();
        int count=0;
        while(itr.hasNext()){
            int hval = (int)hm.get(itr.next());
            if(hval > 1){
                count += Math.ceil(hval/2);
            }
        }
        System.out.println(count);
    }
}