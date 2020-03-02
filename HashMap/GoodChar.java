import java.util.*;

class GoodChar{
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        System.out.println(countCharacters(words, chars));
	}

    public static int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(Character c: chars.toCharArray()){
            map.put(c, 1 + map.getOrDefault(c, 0));
        }

        int count = 0;

        for(String str: words){
            boolean found =  true;
            Map<Character, Integer> map2 = new HashMap<>();

            for(int i=0 ; i<str.length() ; i++){
                char ch = str.charAt(i);
                
                if(map2.getOrDefault(ch, 0) >= map.getOrDefault(ch, 0)){
                    found = false;
                    break;
                }
                map2.put(ch, 1 + map2.getOrDefault(ch, 0));  
            }
            if(found){
                count += str.length();
            }
        }

        return count;
    }
}