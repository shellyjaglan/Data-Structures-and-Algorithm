import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GiantNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = in.nextInt();
        }
        int q = in.nextInt();
        for(int i=0 ; i<q ; i++){
            int x= in.nextInt();
            int k = in.nextInt();
            //pas to func..
            if(printresult(arr,x,k)){
                System.out.println("YES");
            }
            else{
                 System.out.println("NO");
            }
            
        }
    }
    
    static boolean printresult(int[] arr,int x,int k){
        int count = 0;
        int maxi = max(arr);
        if(maxi > )
        for(int i=0 ; i<arr.length ; i++){
            if((x % arr[i]) == 0){
                count++;
            }
        }
        if(count >= k){
            return true;
        }
        else{
            return false;
        }
    }

    static int max(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    static findFactor(int n){
        int i;
        for(i = 1; i <= n; i++) {
            if(n%i == 0) {
                //System.out.format(" %d  ", i);
            }
        }
    }
}