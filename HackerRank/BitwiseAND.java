import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitwiseAND{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t < 1 && t > (Math.pow(10,3)))
            return;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if(n < 2 || n > (Math.pow(10,3)))
                return;
            int k = in.nextInt();
            if(k < 2 || k > n)
                return;
            int max = 0 ,x;
            boolean b; 
            for(int i = 0 ;i < n; i++){
                for(int j= i+1;j < n; j++){
                    x = i & j;
                    if(x > max && x < k){
                        max = x;
                        b = true;
                    }
                }
            }
            if(b = true){
                System.out.println(max);
            }
            else{
                System.out.println(0);
            }
        }
    }
}