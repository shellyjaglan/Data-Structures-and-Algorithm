//in this code we are finding smallest and second smallest number in an array.

class SecondSmallest{
	public static void main(String[] args) {
		SecondSmallest obj = new SecondSmallest();
		int[] arr = {1,1,1,1,1,1,1};
		int size = arr.length;
		obj.find_First_and_Second_Smallest(arr);
	}
	void find_First_and_Second_Smallest(int arr[]){
		int first,second;
		first = second = Integer.MAX_VALUE;
		if(arr.length < 2){
			System.out.println("in valid size of array");		}
		else{
			for(int i=0;i<arr.length;i++){
				if(arr[i] < first){
					second = first;
					first = arr[i];
				}
			}
			if(second == Integer.MAX_VALUE){
				System.out.println("no second smallest and first smallest is: "+first);
			}
			else{
				System.out.println("first smalest is: "+first+" second smallest is: "+second);
			}
		}

	}
}