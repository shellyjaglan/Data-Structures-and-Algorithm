/*
import java.util.*;
//import java.QuickSortAlgo;

class FraudulentActivityNotifications{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1 || n > (2* Math.pow(10,5)))
			return;
		int d = in.nextInt();
		if(d < 1 || d > n)
			return;
		int arr[] = new int[n];
		for(int i= 0; i < n;i++){
			arr[i] = in.nextInt();
			if(arr[i] < 1 || arr[i] > 200){
				return;
			}
		}

		FraudulentActivityNotifications obj = new FraudulentActivityNotifications();
		obj.quicksort(arr,0,d-1);
		//System.out.println("msasasas: ");
		//now find max expd..
		for(int k = 0; k < n;k++){
			System.out.print(" "+arr[k]);
		}

		int median ,exd;
		if((d%2) == 0){
			int a = d/2;
			//median = ((arr[a] + arr[a-1])/2);
			//System.out.println(" median of even d: "+median);
			exd = ((arr[a] + arr[a-1])/2)* 2;
		}
		else{
			//median = arr[d/2];
			//System.out.println(" median of odd d: "+median);
			exd =  2 * arr[d/2];
		}

	//	System.out.println("exd is: "+exd);
		if(d+1 == n){
			if(arr[n-1] >= exd){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
		}
		obj.quicksort(arr,d,n-1);

		int ans = obj.noti(arr,exd,d,n-1);
		//System.out.println(" ans is: "+ans);
	}

	public int noti(int[] arr,int exd,int start,int end){
		int middle = (start +end )/2;
		int pre = Integer.MAX_VALUE;
		int index = -1;
		int result = 0;
		while(start <= end){
			if(arr[middle] == exd){
				index = middle;
				break;
			}
			else if(arr[middle] > exd){
				//System.out.println("in mid > exp: "+arr[middle]);
				if(arr[middle] < pre && arr[middle] > exd){
					pre = arr[middle];
					//System.out.println("pre is: "+pre);
					index = middle;
				}
				end = middle-1; 
			}
			else{
				start = middle +1;
			}
			middle = (start +end)/2;
		}
		if(index != -1){
			// System.out.println("index is : "+index);
			// System.out.println("end is: "+end);
			result = (arr.length - index);
		//	System.out.println("result is: "+result);
			return result;
		}
		return result;
	}

	
}

*/

/*
import java.util.*;

class FraudulentActivityNotifications{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1 || n > (2* Math.pow(10,5)))
			return;
		int d = in.nextInt();
		if(d < 1 || d > n)
			return;
		int arr[] = new int[n];
		int sum = 0 ,noti = 0;
		float med;
		for(int i = 0; i < n;i++){
			arr[i] = in.nextInt();
			if(arr[i] < 0 || arr[i] > 200)
				return;
			if(i < d){
				sum += arr[i];
				System.out.println("sum is: "+sum);
				continue;
			}
			else if(i == d){
				med = (float) sum/d;
				System.out.println("med is: "+med);
				if(arr[i] >= (2*med)){
					System.out.println("in if arr[i]: is "+arr[i]);
					noti++;
				}
				sum += arr[i];
			}
			else if(i > d){
				sum = sum - arr[i-d-1];
				med = (float) sum/d;
				if(arr[i] >= med*2){
					noti++;
				}
				sum += arr[i];
			}
		}

		System.out.println("noti val is: "+noti);
	}

}
*/
/*
import java.util.*;
class FraudulentActivityNotifications{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1 || n > (2* Math.pow(10,5)))
			return;
		int d = in.nextInt();
		if(d < 1 || d > n)
			return;
		int arr[] = new int[n];
		int sum = 0 ,noti = 0;
		float med;
		FraudulentActivityNotifications obj = new FraudulentActivityNotifications();
		for(int i = 0; i < n;i++){
			arr[i] = in.nextInt();
			if(arr[i] < 0 || arr[i] > 200)
				return;
			if(i < d){
				continue;
			}

			else{
				int start = i-d;
				int end = i-1;
				obj.quicksort(arr,start,end,start,end);
				if(d % 2 == 0){
					int x = (start + end)/2;
					System.out.println("arr x is: "+ arr[x] + "arr x-1 is: "+arr[x-1]);
					med = (float) (arr[x] + arr[x+1])/2;
					System.out.println("med: "+ med);
					if(arr[i] >= med*2){
						noti++;
					}
				}
				else{
					int x = (start + end )/2;
					med = (float) arr[x];

					if(arr[i] >= med*2){
						noti++;
					}
				}
			}
		}
		System.out.println("noti val is: "+noti);
	}

	public void quicksort(int A[], int low, int high,int start,int end){
		if(low < high){
//			System.out.println("low index is:" + low);
//			System.out.println("high index is:" + high);
			
			int a = partition(A, low, high);
			int m = (start + end)/2;

			if(a == m){
				return A[a];
			}
//			System.out.println("Partition returned = " + a);
//			for(int i=low;i<=high;i++){
//				System.out.print(A[i]+" ");
//			} System.out.println(" ");
			else if(a > m){
				int y = quicksort(A, low, a-1,int start,int end);
			}
			else{
				int z = quicksort(A, a+1, high,int start,int end);
			}
			
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
*/

import java.util.*;
class FraudulentActivityNotifications{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1 || n > (2* Math.pow(10,5)))
			return;
		int d = in.nextInt();
		if(d < 1 || d > n)
			return;
		int arr[] = new int[n];
		int sum = 0 ,noti = 0;
		float med;
		FraudulentActivityNotifications obj = new FraudulentActivityNotifications();
		for(int i = 0; i < n;i++){
			arr[i] = in.nextInt();
			if(arr[i] < 0 || arr[i] > 200)
				return;
			if(i < d){
				continue;
			}

			else{
				int start = i-d;
				int end = i-1;
				//obj.quicksort(arr,start,end,);
				if(d % 2 == 0){
					/*
					int x = (start + end)/2;
					System.out.println("arr x is: "+ arr[x] + "arr x-1 is: "+arr[x-1]);
					med = (float) (arr[x] + arr[x+1])/2;
					System.out.println("med: "+ med);
					if(arr[i] >= med*2){
						noti++;
					}
					*/
					int index1 = (start +end)/2;
					int index2 = index1+1;
					//int val = obj.quicksort(arr,start,end,index1) ;
					int val = obj.selectKth(arr,start,end,index1);
				//	System.out.println("val is:" + val);

					//int val2 = obj.quicksort(arr,start,end,index2);
					int val2 = obj.selectKth(arr,start,end,index2);
				//	System.out.println("val2 is:" + val2);
					med = val+val2/2;
					if(arr[i] >= med*2){
						noti++;
					}
				}
				else{
					/*
					int x = (start + end )/2;
					med = (float) arr[x];

					if(arr[i] >= med*2){
						noti++;
					}
					*/
					int index = (start +end)/2;
				//	System.out.println("start is: " + start);
				//	System.out.println("end is: " + end);
					//int val = obj.quicksort(arr,start,end,index);
					int val = obj.selectKth(arr,start,end,index);
				//	System.out.println("val odd is: " + val);
					if(arr[i] >= val*2){
						noti++;
					}
				}
			}
		}
		System.out.println("noti val is: "+noti);
	}


	public int selectKth(int[] arr,int start,int end, int k) {
		System.out.println("k is: " + k);
		 if (arr == null || arr.length <= k)
		  throw new Error();
		 
		 int from = start, to = end;
		 
		 // if from == to we reached the kth element
		 while (from < to) {
		  int r = from, w = to;
		  int mid = arr[(r + w) / 2];
		  System.out.println("mid is: " + mid);
		 
		  // stop if the reader and writer meets
		  while (r < w) {
		 
		   if (arr[r] >= mid) { // put the large values at the end
		    int tmp = arr[w];
		    arr[w] = arr[r];
		    arr[r] = tmp;
		    w--;
		   } else { // the value is smaller than the pivot, skip
		    r++;
		   }
		  }
		 
		  // if we stepped up (r++) we need to step one down
		  if (arr[r] > mid)
		   r--;
		 
		  // the r pointer is on the end of the first k elements
		  if (k <= r) {
		   to = r;
		  } else {
		   from = r + 1;
		  }
		 }
		 
		 return arr[k];
	}



	// public int quicksort(int A[], int low, int high,int index){
	// 	if(low < high){
	// 		int a = partition(A, low, high);
	// 		if(a == index){
	// 			return A[a];
	// 		}
	// 		else if(a > index){
	// 			//int y = quicksort(A, low, a-1,index);
	// 			high = a-1;
	// 		}
	// 		else{
	// 			//int z = quicksort(A, a+1, high,index);
	// 			low = a+1;
	// 		}
	// 	}

	// 	return index;
	// }

	// public int partition(int A[],int low,int high){
	// 	int pivot = A[high];
	// 	// 1 2 3 4 5 6
	// 	// * * * * * i/j
	// 	// 1 1 2 6 6 7 8 2
	// 	// * * i * * * * P
	// 	int i = low;
	// 	int j = high - 1;
	// 	while(i < j){
	// 		if(A[i] <= pivot){
	// 			i++;
	// 		} else{
	// 			// Swap A[i] with A[j]
	// 			int temp = A[i];
	// 			A[i] = A[j];
	// 			A[j] = temp;
	// 			j--;
	// 		}
	// 	}
	// 	int p = low;
	// 	while(A[p] <= pivot && p<high)
	// 		p++;
	// 	A[high] = A[p];
	// 	A[p] = pivot;
	// 	return p;
	// }
}


