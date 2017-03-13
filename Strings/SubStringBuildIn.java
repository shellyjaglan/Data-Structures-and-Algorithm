/*public String substring(int startIndex): 
This method returns new String object containing the substring of the given string
from specified startIndex (inclusive).

public String substring(int startIndex, int endIndex): 
This method returns new String object containing the substring of the given string 
from specified startIndex to endIndex.

startIndex: inclusive
endIndex: exclusive
*/
import java.util.*;

class SubStringBuildIn{
	public static void main(String[] args) {
		String s = "shelly",sub;
		StringBuffer sb = new StringBuffer();
		sb.append(s,0,2);
		System.out.println(sb);
		//appends char at 0 ,1 to sb...start inclusive end exclusive..
		//sb.append(string,start,end);

		for(int i = 0 ;i < s.length(); i++){
			for(int j = i+1; j <= s.length();j++){
				sub = s.substring(i,j);
				System.out.println(sub);
			}
		}

		String sac ="Sachin Tendulkar";  
   		System.out.println(sac.substring(6));//Tendulkar // will produce a space before t 
   		System.out.println(sac.substring(0,6));//Sachin  
		
		//practice below...
	}
}