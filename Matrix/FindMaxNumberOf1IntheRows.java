//Find the row with maximum number of 1s
//Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
class Arguments{
	int row_number;
	int max;
	Arguments(int var1,int var2){
		row_number = var1;
		max = var2;
	}
}
class FindMaxNumberOf1IntheRows{
	Arguments head = new Arguments(0,-1);

	public static void main(String[] args) {
		FindMaxNumberOf1IntheRows obj = new FindMaxNumberOf1IntheRows();
		int[][] arr= {{0,1,0,1},{1,1,1,1},{0,1,0,1},{0,0,1,1}};
		Arguments answer = obj.findMaximum1s(arr);
		System.out.println(answer.row_number +"  "+ answer.max);
	}
	Arguments findMaximum1s(int[][] arr){
		// int row_number = -1;
		// int max = -1;
		for(int i=0 ; i<arr.length ; i++){
			int index = binarySearch(arr[i],0,arr[i].length-1);
			if(index != -1 && (arr[i].length)-index > head.max){
				head.max = (arr[i].length)-index;
				System.out.println("max is: "+head.max);
				head.row_number = i;
				System.out.println("row no is: "+head.row_number);
			}
		}
		return head;
	}
	int binarySearch(int[] a,int low,int high){
		if(low<=high){
			int mid = (low + high) / 2;
			if((mid == 0 || a[mid-1] == 0) && a[mid] == 1){
				return mid;
			}
			else if(a[mid] == 0){
				return binarySearch(a,mid+1,high);
			}
			else{
				return binarySearch(a,low,mid-1);
			}
		}
		return -1;
	}
}