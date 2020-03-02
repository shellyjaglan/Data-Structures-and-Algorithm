import java.util.Scanner;

class MinimumSwap{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int cases  = in.nextInt();
        for(int i=0 ; i<cases ; i++){
            int n = in.nextInt();
            int[] arr = new int[n];

            for(int j=0 ; j<n ; i++){
                arr[i] = in.nextInt();
            }
            int k = in.nextInt();

            System.out.println(findMiniSwap(arr,n,k));
        }
    }

    int findMiniSwap(int[] arr, int n, int k){
        if(n == 0)
            return 0;
        int i = 0, j = n-1, count = 0;

        while(i<j){
            
        }
    }
}