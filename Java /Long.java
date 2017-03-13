import java.util.Scanner;
import java.util.Arrays;

class Long{
		public static void func(long a[],int size){
        long sum = 0;
        for(int i = 0; i < size; i++){
          sum  = sum + a[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextLong();
        }
        func(arr,n);
    }
}
