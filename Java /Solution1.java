import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution1 obj = new Solution1();
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t < 1 || t > 10)
            return;
        for(int k = 0;k < t;k++){
            System.out.println("in t loop:");
            int n = in.nextInt();
            if(n < 1 || n > Math.pow(10,5))
                return;
            int arr[] = new int[n];
            for(int i =0;i < n;i++){
                arr[i] = in.nextInt();
                if(arr[i] < (Math.pow(10,4) *-1) || arr[i] > Math.pow(10,4))
                    return;
            }
            int max1  = obj.calMaxSubarraySum_DP(arr);
            int max2 = obj.max_positive(arr);
            System.out.print(max1 +" "+max2);   
        }
    }
    int calMaxSubarraySum_DP(int[] a){
        int currsum = a[0];      
        int maxSum = a[0];     
        for(int i=1; i < a.length;i++){
            currsum = max(a[i] , currsum +a[i]);
            maxSum = max(currsum , maxSum);                 
        }
        return maxSum;
    }
    int max_positive(int[] a){
        int sum = a[0];
        for(int i = 1; i < a.length;i++){
            if(sum < 0 && a[i] < 0){
                if(a[i] > sum)
                    sum = a[i];
            }
            else if(sum < 0 && a[i] >= 0)
                sum = a[i];
            else if(sum >= 0 && a[i] >= 0)
                sum = sum + a[i];
        }
        return sum;
    }
    int max(int a,int b){
		return (a>b) ? a : b;
	}
    
}