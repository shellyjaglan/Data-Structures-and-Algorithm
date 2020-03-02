class Array2D{
	public static void main(String[] args) {
		Array2D obj  = new Array2D();
		int[][] arr = {{0,1,0,1},{1,1,1,1},{0,1,0},{1,1,1}};
		//System.out.println(arr);
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ; j<arr[i].length ; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}