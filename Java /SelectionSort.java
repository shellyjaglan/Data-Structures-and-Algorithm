import java.util.Scanner ;
class SelectionSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no of the elements:");
		int n = in.nextInt();
		if(n<=0){
			System.out.println("enter valid no of elements");
		}
		int arr[] = new int[n];
		for(int i= 0; i<n;i++){
			arr[i] = in.nextInt();
		}

		for(int i=0;i<n;i++){
			int min = arr[i];
			int min_index = i;
			for(int j=i+1;j<n;j++){
				if(arr[j] < min){
					min = arr[j];
					min_index = j;
				}
			}
			int temp = arr[min_index]; 
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		for(int a = 0;a<n;a++){
			System.out.println(arr[a]);
		}
	}
}







