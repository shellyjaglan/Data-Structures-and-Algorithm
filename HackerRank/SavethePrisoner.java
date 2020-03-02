import java.util.*;

class SavethePrisoner{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt();
			int saved = saveNthPrisner(n,m,s);
			System.out.println(saved);
		}
	}
	static int saveNthPrisner(int n,int m,int s){
		// System.out.println("n: "+n);
		// System.out.println("m: "+m);
		// System.out.println("s: "+s);

		int div = m % n;
		int ans = (div + (s -1)) %n;
		if(ans == 0)
			ans = n;
		return ans;
	}
}