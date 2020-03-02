import java.util.Scanner;

class PlusMinus{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		float z = 0,p = 0,n = 0;
		int[] arr = new int[size];
		for(int i = 0;i < size;i++){
			arr[i] = in.nextInt();
		}
		for(int i = 0;i < size;i++){
			if(arr[i] == 0){
				z ++;
//				System.out.println(i);
//				System.out.println(z);
			}
			else if(arr[i] > 0){
				p++;
//				System.out.println(p);
			}
			else{
				n++;
//				System.out.println(n);
			}
		}
//		System.out.println(z);
//		System.out.println(p);
//		System.out.println(n);

		float zero = z / size ;
//		float ex = 6f / 4f ;
//		String str = String.format("%.6f", ex); 
//		System.out.println("formatted float up to 6 decimals " + str);

//		System.out.formatln("%.06f", ex);
		float positive = p / size;
		float negative = n / size;
//		System.out.println(zero);
//		System.out.println(positive);
//		System.out.println(negative);

		String str = String.format("%.6f", positive); 
		System.out.println(str);

		String str1 = String.format("%.6f", negative); 
		System.out.println(str1);

		String str2 = String.format("%.6f", zero); 
		System.out.println(str2);


	}
}