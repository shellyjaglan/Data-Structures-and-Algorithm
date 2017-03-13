import java.util.*;

class LeftRotatetheArray{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n;i++){
			int m = i -d;
			if(m < 0){
				arr[n -d +i] = in.nextInt();
			}
			else{
				arr[m] = in.nextInt();
			}
		}
		for(int j = 0; j<n;j++){
			System.out.println(arr[j] +" ");
		}

	}
}