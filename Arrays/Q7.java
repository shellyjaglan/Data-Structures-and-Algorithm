import java.util.Arrays;

class Q7{
	public static void main(String[] args) {
		Q7 obj = new Q7();
		int n = 4;
		int mat[][] = {
			{1,1,1,1},
			{1,0,0,1},
			{1,1,1,1},
			{0,1,1,1}
		};
		int[][] res  = obj.func(mat,n);
		System.out.println(Arrays.deepToString(res));
	}
	int[][] func(int[][] mat,int size){
		boolean[] row = new boolean[size];
		boolean[] column = new boolean[size];

		for(int i = 0;i< size;i++){
			for(int j = 0; j < size;j++){
				if(mat[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for(int i = 0;i< size;i++){
			for(int j = 0; j < size;j++){
				if(row[i] || column[j]){ //(row[i] == true || columm[j] == true)
					mat[i][j] =0;
				}
			}
		}
		return mat;
	}
}