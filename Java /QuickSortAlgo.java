import java.util.Scanner;

class QuickSortAlgo{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the num of the elements:");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(int i = 0;i < n;i++){
			arr[i] = in.nextInt();
		}
		QuickSortAlgo obj = new QuickSortAlgo();
		obj.quicksort(arr, 0, n-1);
		for(int i = 0;i < n;i++){
			System.out.println(arr[i]);
		}
	}

	public void quicksort(int A[], int low, int high){
		if(low < high){
//			System.out.println("low index is:" + low);
//			System.out.println("high index is:" + high);
			
			int a = partition(A, low, high);
//			System.out.println("Partition returned = " + a);
//			for(int i=low;i<=high;i++){
//				System.out.print(A[i]+" ");
//			} System.out.println(" ");
			
			quicksort(A, low, a-1);
			quicksort(A, a+1, high);
		}
	}

	public int partition(int A[], int low, int high){
		int pivot = A[high];
		// 1 2 3 4 5 6
		// * * * * * i/j
		// 1 1 2 6 6 7 8 2
		// * * i * * * * P
		int i = low;
		int j = high - 1;
		while(i < j){
			if(A[i] <= pivot){
				i++;
			} else{
				// Swap A[i] with A[j]
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				j--;
			}
		}
		int p = low;
		while(A[p] <= pivot && p<high)
			p++;
		A[high] = A[p];
		A[p] = pivot;
		return p;
	}
	
}