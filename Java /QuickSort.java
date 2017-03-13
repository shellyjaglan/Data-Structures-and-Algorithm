class QuickSortAlgo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the num of the elements:");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the num of the elements:");
		for(int i = 0;i<n;i++){
			arr[i] = in.nextInt();
		}
		int low = 0;
		int high = n;
		QuickSort obj = new QuickSort();
		obj.quickSort(0,n);
		for(int i = 0;i < n;i++){
			System.out.print(arr[i]);
		}
	}

	public void quickSort(low,high){
		if(low < high){
			int a = Partition(A,low,high);
			quickSort(low,j-1);
			quickSort(j+1,high);
		}
	}

	public void Partition(int A[],low,high){
		pivot = arr[high];
		int i = low;
		int j = high-1;
		while(i<=j){
			while(A[i] <= pivot){
				i++;
			}
			while(A[j] >= pivot){
				j--;
			}
			if(i <= j){
				int temp ;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		A[high] = A[i];
		A[i] = pivot;
		return i;
	}
}