import java.util.*;

class Q4{
	public static void main(String[] args) {
		// String shelly = "shelly";
		// System.out.println("string is: "+shelly);
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = in.nextLine();

		char str[] = new char[100];
		s.getChars(0,s.length(),str,0);
	
		Q4 obj = new Q4();
		String ans = obj.func(str,s.length());
		System.out.println("ans is :"+ ans);
	}

	String func(char s[],int len){
		int space = 0;
		for(int i = 0;i < len; i++){
			if(s[i] == ' '){
				space ++;
			}
		}
		System.out.print("val of space is: "+ space);
		int total_len = len + (space*2);
		//s = new char[total_len];
		System.out.print("total_len : "+ total_len);
		s[total_len] = '\0';

		//int l = s.length;
		// System.out.println("len new is: "+l);
		
		// int i,j;
		// for(i = len-1,j = total_len-1;i >= 0 && j>= 0;i--,j--){
		// 	if(s[i] == ' '){
		// 		s[j] ='0';
		// 		s[j-1] = '2';
		// 		s[j-2] = '%';
		// 		j = j-2;
		// 	}
		// 	else{
		// 		s[j] = s[i];
		// 	}
		// }

		for(int i = len-1;i >=0;i--){
			if(s[i]==' '){
				s[total_len-1] = '0';
				s[total_len-2] = '2';
				s[total_len-3] = '%';
				total_len = total_len-3;

			}
			else{
				s[total_len-1] = s[i];
				total_len = total_len-1;
			}
		}
		return new String(s);
	}

}
