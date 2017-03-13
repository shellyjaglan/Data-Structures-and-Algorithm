import java.util.Scanner;

class AngryProfessor{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// i , j , m are itrators
		int t = in.nextInt();
		if(t > 10 && t < 1)
			return;
		for(int i = 0;i < t;i++){
			int count = 0;
			int n = in.nextInt();
			if(n > 1000 && n < 1)
				return;
			int k = in.nextInt();
			if(k > n && k < 1)
				return;
			int[] arr = new int[n];
			for(int j = 0;j < n;j++){
				arr[j] = in.nextInt();
				if(arr[j] > 100 && arr[j] < -100)
					return;
			}
			for(int m = 0;m < n;m++){
				if(arr[m] <= 0){
					count++;
					if(count == k){
						System.out.println("NO");
						break;
					}
					else
						continue;
				}
			}
			if(count < k)
				System.out.println("YES");

		}
	}
}