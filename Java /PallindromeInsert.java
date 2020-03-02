`							`````````````````````````//this func inserts a char in pallindrome.
//if the resultant is a pallindrome then print 
//else print na
//print all the pallindrome found


import java.lang.*;
import java.util.*;

class PallindromeInsert{
	public static void main(String[] args) {
		PallindromeInsert obj = new PallindromeInsert();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(!obj.insert_element(s)){
			System.out.println("NA");
		}
		else
			obj.check_substrings(s);

	}
	boolean check_if_pallindrome(String s){
		int i ,j;
		for(i = 0,j = s.length()-1;i < j;i++,j--){
			if(s.charAt(i) == s.charAt(j)){
				continue;
			}
			else{
				return false;
			}
		}
		return true;
	}

	boolean insert_element(String s){
		if(check_if_pallindrome(s)){
			return false;
		}
		else{
			StringBuffer sb = new StringBuffer(s);
			char add = '\0'; //char to add
			int found_index = 0,i,j;//to add char
			boolean found = false;
			
			for(i = 0,j = sb.length()-1;i < j;i++,j--){
				char idex = sb.charAt(i);
				char jdex = sb.charAt(j);
				if(idex == jdex){
					continue;
				}
				else if(idex != jdex){
					if(sb.charAt(i+1) == sb.charAt(j)){
						add = idex;
						found_index = j+1;
						found = true;
					}
					else if(sb.charAt(i) == sb.charAt(j-1)){
						found = true;
						found_index = i;
						add = jdex;
					}
					else{
						add = idex;
						found_index  = j+1;
						found = true;
					}
				}
				if(found == true){
					sb.insert(found_index,add);
					if(check_if_pallindrome(sb.toString())){
						System.out.println(sb.toString());
						check_substrings(sb.toString());
						return true;
					}
					else
						return false;
				}
				else
					continue;
			}
		}
		return true;
	}

	void check_substrings(String s){
		String str;
		for(int i = 0;i < s.length();i++){
			for(int j =i+1;j <= s.length();j++){
				str = s.substring(i,j);
				if(check_if_pallindrome(str)){
					System.out.println(str);
				}
			}
		}
	}

}