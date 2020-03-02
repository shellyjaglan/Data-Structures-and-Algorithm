class TrieNode{
	int data = -1;
	TrieNode left,right;
	TrieNode(int key){
		data = key;
		left = right = null;
	}
}
//this code prints all the unique and repeating rows at the same time...

class TrieSimilarBitArrayRows2{
	TrieNode root = new TrieNode(-1);
	public static void main(String[] args) {
		TrieSimilarBitArrayRows2 obj = new TrieSimilarBitArrayRows2();
		int[][] arr= {{0,1,0,1},{1,1,1,1},{0,1,0,1},{0,0,1,1}};
		// if(obj.root.left == null){
		// 	System.out.println("root left is null");
		// }
		obj.findUnique(arr,obj.root);

	}
	void findUnique(int[][] arr,TrieNode root){
		for(int i=0 ; i<arr.length ; i++){
			TrieNode temp = root;
			boolean flag = false;
			for(int j=0 ; j<arr[i].length ; j++){
				int data = arr[i][j];
				if(data == 0){
					if(temp.left == null){
						flag = true;
						temp.left = new TrieNode(data);
						temp = temp.left;
					}
					else{
						temp = temp.left;
					}
				}
				else{
					if(temp.right == null){
						flag = true;
						temp.right = new TrieNode(data);
						temp = temp.right;
					}
					else{
						temp = temp.right;
					}
				}
			}

			if(flag == true){
			//	System.out.println("row unique: ");
				for(int c=0 ; c<arr[i].length ; c++){
					System.out.print(arr[i][c]);
				}
				System.out.println();
			}
			// else{
			// 	System.out.println("row repeat: ");
			// 	for(int c=0 ; c<arr[i].length ; c++){
			// 		System.out.print(arr[i][c]);
			// 	}
			// 	System.out.println();
			// }
		}
	}
}