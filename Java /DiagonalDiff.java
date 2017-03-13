import java.util.Scanner;

class DiagonalDiff{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n <= 0){
			return;
		}
		int[][] arr = new int[n][n];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				arr[i][j] = in.nextInt();
			}
		}
		int asum = 0 ,bsum = 0;
		int a,b;
		for(a = 0,b = 0; a < n && b < n ; a++, b++){
			asum = asum + arr[a][b];
		}	
		int c,d;
		for(c = n-1,d = 0; c >= 0 && d < n ; c--,d++){
			bsum = bsum + arr[c][d];
		}
		int result = Math.abs(asum - bsum);
		System.out.println(result);
	}
}