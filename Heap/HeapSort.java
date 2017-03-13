class HeapSort{
	public static void main(String[] args) {
		HeapSort obj = new HeapSort();
		int[] arr = {8,10,15,2,4,20,6,25};
		int size  = arr.length;
		//System.out.println("size:" + size);
		obj.sorting(arr,size);
		obj.printArray(arr);
	}
	public void sorting(int arr[],int size){
		int n = Math.ceil(size/2);
		for(int i = n;i < =0;i--){
			heapify(arr,size,n);
		}
		for(int j= size-1;j>=0;j--){2
			int swap = arr[0];
			arr[0] = arr[j];
			arr[j] = swap;
			heapify(arr,j,0);
		}

	}
	public heapify(int arr[],int size,int index){
		int largest = index;
		int left = 2*index;
		int right = 2*index + 1;
		if(left < size && arr[left] > arr[largest]){
			largest = left;
		}
		if(right < size && arr[right] > arr[largest])
			largest = right;
		if(largest != index){
			//swap largest and index;
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;

			heapify(arr,size,largest);
		}
	}
	public void printArray(int arr[]){
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
	}


}