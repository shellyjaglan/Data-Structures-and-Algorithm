import java.util.Scanner;

class MaxSubarray(){
	public static void main(String[] args) {
		int start=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elememts:");
		int n = in.nextInt();
		if(n == 0)
			return;
		int array = new int[n];
		System.out.println("enter the elements:");
		for(int i = 0;i < n;i++){
			array[i] = in.nextInt();
		}
		FindMaxSubarray(array,start,n);
	}
}
public static void FindMaxSubarray(int A[],low,high){
	if(high == 1){
		ThreeReturnValues obj = new ThreeReturnValues();
		obj.getFirst()= low;
		obj.getSecond()=high ;
		obj.getThird()= sum;
	}
	else
		mid= ((low+high)/2);
		
}

public class ThreeReturnValues(){
	private int first;
	private int second;
	private int third;
	public ThreeReturnValues(int first,int second,int thrid){
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public getFirst(){
		return first;
	}
	public Object getSecond() {
		return second;
	}
	public Object getThird() {
		return third;
	}
}

public static void MaxCrossSubarray(int A[],low,mid,high){
	int left_sum = 0;
	int max_left;
	int max_right;
	int sum = 0;
	for(int i = 0;i < mid;i++){
		sum = sum + A[i];
		if(sum > left_sum){
			left_sum = sum;
			max_left = i;
		}
		else
			break;
	}
	int right_sum= 0;
	sum = 0;
	for(int j = mid;j < high;j++){
		sum = sum + A[j];
		if(sum > right_sum){
			right_sum = sum;
			max_right = j;
		}
		else
			break;
	}
	return(max_left,max_right,left_sum + right_sum)  // wrong statement ;
}