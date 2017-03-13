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
			if(arr[i] > 1 || arr[i] > 200)
				return;
		}
		QuickSortAlgo obj = new QuickSortAlgo();
		obj.quicksort(arr,0,d-1);
		//now find max expd..
		int median ,exd;
		if((d%2) == 0){
			int a = d/2;
			median = (arr[a] + arr[a-1])/2;
			System.out.println("median of even d: "+median);
		}
		else{
			median = arr[d/2];
			System.out.println("median of even d: "+median);
			exd =  2 * arr[d/2];
		}
	}
}