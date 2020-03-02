class Ascii{
	public static void main(String[] args) {
		char e = 'e';
		char b = 'b';
		int diff = (int)e -(int)b; //or just e -b will work
		//int diff = e-b;
		char m = 'm';
		int val = (int) m +2;
		System.out.println("diff is: "+diff);
		System.out.println("add is: "+ (char) val);

	}
}