class LRUCache700366{
	Map<Integer,Integer> map = new LinkedList<Integer,Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			int n = in.nextInt();
			int q = in.nextInt();
			for(int j=0 ; j<q ; j++){
				String s = in.nextLine();
				if(s == "SET"){
					int key = in.nextInt();
					int value = in.nextInt();
					//cal func..
					set(key,value);
				}
				else if(s == "GET"){
					int g = in.nextInt();
					int result = get(g);
					System.out.println(result+" ");
				}
			}
		}

	}
	static void set(int key,int value){
		map.put(1,3);
		System.out.println(map);
	}
	static int get(int g){

	}
}