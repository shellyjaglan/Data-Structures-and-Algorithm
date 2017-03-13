/*class qSeven{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		int a ,b;
		printf("enter the integer array:");
		a=in.nextInt();
		printf("enter another integer array:");
		b = in.nextInt();
		int len1 = a.length();
		int len2 = b.length();
		int max= Math.max(len1,len2);

		int [] arrayA= new int[len1];
		int [] arrayB=new int[len2];

		for(i=0;i<len1;i++){
			arrayA[i]=a.charAt(i);
		}
		for(j=0;j<len2;j++){
			arrayB[j]=b.charAt(j);
		}



	}
}
*/


import java.util.Scanner;
 
class qSeven
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter two integers to calculate their sum ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
      System.out.println("Sum of entered integers = "+z);
   }
}