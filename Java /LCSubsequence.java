class LCSubsequence{
	static String sh = "";
	public static void main(String[] args) {
		LCSubsequence obj = new LCSubsequence();
		// String a = "abcdgh";
		// String b = "aedfhg";

		String a = "abcdddd";
		String b = "azzccdddd";
		int ans = obj.findLongestSubsequence(a,b,a.length(),b.length());
		System.out.println(ans + "string is: "+sh);
	}
	int findLongestSubsequence(String a,String b,int la,int lb){
		if(la == 0 || lb == 0){
			return 0;
		}
		if(a.charAt(la-1) == b.charAt(lb-1)){
			sh = a.charAt(la-1) + sh;	
			return 1 + findLongestSubsequence(a,b,la-1,lb-1);
		}
		else{
			return max(findLongestSubsequence(a,b,la,lb-1),
				findLongestSubsequence(a,b,la-1,lb));
		}
	}
	
	int max(int a,int b){
		return (a>b)?a:b;
	}
}