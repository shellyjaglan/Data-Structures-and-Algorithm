class DivisiblePairsSum{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 2 && n > 100)
            return;
        int k = in.nextInt();
        if(k < 1 && k > 100)
            return;
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n;i++){
            for(int j = i+1 ; j < n;j++){
                if((a[i] + a[j]) % k == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
	}
}