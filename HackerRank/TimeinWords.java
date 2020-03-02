class TimeinWords{
	public static void main(String[] args) {
		TimeinWords obj = new TimeinWords();
		Scanner in = new Scanner(System.in);
		int hr = in.nextInt();
		int min = in.nextInt();

		obj.printtime_english(hr,min);
	}
	printtime_english(int hr,int min){
		StringBuffer sb = new StringBuffer();
		String plu,a; 
		if((hr >= 1 && hr <= 12) && (min >= 0 && min <= 59)){
			String words[]={"", "one", "two", "three", "four", "five", "six","seven", "eight", "nine","ten",
		    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
		    "twenty","twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
		    "twenty six","twenty seven","twenty eight", "twenty nine"};

		    if(min == 1 || min == 59)
		    	plu = "minute";
		    else
		    	plu = "minutes";
		    if(hr == 12)
		    	a = words[1];
		    else
		    	a = words[h+1];
		    if(m==0)
            System.out.println(words[hr]+" o' clock");
	         else if(min==15)
	            System.out.println("quarter past "+words[hr]);
	         else if(min==30)
	            System.out.println("half past "+words[hr]);
	         else if(min==45)  
	            System.out.println("quarter to "+a);  
	         else if(min<30) // condition for minutes between 1-29
	            System.out.println(words[m]+" "+plu+" past "+words[hr]);
	         else // condition for minutes between 31-59
	            System.out.println(words[60-min]+" "+plu+" to "+a);
	        } //end of outer if

	        else
            	System.out.println("Invalid Input !");
        }
	}
}