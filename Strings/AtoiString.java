import java.util.*;

class AtoiString{
	public static void main(String[] args) {
		AtoiString obj = new AtoiString();
		Scanner in  = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i <t ; i++){
			String s = in.next();
			int ans = obj.atoi(s);
			System.out.println(ans);
		}
	}

	int atoi(String str)
    {
		if(str.length() == 0){
			return -1;
		}
		int sign = 1,i =0,res = 0;
		if(str.charAt(0) == '-'){
			sign = -1;
			i++;
		}
		for(; i<str.length() ; i++){
			if(isnumber(str.charAt(i)) == false){
				return -1;
			}
			res = res*10 + str.charAt(i) - '0';
		}
		return sign*res ;
    }

    boolean isnumber(char x){
    	return (x>= '0' && x<= '9')? true: false;
    }
}
