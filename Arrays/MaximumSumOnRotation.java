import java.util.Scanner;

public class MaximumSumOnRotation{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a number for arr length: ");

        int n = in.nextInt();
        int arr[] = new int[n];
        
    //    for(int i=0 ; i<n ; i++){
    //        arr[i] = in.nextInt();
    //    }
        int a[]= {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("here result max sum: "+ findMaximumSumOnRotation(a, 10));
    }

    public static int findMaximumSumOnRotation(int[] arr, int n){
        //Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
        //Given an array, only rotation operation is allowed on array. We can rotate the array as many times as we want. Return the maximum possbile of summation of i*arr[i]
        
        // Input: arr[] = {1, 20, 2, 10}
        // Output: 72
        // We can 72 by rotating array twice.
        // {2, 10, 1, 20}
        // 20*3 + 1*2 + 10*1 + 2*0 = 72
        
        int curr_value = 0;
        int arrsum = 0;

        for(int i=0; i<n ; i++){
            arrsum = arrsum + arr[i];
            curr_value = curr_value + (i*arr[i]);
        }

        int max = curr_value;

        for(int j=1 ; j<n; j++){
            curr_value = curr_value + arrsum - (n*arr[n-j]);
            if(curr_value > max){
                max = curr_value;
            }
        }

        return max;
    }

}