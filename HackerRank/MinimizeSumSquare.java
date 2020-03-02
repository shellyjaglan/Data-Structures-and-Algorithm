import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimizeSumSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        long x = minimize(n,k,a);
        System.out.println("ans is: "+x);
    }
    static long minimize(int n,int k,int[] arr){
        long sum = 0;
        Arrays.sort(arr);
        
        for(int i=0 ; i<k ; i++){
            for(int j=0; j<k ; j++){
                sum += Math.pow((arr[i] - arr[j]),2);
            }
        }
        
        return sum;
    }
}