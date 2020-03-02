class KMPsubstringMatch{
	public static void main(String[] args) {
		KMPsubstringMatch obj = new  KMPsubstringMatch();
		// String text = "abxabcabcaby";
		// String pattern = "abcaby";

		String text = "abxyxabcabcab";
		String pattern = "zvnm";

		//boolean result = obj.KMP(text.toCharArray(), pattern.toCharArray());
		//System.out.println(result);

		obj.KMP2(text.toCharArray(), pattern.toCharArray());
	}
	int[] createTempArray(char[] pattern){
		int j = 0;
		int [] temp = new int[pattern.length];
		temp[j] = 0;
		for(int i = 1; i< pattern.length;){
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

	//this method returns the exact index where the string match is found
	void KMP2(char[]text ,char[] pattern){
		int[] temp =  createTempArray(pattern);
		System.out.println("array temp is:");
		for(int x =0;x<temp.length;x++){
			System.out.print(temp[x]+" ");
		}
		int j ,i,count;
		i = j = count = 0;
		while(i < text.length){
			if(text[i] == pattern[j]){
				System.out.println("txt at i and text at j : "+text[i]+" "+ text[j]);
				j++;
				i++;
			}
			if(j == pattern.length){
				count++;
				System.out.println("j is: "+j);
				System.out.println("patttern found at: "+(i-j));
				j = temp[j-1];
				//return true;
			}
			else if(i < text.length && text[i] != pattern[j]){
				if(j != 0){
					j = temp[j-1];
				}
				else{
					i++;
				}
			}
		}
		if(count == 0 && j != pattern.length){
			System.out.println("sting not found");
		}
		//return;
	}

	//this method finds if string match exists or not and just returns true/false
	boolean KMP(char[]text ,char[] pattern){
		int[] temp =  createTempArray(pattern);
		System.out.println("array temp is:");
		for(int x =0;x<temp.length;x++){
			System.out.print(temp[x]+" ");
		}
		int j ,i;
		i = j = 0;
		//this while loop finds match pattern only once in the arrays..
		while(i < text.length && j< pattern.length){
			if(text[i] == pattern[j]){
				System.out.println("txt at i and text at j : "+text[i]+" "+ text[j]);
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
			System.out.println("j is: "+j);
            return true;
        }
		return false;	
	}
}