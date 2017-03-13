class StrWordRev{

/*	public static void main(String[] args){
		String str = "SHELLY IS THE WORST GIRL";
		System.out.println(str);
		int len = str.length();
		int k = 0;

		for(int i = 0;i < len;i++){
			if(str.charAt(i) == ' '){
				for(int j = i-1;j <= k;j--){
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
				k = i+1;
			}
		else
			continue ;
		}
	}
}*/


	public static void main(String[] args){
		String str = "SHELLY IS THE WORST GIRL";
//		System.out.println(str);
		int len = str.length();
		char [] arr = new char[len];
		for(int i = 0;i < len;i++){
			arr[i] = str.charAt(i); 
		}
//		for(int i = 0;i < len;i++){
//			System.out.print(arr[i]);
//		}
		int k = 0;
		for(int i = 0;i < len;i++){
			if(arr[i] == ' '){
//				System.out.print(arr[i]);
				for(int j = i-1;j >= k;j--){
					System.out.print(arr[j]);
				}
				System.out.print(" ");
				k = i+1;
			}
			else{
//				System.out.println("else");
				continue;
			}
		}
	}
}