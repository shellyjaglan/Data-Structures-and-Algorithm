/*
import java.util.Scanner ;
//starting from index 1
class InsertionSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n =in.nextInt();
		int arr[] = new int[n+1];
		System.out.println("enter the elments:");
		for(int i=1;i<=n;i++){
			arr[i]= in.nextInt();
		}
		// for(int a=1;a<=n;a++){
		// 	System.out.println(arr[a]);
		// }

		for(int j=2;j<=n;j++){
			int key = arr[j];
			int i=j-1;
			while((i>0) && arr[i] > key){
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}

		for(int a=1;a<=n;a++){
			System.out.println(arr[a]);
		}
	}
}
*/
//using index 0

import java.util.Scanner ;
class InsertionSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n =in.nextInt();
		if(n<=0){
			System.out.println("enter a positive value");
			return;
		}
		else{
			//dgsg
		}
		int arr[] = new int[n];
		System.out.println("enter the elments:");
		for(int i=0;i<n;i++){
			arr[i]= in.nextInt();
		}
		// for(int a=1;a<=n;a++){
		// 	System.out.println(arr[a]);
		// }

		for(int j=1;j<n;j++){
			int key = arr[j];
			int i=j-1;
			while((i>=0) && arr[i] > key){
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}

		for(int a=0;a<n;a++){
			System.out.println(arr[a]);
		}
	}
}
