import java.util.*;

class LongestCommonPrefix{
	public static void main(String[] args) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		ArrayList<String> a = new ArrayList<String>();
		a.add("abcd");
		a.add("abczdc");
		a.add("acbdfgf");
		System.out.println(obj.longestCommonPrefix(a));
	}
	public String longestCommonPrefix(ArrayList<String> a) {
	    int len =  a.size();
	    int min = findMini(a);
	    StringBuffer sb = new StringBuffer();
	    
	    for(int i=0 ; i<min ; i++){
	        char ch = ((String)a.get(0)).charAt(i);
	        for(int j=1 ; j<a.size() ; j++){
	            char cj = ((String)a.get(j)).charAt(i);
	            if(ch != cj){
	                return sb.toString();
	            }
	        }
	        sb.append(ch);
	    }  
	    return sb.toString();
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
}