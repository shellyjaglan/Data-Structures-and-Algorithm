import java.util.*;

class LongestCommonPrefix4{
    public static void main(String[] args) {
		LongestCommonPrefix4 obj = new LongestCommonPrefix4();
		ArrayList<String> list = new ArrayList<String>();

		System.out.println(obj.longestCommonPrefix(list));
	}

    String longestCommonPrefix(ArrayList<String> list){
        int len = list.size();
        if(len == 0)
            return "";

        if(len == 1)
            return list.get(0);
        String res = (String)list.get(0);

        for(int i=1 ; i<len ; i++){
            res = comparePrefixTwoStrings(res, (String)list.get(i));
            if(res == "")
                return "";
        }

        return res;
    }

    String comparePrefixTwoStrings(String s1, String s2){        
        StringBuffer sb = new StringBuffer();
        
        if(s1 == "" || s2 == ""){
            return "";
        }
        int i,j;

        for(i=0, j=0 ; i<s1.length() && j<s2.length() ; i++, j++){
            if(s1.charAt(i) == s2.charAt(j)){
                sb.append(s1.charAt(i));
            }else{
                return sb.toString();
            }
        }

        return sb.toString();   
    }
}