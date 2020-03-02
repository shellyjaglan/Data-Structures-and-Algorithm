import java.util.Scanner;

class Q1{
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String str = in.nextLine();
		// for(int i = 0 ;i < str.length(); i++){
		// 	char char1 = str.charAt(i);
		// 	for(int j = i+1;j < str.length();j++){
		// 		char char2 = str.charAt(j);
		// 		if(char1 != char2){
		// 			continue;
		// 		}
		// 		else{
		// 			System.out.println("string has repeating characters.");
		// 			return;
		// 		}
		// 	}
		// }
		// System.out.println("string does not have repeating characters.");

		System.out.println(isHappy(19));
	}

	static public boolean isHappy(int n) {
        
        while(n != 1){
            int cur = n;
			int sum = 0;

            while(cur > 0){
                int q = cur/10;
                int rem = cur%10;
                
				//System.out.println("here q: "+ q);
                sum = sum + (int)Math.pow(rem,2);
                cur = q;
            }
            n = sum;
        }
        
        return true;
    }
}

