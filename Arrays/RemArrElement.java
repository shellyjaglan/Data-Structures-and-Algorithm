import java.util.Scanner;

class RemArrElement{
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("enter the no of array elements:");
			int n = in.nextInt();
			int arr[] = new int[n];
			System.out.println("enter the array elements:");
			for(int i = 0;i < n;i++){
				arr[i] = in.nextInt();
			}
			System.out.println("enter the element you want to delete:");
			int d = in.nextInt();
			int count = 0;
			for(int i = 0;i < n;i++){
				if(arr[i] == d){
					arr[i] = 0;
					count++;
				}
			}
			int a = n -count;
			int arr2[] = new int[a];
			int c,k;
			for(c = 0,k = 0;c < n && k < a;c++){
				if(arr[c] != 0){
					arr2[k] = arr[c];
					k++;
				}
				else
					continue;
			}
			System.out.println("new array is:");
			for(int i = 0;i < a;i++){
				System.out.print(arr2[i]+ ""); 
			}
	}	
}