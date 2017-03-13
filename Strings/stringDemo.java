
//writing a string
	//class stringDemo{
	/*public static void main(String[] args){
		String shelly="this is a string";
		System.out.println(shelly);
		*/


	//another method for string writing

		/*public static void main(String[] args){
			char[] shellyArray={'s','d','f','g'};

			// eg initialize array eg: shelly= new char[5];

			String shellyString = new String(shellyArray);
			System.out.println(shellyString);  

			//method to find the length string name.length()
			//store it in integer value
			// return the int value

			int len=shellyString.length();
			System.out.println("length of the string: " + len);
		}

}*/
//practice
class stringDemo{
	public static void main(String[] args){
		String arrayName = "this is example practice" ;
		System.out.println(arrayName);

		/*int [] arrayName ;
		arrayName = new int[50];
		
		char [] arrayStringName ;
		arrayStringName = new char[60];
		*/

		char [] array ={'a','g','n','j','h'} ;
		String arrayString = new String(array) ;
		//System.out.println(arrayString);
		int len = array.length ;

		for(int i=0 ; i< len;i++){
			System.out.println(array.charAt[i]);
		}

	}
}

  