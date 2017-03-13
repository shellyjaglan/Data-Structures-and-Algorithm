import java.util.*;

class Q6{
	public static void main(String[] args) {
		Q6 obj  = new Q6();
		int n = 4;
		int arr[][] ={
			{1,2,3,4},
			{5,6,7,8},
			{9,11,12,13},
			{14,15,16,17}
		};

		int[][] res  =obj.func(arr,n);
		System.out.println(Arrays.deepToString(res));
	}

	int[][] func(int[][] arr,int size){
		int ans[][] = new int[size][size];
		for(int i = 0;i < size;i++){
			for(int j = 0; j < size;j++){
				ans[i][j] = arr[size-j-1][i];
			}
		}
		return ans;
	}
}