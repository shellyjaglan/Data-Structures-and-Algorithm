import java.util.Scanner;

class PlusMinus{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		/*
		ArrayList<Intger> num = new ArrayList<Intger>(size);

		for(int i = 0;i < size;i++){
			num.add(in.nextInt());
		}
		*/
		int z = 0,p = 0,n = 0;
		int[] arr = new int[size];
		for(int i = 0;i < size;i++){
			arr[i] = in.nextInt();
		}
		for(int i = 0;i < size;i++){
			if(arr[i] == 0)
				z ++;
			else if(arr[i] > 0){
				p++;
			}
			else(arr[i] < 0){
				n++;
			}
		}

		float zero = (float)(z / size);
		float positive = (float) (p / size);
		float negative = (float) (n / size);
		System.out.println(zero);
		System.out.println(positive);
		System.out.println(negative);

	}
}