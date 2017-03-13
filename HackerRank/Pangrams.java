import java.util.*;

class Pangrams{
	    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Pangrams obj = new Pangrams();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(obj.ispangram(s)){
            System.out.println("pangram");
        }
        else{
             System.out.println("not pangram");
        }   
    }
    boolean ispangram(String s){
        HashSet set = new HashSet();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= 'A'&& ch <= 'Z'){
                if(!set.contains(ch) && !set.contains((char)(ch+32))){
                    set.add(ch);
                }
            }
            else if(ch >= 'a' && ch <= 'z'){
                if(!set.contains(ch) && !set.contains((char)(ch-32))){
                    set.add(ch);
                }
            }
        }

        int size = set.size();
        if(size >= 26){
        	///System.out.println("yes pangram");
        	System.out.println(set);
            return true;
        }
        else{
        //	System.out.println("yes pangram");
        	System.out.println(set);
            return false;
        }
    }
}