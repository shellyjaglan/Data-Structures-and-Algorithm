class InsertionSortTest{
	public static void main(String[] args) {
	 	int[] arr ={15,25,2,8,40,16,1,6};
	 	int size = arr.length;
	 	InsertionSortTest obj = new InsertionSortTest();
	 	obj.insertionSort(arr,size);
	 	for(int i=0;i<size;i++){
	 		System.out.print(arr[i]+" ");
	 	}
	}

	/* Function to sort an array using insertion sort*/
	void insertionSort(int A[], int size)
	{
	   int i, key, j;
	   for (i = 1; i < size; i++)
	   {
	       key = A[i];
	       j = i-1;
	 
	       /* Move elements of A[0..i-1], that are greater than key, to one 
	          position ahead of their current position.
	          This loop will run at most k times */
	       while (j >= 0 && A[j] > key)
	       {
	           A[j+1] = A[j];
	           j = j-1;
	       }
	       A[j+1] = key;
	   }
	}
}