class switchDemo{
	public static void main(String[] args) {
		int month = 2;
		String monthString;
		switch(month){
			case 1: monthString = "jan";
			break;
			case 2: monthString = "feb";
			break;
			case 3: monthString = "march";
			break;
		}
		System.out.println(monthString);
	}
}