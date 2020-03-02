import java.util.Scanner;

class PairNum{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.println("enter the no of array elements:");
			int n = in.nextInt();
			int arr[] = new int[n];
			System.out.println("enter the array elements:");
			for(int i = 0;i < n;i++){
				arr[i] = in.nextInt();
			}
			System.out.println("enter the number you want as sum:");
			int s = in.nextInt();
			for(int i = 0;i < n;i++){
				int first = arr[i];
				for(int j = i+1 ;j < n;j++){
					int second = arr[j];
					if((first + second) == s){
						System.out.println(arr[i] + "," + arr[j]);
					}
				}
			}
	}
}