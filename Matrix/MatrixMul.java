import java.util.Scanner;
class MatrixMul{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("enter the number of the square matrix:");
		int n = in.nextInt();
		int[][] A = new int[n][n];
		int[][] B = new int[n][n];
		int[][] C = new int[n][n];
		System.out.println("enter the elements of the first matrix row wise:");
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				A[i][j] = in.nextInt();
			}
		}
		System.out.println("enter the elements of the second matrix row wise:");
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				B[i][j] = in.nextInt();
			}
		}
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				for(int k = 0;k < n;k++){
					C[i][j] = C[i][j] + A[i][k]*B[k][j];
				}
			}
		}

		System.out.println("the multiplication of thse two matrix will give:");
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				System.out.print(C[i][j] + " "); 
			}
			System.out.println();
		}
	}
}