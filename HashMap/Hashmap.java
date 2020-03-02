class HashmapTest{
	public static void main(String[] args) {
		//this is jst a practice of using hash maps
		//how to start 
		Hashmap<String, Integer> hm = new Hashmap<String ,Integer>();
		//to copy data from hm Hashmap to another hashmap/hashtable

		Hashmap<String,Integer> map = new Hashmap(hm);
		map.put("twenty",20);
		map.put("thrityone",31);
		String key = "twenty";
		Integer value = map.get(key);

		//access hashmap elements using iterators

		Iterator<Integer> nameitr = map.keySet().iterator();
		
		while(nameitr.hasNext()){
			String key = nameitr.next();
			System.out.println("key:" + key + "value" + value);
		}
		//to get the size of the hashmap
		System.out.println("size is:" + hm.size());
		//to remove a element in a hashmap
		map.clear();


		System.out.println("Does HashMap contains 20 as key: " + map.containsValue(20));
		System.out.println("Does HashMap contains 20 as value: " + map.containskey(20));
	}
}


