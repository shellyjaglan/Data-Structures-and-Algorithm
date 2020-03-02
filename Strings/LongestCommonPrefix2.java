class LongestCommonPrefix2{
	public static void main(String[] args) {
		LongestCommonPrefix2 obj = new LongestCommonPrefix2();
		ArrayList<String> a = new ArrayList<String>();
		a.add("abcd");
		a.add("abczdc");
		a.add("acbdfgf");
		System.out.println(obj.longestCommonPrefixBinarySearch(a));
	}

	String longestCommonPrefixBinarySearch(ArrayList<String> a){
		//this method is using binary search...
		int min = findMini(a);
		for(int i=0 ; i<min ; i++){
			char ch = ((String)a.get(0)).charAt(i);
			int index = i;
			StringBuffer sb = new StringBuffer();
			for(int j=1 ; j<a.size() ; j++){
				if(binarySearch((String)a.get(j),ch,i) == false){

				}
			}
			
		}
	}

	int findMini(ArrayList<String> a){
	    int min = Integer.MAX_VALUE;
	    for(int i=0 ; i<a.size() ; i++){
	        if(((String)a.get(i)).length() < min){
	            min = ((String)a.get(i)).length();
	        }
	    }
	    return min;
	}

	boolean binarySearch(String s,char ch,int index,int low,int high){
		
		while(low < high){
			int mid = (low+high)/2;
			if(s.charAt(mid) == ch && mid == index){
				return true;
			}
			binarySearch(s,ch,index,low,mid+1);
			binarySearch(s,ch,index,mid+1,high);
		}
		return false;
	}
}