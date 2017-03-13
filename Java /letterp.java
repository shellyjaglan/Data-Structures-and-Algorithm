class letterp{
	public static void main(String[] args){
		//we wan t to count the no of p in string

		String shel = "petter picked pettles";
		int maxl = shel.length();
		int count = 0;
		int i;

		for(i=0;i<=maxl;i++){
			if(shel.charAt(i) != 'p')
				continue;

			count++;
		}
		System.out.println("we found" + count +" no of p");
	}
}