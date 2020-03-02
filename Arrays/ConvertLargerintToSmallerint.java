praimport java.util.Scanner;
import java.util.Arrays;

class ConvertLargerintToSmallerint{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = n;
		int count = 1;
		while(h >= 10){
			h = h / 10;
			count++;
		}
//		System.out.println("count:=" + count);
		int[] arr = new int[count];
		int i ,j,p;
		for(i = 0, j = count-1 ; i < count && j >=0 ; i++ , j--){
			p = (int)Math.pow(10,j);
			arr[i] = n / p;
			n = n % p;
		}
		for(int r = 0;r < count;r++){
			System.out.println(arr[r]);
		}
		System.out.println();
		Arrays.sort(arr);
		for(int r = 0;r < count;r++){
			System.out.println(arr[r]);
		}
		int c,d,e,num = 0;
		System.out.println();
		for(c = 0,d = count-1;c < count && d >=0;c++,d--){
			e = (int)Math.pow(10,d);
			num = num + arr[c]*e;
		}
		System.out.println(num);
	}
}