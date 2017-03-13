import java.util.*;

class NBinaryTrees{
	public static void main(String[] args) {
		NBinaryTrees obj = new NBinaryTrees();
		//int sum = 0; //pass sum
		int nodes = 1000;
		// int res = obj.find_nBinarytrees_recursion(nodes);
		// System.out.println("sum is: "+res);

		// int res1 = obj.findNBinarytreesRecursionMemorization(nodes);
		// System.out.println("sum is: "+res1);
		//long[] arr = new long[nodes+1];
		final long startTime = System.currentTimeMillis();
		long res2 = obj.findNBinarytreesDP(nodes);
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		System.out.println("sum is: "+res2);
	}
	int find_nBinarytrees_recursion(int n){
		int sum = 0;
		if(n == 0)
			return 1;
		
		for(int i=0 ; i<n ; i++){
			//System.out.println("n is: "+ n);
			sum += find_nBinarytrees_recursion(i) * find_nBinarytrees_recursion(n-i-1);
		}
		
		return sum;
	}
	int findNBinarytreesRecursionMemorization(int n){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		if(hm.containsKey(n)){
			return (int) hm.get(n);
		}
		int sum = 0;
		if(n == 0)
			return 1;
		
		for(int i=0 ; i<n ; i++){
			//System.out.println("n is: "+ n);
			sum += find_nBinarytrees_recursion(i) * find_nBinarytrees_recursion(n-i-1);
		}
		hm.put(n, sum);
		return sum;
	}
	/*
	int functionWithMemoization(int params....) {
		HashMap hm = new Hashmap;
		if (hm.contains(getKey(params...)))
			return hm.get(getKey(params...));

		// Calculation part
		Answer = Calculate answer for this function....

		hm.store(getKey(params), answer);
		return Answer
	}
	*/
	long findNBinarytreesDP(int n){
		final long startTime = System.currentTimeMillis();
		long[] arr = new long[n+1];
		arr[0] = 1;
		for(int i=1 ; i<n+1 ; i++){
			arr[i] = 0;
			for(int j=0 ; j<i ;j++){
				arr[i] += arr[j]*arr[i-j-1];
				if(arr[i] < 0){
					System.out.println("arr[i]: "+arr[i] + " "+i);
				}
			}	
		}
		return arr[n];
	}

}