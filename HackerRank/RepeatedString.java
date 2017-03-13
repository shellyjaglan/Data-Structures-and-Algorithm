import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int len = s.length();
       // int ans = usingDP(s,n);
        if(s.length() == 1 && s.charAt(0) == 'a'){
           System.out.println(n);
            return;
       }
      //  long count=0;    
        // for(int i=0 ; i<n ; i++){
        //     if(i >= len){
        //         int quo= i/len;
        //         System.out.println("quo is: "+quo);
        //        c = s.charAt(i - (quo*len)); 
        //        System.out.println("index is: "+ (i -(quo*len)));
        //        if(c == 'a'){
        //             count++;
        //         }
        //     }
        //     else{
        //         c = s.charAt(i);
        //         if(c == 'a'){
        //             count++;
        //         }
        //     }
        //     System.out.println("c is: "+c);
            
        // }



        if(n >= len){
            long num = n/len;
            long m = n % len;
            for(int i=0 ; i<len ; i++){
                if(s.charAt(i) == 'a')
                    count++;
            }

            num = num * count;
            for(int i=0 ; i<m ; i++){
                if(s.charAt(i) == 'a')
                    num++;
            } 
            System.out.println("num is: "+num);
        }
        else{
            for(int i=0 ; i<n ; i++){
                if(s.charAt(i) == 'a')
                    count++;
            }
            System.out.println(count);
        }
        //int num = n / len;
        
    }  
}