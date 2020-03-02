class FindPairSumusingHashmap{
	static MAX = 100;
	public static void main(String[] args) {
		FindPairSumusingHashmap obj = new FindPairSumusingHashmap();
		int[] a = {1,2,3,4,5,6,7,8};
		int n = 7;
		obj.printPairUsingHashmap(a,n);
	}
	void printPairUsingHashmap(int arr[],int target){
		boolean[] map = new boolean[MAX];

		for(int i = 0;i < arr.length;i++){
			int temp = target - arr[i];
			if(temp > 0 && map[temp]){
				System.out.println("the pair is :"+temp+" "+arr[i]);
			}
			map[arr[i]] = true;
		}
	}
}