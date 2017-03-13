import java.util.Scanner;

class PairSumQuick{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the num of the elements:");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(int i = 0;i < n;i++){
			arr[i] = in.nextInt();
		}
		PairSumQuick obj = new PairSumQuick();
		obj.quicksort(arr, 0, n-1);
		for(int i = 0;i < n;i++){
			System.out.println(arr[i]);
		}
		System.out.println("enter the sum you want as pair:");
		int s = in.nextInt();
		obj.pair(arr, 0, n-1, s);

	}

	public void quicksort(int A[], int low, int high){
		if(low < high){
//			System.out.println("low index is:" + low);
//			System.out.println("high index is:" + high);
			
			int a = partition(A, low, high);
//		System.out.println("Partition returned = " + a);
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
	class Pair{
	public int first;
	public int second;
	Pair(int f, int s){
		this.first = f;
		this.second = s;
	}
}
	//correct method 
	public Arraylist<Pair> pair(int A[], int low, int high, int sum){
		int current = A[low] + A[high];
		Arraylist<Pair> pairsFound = new ArrayList<Pair>();
		while(low < high){
			current = A[low] + A[high];
			if(current > sum)
				high = high - 1;
			else if(current < sum)
				low = low + 1;
			else {
				System.out.println(A[low] + "," +  A[high]);
				// Pair found..
				// Create pair
				pairsFound.add(Pair(A[low], A[high]));
				low++;
				high--;
			}
		}	
		return pairs;
	}

//wrong method
	public void pair(int A[], int low, int high, int sum){
		int current = A[low] + A[high];
		int i,j;
		while(low < high){
			if(current > sum)
				high = high- 1;
			else if(current < sum)
				low = low + 1;
			else
				System.out.println(A[low] + "," +  A[high]);
				
		}	
	}
}
