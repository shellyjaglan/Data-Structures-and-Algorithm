import java.math.*;
import java.util.Scanner;

class Points{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if(n > 20 && n < 1)
//			return;
		int[] arr = new int[5]; 
		for(int i = 0;i < 5;i++){
			arr[i] = in.nextInt();
			if((arr[i] > 20) && (arr[i] < 1))
				return;
		}
		int result = 0;
		int val , num ;
		for(int i = 0,j = 1; i < 5 && j <= 5; i++,j++){
			val = ((arr[i] - j) * 10);
			num = 100 - val;
			if(num < 0){
				num = 0;
			}
			result = result + num;
		}

		System.out.println(result);
	}
}