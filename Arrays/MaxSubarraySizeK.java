import java.util.ArrayList;
import java.util.*;

//Given an array of integers and a number k, find maximum sum of a subarray of size k.
//https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/

class MaxSubarraySizeK{
    public static void main(String[] args){
        MaxSubarraySizeK obj = new MaxSubarraySizeK();

        // int a[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        // int k = 4;
        // System.out.println(obj.findsubarray(a, k));



        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int j=0 ; j<t ; j++){
            int n = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i < n;i++){
                arr[i] = in.nextInt();
            }
            System.out.println(obj.findsubarray(arr, k));
        }
       
    }

    int findsubarray(int[] arr, int k){
        int n = arr.length;

        int sum = 0, max = 0;

        for(int i=0 ; i<n ; i++){
            int temp = arr[i];
            sum = sum+temp;
            arr[i] = sum;
        }

        if(k == n){
            return arr[n-1];
        }
        if(k > n){
            return -1;
        }

        for(int i = k ; i<n ; i++){
            int temp = arr[i] - arr[i-k];
            max = Math.max(max, temp);
        }

        max = Math.max(max, arr[k-1]);
        
        return max;
    }
}