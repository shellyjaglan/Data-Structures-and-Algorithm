import java.util.*;

class Count100{
	public static void main(String[] args) {
		Count100 obj = new Count100();
 		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		for(int i=0 ; i<t ; i++){
			String s = in.next();
			System.out.println(obj.countMax100(s));
		}
	}
	int countMax100(String s){
		int max = 0;
		int one = 0;
		int zero = 0;
		int count = 0;

		for(int i=0 ; i<s.length() ; i++){
			char ch = s.charAt(i);
			if(ch == '1' && one >= 1){
				if(zero  >= 1){
					one= 1;
					zero = 0;
				}
				else{
					if(count >= 1){
						one = 1;
						count = 0;
					}
					else{
						one++;
					}
				}
				zero = 0;
				count = 0;
			}
			else if(ch =='1'){
				one = 1;
				zero = 0;
				count = 0;
			}
			else if(ch == '0'){
				zero ++;
				if(zero == 2 && one >=1 ){
					count++;
					max = maximum(max,count);
					zero = 0;
					one--;
				}
			}
		}

		if(max == 0)
			return 0;
		else{
			return max*3;
		}
	}
	int maximum(int a,int b){
		return (a>b)?a:b;
	}
}