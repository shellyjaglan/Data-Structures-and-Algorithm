import java.util.*;

class PowerOfTwo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PowerOfTwo obj  = new PowerOfTwo();

		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			//int a = in.nextInt();
			String a = in.next();
			System.out.println(obj.isItAPower2(a));
		}
	}
	// static boolean isItAPower(int a){
	// 	if((a & (a-1)) == 0){
	// 		return true;
	// 	}
	// 	else{
	// 		//System.out.println(a & (a-1));
	// 		return false;
	// 	}
	// }

	int isItAPower2(String a){
		//StringBuffer sb = new StringBuffer();
		String arr[] = new String[1000];
		//fill the array..
		arrFill(arr,2);
		
		for(int i=0 ; i<arr.length ; i++){
			if((arr[i].equals(a)) == true){
				return 1;
			}
		}
		return 0;
	}

	void arrFill(String[] arr,int n){
		arr[0] = "1";
		arr[1] = "2";
		System.out.println("arr[" + 0 + "]is :"+ arr[0]);
		System.out.println("arr[" + 1 + "]is :"+ arr[1]);

		for(int i=2 ; i<arr.length ; i++){
			//convert each power to string...
			String temp = convertToString(arr[i-1],2);
			arr[i] = temp;
			System.out.println("arr[" + i + "] is :"+ arr[i]);
		}
	}

	String convertToString(String s,int n){
		StringBuffer sb = new StringBuffer();
		int len = s.length();
		int carry = 0; 
		for(int i=len-1 ; i>=0 ; i--){
			int tmp = s.charAt(i) - '0';
			int mul = tmp*2 + carry;
			if(mul >= 10){
				int q = mul/10;
				int r = mul%10;
				sb.insert(0,r);
				carry = q;
			}
			else{
				sb.insert(0,mul);
				carry = 0;
			}
		}
		if(carry != 0){
			sb.insert(0,carry);
		}
		return sb.toString();
	}
}