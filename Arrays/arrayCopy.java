class arrayCopy{
	public static void main(String[] args){
		char[] copyFrom={'y','a','p','p','l','e','s','t'};
		char[] copyTo=new char[5];
		//char[] copyTo ;
		//charTo=new char[5] ;
		System.arraycopy(copyFrom,1,copyTo,6);
		System.out.println(new String(copyTo));

	}
}
