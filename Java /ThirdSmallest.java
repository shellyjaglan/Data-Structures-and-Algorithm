class ThirdSmallest{
		public static void main(String[] args) {
		ThirdSmallest obj = new ThirdSmallest();
		int[] arr = {10,15,2,20,6,5,1};
		int size = arr.length;
		obj.find_First_Second_third_Smallest(arr);
	}
	void find_First_Second_third_Smallest(int arr[]){
		int first,second,third;
		first = second = third =  Integer.MAX_VALUE;
		if(arr.length < 3){
			System.out.println("in valid size of array");		}
		else{
			for(int i=0;i<arr.length;i++){
				if(arr[i] < first){
					third = second;
					second = first;
					first = arr[i];
				}
				if(arr[i] < second && arr[i] != first){
					third = second;
					second = arr[i];
				}
				else if(arr[i] < third && arr[i] != first && arr[i] != second){
					third = arr[i];
				}
			}
			if(second == Integer.MAX_VALUE && third == Integer.MAX_VALUE){
				System.out.println("no second and third smallest and first smallest is: "+first);
			}
			else if(third == Integer.MAX_VALUE){
				System.out.println("no third smallest and first smallest is: "+first+" second : "+second);

			}
			else{
				System.out.println("first smalest is: "+first+" second smallest is: "+second+" third is: "+third);
			}
		}

	}
}