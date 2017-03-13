import java.util.Scanner;
class QuickSortAlgoCormen{
	/*public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of the elements:");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(int i = 0;i < n;i++){
			arr[i] = in.nextInt();
		}
		QuickSortAlgo2 obj = new QuickSortAlgo2();
		obj.QuickSort2(arr,0,n-1);
		for(int i = 0;i < n;i++){
			System.out.println(arr[i]);
		}
	}*/
	public static void QuickSort2(int A[],int low,int high){
		if(low < high){
			int a = Partition2(A,low,high);
			QuickSort2(A,low,a-1);
		//	System.out.println(A);
			QuickSort2(A,a+1,high);
		}
	}
	public static void Swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	public static int Partition2(int A[],int low,int high){
		int x = A[high];//pivot is x
		int i = low;
		for(int j = low;j < high-1;j++){
			if(A[j] <= x){
				i = i+1;
				Swap(A[i],A[j]);
			}
		}
		Swap(A[i],A[high]);
		return i;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of the elements:");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(int i = 0;i < n;i++){
			arr[i] = in.nextInt();
		}
	//	QuickSortAlgoCormen obj = new QuickSortAlgoCormen();
	//	obj.
		QuickSort2(arr,0,n-1);
		for(int i = 0;i < n;i++){
			System.out.println(arr[i]);
		}
	}

}