class LeftRotatetheArray{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int arr[] = new arr[n];
		for(int i = 0 ; i < n;i++){
			int n = i -d;
			if(n < 0){
				arr[n -d +i] = in.nextInt();
			}
			else{
				arr[i-d] = in.nextInt();
			}
		}
		for(int j = 0; j<n;j++){
			System.out.println(arr[j] +" ");
		}

	}
}