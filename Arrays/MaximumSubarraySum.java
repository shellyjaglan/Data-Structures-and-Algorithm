import java.util.*;

class MaximumSubarraySum{
	public static void main(String[] args) {
		MaximumSubarraySum obj = new MaximumSubarraySum();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i =0;i < n;i++){
			arr[i] = in.nextInt();
		}
	//	int max = obj.calMaxSubarraySum(arr,0,n-1);
	//	int max = obj.calMaxSubarraySum_Kadane(arr);
		int max  = obj.calMaxSubarraySum_DP(arr);
		System.out.println("max is: "+max);
	}

	int calMaxSubarraySum(int[] a,int start,int end){
		if(start == end){
			return a[start];
		}
		System.out.println("start: "+start);
		System.out.println("end: "+end);

		int mid = (start+end)/2;

		System.out.println("mid: "+ mid);

		int left = calMaxSubarraySum(a,start,mid);
		int right = calMaxSubarraySum(a,mid+1,end);
		int cross = calCrossarraySum(a,start,mid,end);

		return max(left,right,cross);
	}

	int calCrossarraySum(int[] a,int start,int mid,int end){
		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for(int i = mid;i >= start;i--){
			sum = sum +a[i];
			if(sum > left_sum){
				left_sum = sum;
			}
		}
		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for(int j = mid+1 ;j <= end;j++){
			sum = sum +a[j];
			if(sum > right_sum){
				right_sum = sum;
			}
		}
		System.out.println("sum combined is: "+ left_sum+right_sum);
		return left_sum + right_sum;
	}
	int max(int a,int b,int c){
		return max(max(a,b),c);
	}
	int max(int a,int b){
		return (a>b) ? a : b;
	}

//kandane method works in O(n)..does not work for all negative numbers;
	int calMaxSubarraySum_Kadane(int[] a){
		int max_sofar = 0;
		int max_ending = 0;
		for(int i = 0;i < a.length;i++){
			max_ending = max_ending + a[i];
			if(max_ending < 0)
				max_ending = 0;
			if(max_sofar < max_ending)
				max_sofar = max_ending;
		}
		return max_sofar;
	}

	int calMaxSubarraySum_DP(int[] a){
		int currsum = a[0];
		System.out.println("currsum 1: "+currsum);
		int maxSum = a[0];
		System.out.println("maxSum 1: "+maxSum);
		for(int i=1; i < a.length;i++){
			currsum = max(a[i] , currsum +a[i]);
			System.out.println("currsum: "+currsum);
			maxSum = max(currsum , maxSum);
			System.out.println("maxSum: "+maxSum);
			System.out.println();
		}
		return maxSum;
	}

	public int maxSubArray(final List<Integer> a) {
	   int currsum = (int) list.get(0);
	   int maxSum = (int) list.get(0);

	   Iterator itr = a.iterator();
	   while(itr.hasNext()){
		   	int h = (int) itr.next();
		   	System.out.println("h is: "+h);
		   	currsum = max(h , currsum + h);
			//System.out.println("currsum: "+currsum);
			maxSum = max(currsum , maxSum);
	   }
	   return maxSum;
	}

}