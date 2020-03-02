class KMPsubstringMatch{
	public static void main(String[] args) {
		KMPsubstringMatch obj = new  KMPsubstringMatch();
		String text = "abxabcabcaby";
		String pattern = "abcaby";

		boolean result = KMP(text.toCharArray(), pattern.toCharArray());
		System.out.println(result);
	}
	int[] createTempArray(char[] pattern){
		int j = 0;
		int [] temp = new int[pattern.length];
		temp[j] = 0;
		for(int i = 1; i< pattern.length;i++){
			if(pattern[j] == pattern[i]){
				temp[i] = j+1;
				j++;
				i++;
			}
			else{
				if(j!= 0){
					j = temp[j-1];
				}
				else{
					temp[i] = 0;
					i++;
				}
			}
		}
		return temp;
	}
	boolean KMP(char[]text ,char[] pattern){
		int[] temp =  createTempArray(pattern);
		int j ,i;
		i = j = 0;

		while(i < text.length && j< pattern.length){
			if(text[i] == pattern[j]){
				j++;
				i++;
			}
			else{
				if(j != 0){
					j = temp[j-1];
				}
				else{
					i++;
				}
			}
		}
		if(j == pattern.length){
			return true;
		}
		
		return false;	
	}
}