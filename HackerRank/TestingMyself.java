class TestingMyself{
	public static void main(String[] args) {
		int a[] = {3,55,6,11,1,7,9,10,15,13,2,5,6,7,25,28,23,12,1,2,5,9,};	
		TestingMyself obj = new TestingMyself();
		float ans1 = obj.median(a);
		System.out.println("my method: "+ans1);
		int ans2;
		int len = a.length;
		obj.quicksort(a,0,len-1);
		if(len % 2 == 0){
			//even 
			int b = len/2;
			ans2 = (a[b] + a[b-1])/2;
		}
		else{
			//odd length
			ans2 = a[len/2];
		}
		System.out.println("quicksort: "+ans2);
	}
	//two method

	public float median(int[] arr){
		int l = arr.length;
		int sum = 0;
		for(int i = 0; i < l;i++){
			sum += arr[i];
		}
		float med =(float) sum/l;
		return med;
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