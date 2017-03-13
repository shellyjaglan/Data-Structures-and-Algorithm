//this algorithm name is rabin karp
//in this we find the hash of the pattern and check all the text with the same length as te pattrn
//we compre the hash of both pattern and the same length text array
// and check if its same or not..
//if same hash..then we compare the char one by one..if same hash and char means match found
//we find hash by gettng oldhash value from previous computaions
//and oldhash - old char which is left in new text of len m..
//means the elemnt which is left has left is been substrated from  old hash..
//then this value new hash /prime number (divide by)
//then new hash = new hash + new char val added * prime to the power (m-1)
//in this way new hash is calculated every time and checked with the pattern hash..
//refer to the code if not understood
//easy algorithm...


class RabinKarpSubstringSearch{
	int prime = 101;
	public static void main(String[] args) {
		RabinKarpSubstringSearch obj = new  RabinKarpSubstringSearch();
		String text = "abedabc";
		String pattern = "abc";

		int result = obj.patternSearch(text.toCharArray(),pattern.toCharArray());

		if(result != -1){
			System.out.println("string found at: "+ result);
		}
		else{
			System.out.println("no match found");
		}
	}
	
	int patternSearch(char[] text, char[] pattern){
		int n = text.length;
		int m = pattern.length;
		long textHash = createHash(text,m-1);
		long patternHash = createHash(pattern,m-1);
		System.out.println("textHash: "+textHash);
		System.out.println("pattern hash: "+patternHash);

		for(int i =0; i < n-m+1; i++){
			if(i > 0 && i < n-m+1){
				System.out.println("in if where i >0: "+i);
				textHash = recalculateHash(text,textHash,i-1,i+m-1,m);
				System.out.println("in if where i >0 :" + i+" textHash is : "+textHash);

			}
			if(patternHash == textHash && checkEqual(text,i,i+m-1,pattern,0,m)){
				System.out.println("in same");
				return i;
			}
		}
		return -1;
	}

	long recalculateHash(char[] text,long oldhash,int oldindex,int newindex,int m){
		System.out.println("string evaluated for recalulation is");
		for(int x= oldindex;x <= newindex;x++){
			System.out.println(text[x]);
		}
		
		System.out.println
		(" oldhash: " +oldhash+" oldindex: "+oldindex+" newindex: "+newindex+" m: "+m);

		long newHash= 0;
		newHash = Math.abs(oldhash - text[oldindex]);
		System.out.println("newHash: "+newHash);
		newHash = newHash/prime;
		System.out.println("newHash: "+newHash);
		newHash +=  text[newindex]*Math.pow(prime,m-1);
		System.out.println("new hash is: "+newHash);
		return newHash;
	}

	long createHash(char[] arr,int end){
		long hash = 0;
		//System.out.println("arr value: "+arr[0]);
		for(int i = 0;i <= end;i++){
			hash += arr[i]*Math.pow(prime,i);
		}
		return hash;
	}

	boolean checkEqual(char[] text,int start1,int end1,char[] pattern,int start2,int end2){
		if((end1 - start1) != (end2 - start2 -1)){
			return false;
		}
		while((start1 <= end1) && (start2 <= end2-1)){
			if(text[start1] != pattern[start2])
				return false;
			start2++;
			start1++;
		}
		return true;
	}

}