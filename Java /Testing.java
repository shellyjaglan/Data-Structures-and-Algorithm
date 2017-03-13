import java.util.HashMap;

import java.util.Map;


class Testing{
	public static void main(String[] args) {
		char a = '\0';
		System.out.println("val : "+1%2);
		//char a = '';
		int shell = 5/2;
		System.out.println("shell is: "+shell);
		a = 'b';
		if(a != '\0'){
			System.out.println("ok");
		}
		char c = 'A';
		System.out.println();
		System.out.println((char) (c+32));

		// Multimap<Integer,Integer> map = HashMuiltimap.create();
		// map.put(1,2);
		// map.put(1,6);
		// map.put(2,3);
		// System.out.println(map.get(1));
		 System.out.println("ceil of 7: "+Math.ceil((double)7/2));
  //       System.out.println("floor  of 7: "+Math.floor(7/2));
		int  ans = (int)Math.ceil((double)3/2);
        System.out.println("ceil is 3: "+ Math.ceil((double)3/2));
         System.out.println("ans is: "+ans);
        // String s = "shell";
        // System.out.println(s+s);




		// 		Multimap<String, String> values = HashMultimap.create();
		// values.put("user1", "value1");
		// values.put("user2", "value2");
		// values.put("user3", "value3");
		// values.put("user1", "value4");

		// System.out.println(values.get("user1"));
		// System.out.println(values.get("user2"));
		// System.out.println(values.get("user3"));
        //  String s = "sbaacd";
        //  StringBuffer sb = new StringBuffer(s);
        //  char c = 'a';
        //  for(int i=0 ; i<sb.length() ;i++){
        //  	if(sb.charAt(i) == c)
     			// sb.deleteCharAt(i);
        //  }
        //  System.out.println(sb);

         char arr[] = new char[3];
         arr[0] = '1';
         arr[1] = '2';
         arr[2] = '3';
       //  int value = (int)arr[1]; this is wrong...it will give the ascii value not 1
         // in order to get value 1 int.. - '0' as 0 value is 48...1 value is 49 in ascii..
 
         System.out.println("diff of char: "+value);
	}
}