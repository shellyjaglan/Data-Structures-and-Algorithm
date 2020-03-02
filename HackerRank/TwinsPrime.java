
import java.util.*;

class TwinsPrime{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int ans = findTwins(n,m);
	}
	static int findTwins(int n,int m){
		boolean prime[] = new boolean[m+1];
		for(int i=0 ; i<=m ; i++){
			prime[i] = true;
		}

		for(int factor=2; factor*factor <= m ; factor++){
			if(prime[factor] == true){
				for(int k=factor ; factor*k<= m ; k++){
					prime[factor*k] = false;
				}
			}
		}
		int count=0;
		int start = -1,end = -1;

		for(int i=2 ; i<=m ; i++){
			if(i == n){
				start = i;
			}
			else{
				if(start != -1 && i>start){
					start = i;
				}
				else if(start == -1){
					start = i;
				}
			}
			if(i == m){
				end = i;
			}
			else{
				if(end != -1 && i<end){
					end = i;
				}
				else if(end == -1){
					end = i;
				}
			}
		}

		System.out.println("start is: "+ start);
		System.out.println("end is: "+ end);
		// for(int i=start ; i<=end ; i++){

		// }
		return 0;
	}
}