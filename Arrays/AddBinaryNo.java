import java.util.*;

class AddBinaryNo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			String a = in.next();
			String b = in.next();
			System.out.println(addBinary(a,b));
		}
	}
	public static String addBinary(String a, String b) {
	    int len1 = a.length();
	    int len2 = b.length();
	    int carry= 0;
	    int i,j;
	    StringBuffer sb = new StringBuffer();
	  //  int min_len = min(len1,len2);
	    
	    for(i=len1-1 ,j=len2-1 ; i>=0 && j>=0 ; i--,j--){
	        char ch1 = a.charAt(i);
	        char ch2 = b.charAt(j);
	        
	        int p = ch1-'0';
	        int q = ch2-'0';
	        int sum;
	        if(carry == 0){
	            sum = p+q;
	        }
	        else{
	            sum = p + q + carry;
	            carry = 0;
	        }
	        
	        if(sum == 0){
	            sb.insert(0,0);
	        }
	        if(sum == 1){
	            sb.insert(0,1);
	        }
	        if(sum == 2){
	           sb.insert(0,0);
	           carry = 1;
	        }
	        if(sum == 3){
	            sb.insert(0,1);
	            carry = 1;
	        }
	    }
	 //   System.out.println("i is: "+i);
	  //  System.out.println("j is: "+j);
	    if(i >= 0){
	      for(int k=i ; k >= 0 ; k--){
	         // System.out.println("chr i is: "+ a.charAt(i));
	          int g = a.charAt(k) - '0';
	          if(carry == 0){
	              sb.insert(0,g);
	          }
	          else{
	              if(carry + g == 2){
	                  sb.insert(0,0);
	                  carry = 1;
	              }
	              else{
	                  sb.insert(0,1);
	                  carry = 0;
	              }
	          }
	      }  
	    }
	    else if(j >= 0){
	        
	        for(int k=j ; k >= 0 ; k--){
	            int h = b.charAt(k) - '0';
	          if(carry == 0){
	              sb.insert(0,h);
	          }
	          else{
	              if(carry + h == 2){
	                  sb.insert(0,0);
	                  carry = 1;
	              }
	              else{
	                  sb.insert(0,1);
	                  carry = 0;
	              }
	          }
	      }  
	    }
	    
	    if(carry == 1){
	        sb.insert(0,1);
	    }
	    return sb.toString();
	    
	}

}
	
