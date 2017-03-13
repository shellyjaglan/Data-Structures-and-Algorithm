//given an sorted array and a target value, this code outputs if there exits and 2 number whose sum
//is equal to target value.
// time complxty is O(n)
class FindPairSum{
	public static void main(String[] args) {
		FindPairSum obj = new FindPairSum();
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int len = arr.length;
		//System.out.println("legnth: "+len);
		int t = 9;
		boolean ans = obj.sumPair(arr,t,0,len-1);
		
		if(ans == true){
			System.out.println("pair found ");
		}
		else
			System.out.println("pair not found");

	}
	// boolean sumPair(int a[],int target,int i,int j){
	// 	int s = a[i];
	// 	int e = a[j];
	// 	int p = s + e;
	// 	boolean found = false;
	// 	if(i < j){
	// 		if(p > target){
	// 		System.out.println(" p > taregt");
	// 		j--;
	// 		sumPair(a,target,i,j);
	// 		}	
	// 		else if(p < target){
	// 			System.out.println(" p < taregt");
	// 			i++;
	// 			sumPair(a,target,i,j);
	// 		}
	// 		else if(p == target){
	// 			System.out.println(" p = taregt");
	// 			 found = true;
	// 		}
	// 		else{
	// 			 found = false;
	// 		}	
	// 	}
	// 	return found;
	// }

	boolean sumPair(int a[],int target,int i,int j){
		boolean found = false;
		while(i < j){
			int start = a[i];
			int end = a[j];
			//boolean found = false;
			int sum = start + end;
			if(sum == target){
				found = true;
				break;
		//		return true;
			}
			else if(sum < target){
				i++;
			}
			else{
				j--;
			}
		}
		return found;
	}
}