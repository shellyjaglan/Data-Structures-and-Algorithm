import java.util.Scanner;

public class  PairSumRotateArray{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a number for arr length: ");

        int n = in.nextInt();
        int arr[] = new int[n];
        
        System.out.print("Enter a number for pair sum: ");
        int sum = in.nextInt();

       for(int i=0 ; i<n ; i++){
           arr[i] = in.nextInt();
       }

        System.out.println("here result: "+findPairSum(arr, n, sum));
    }

    public static boolean findPairSum(int[] arr, int n,int sum){
        //checks if pair sum exists in the rotate array or not...
        //returns bool
        int min , max, i;

        for(i=0 ; i<n-1; i++){
            if(arr[i] > arr[i+1])
                break;
        }

        max = i;
        min = (i+1) % n;

        while(min != max){
            if(arr[max] + arr[min] == sum)
                return true;
            if(arr[max] + arr[min] < sum){
                min = (min+1) % n;
            }
            else
                max = (n+ max - 1) % n;
        }
        return false;
    }
}