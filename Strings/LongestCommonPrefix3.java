class TrieNode{
	 //TrieNode node;
	 Map<Character,TrieNode> child;
	 boolean endOfWord;
	 TrieNode(){
	 	child = new HashMap<Character,TrieNode>();
	 	endOfWord = false;
	 }
}

class LongestCommonPrefix3{
	TrieNode root = new TrieNode();

	public static void main(String[] args) {
		LongestCommonPrefix3 obj = new LongestCommonPrefix3();
		ArrayList<String> a = new ArrayList<String>();
		a.add("abcd");
		a.add("abczdc");
		a.add("acbdfgf");

		obj.findPrefix(a,a.size());
	}

	String findPrefix(ArrayList<String> a,int size){
		StringBuffer prefix = new StringBuffer();

		for(int i=0 ; i<size ; i++){
			insertToTrie((String)a.get(i));
		}
		appendPrefix(root,prefix);
	}

	void insertToTrie(String str){
		TrieNode current = root;

		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			TrieNode node = current.child.get(ch);
			if(node == null){
				node = new TrieNode();
				current.child.put(ch,node);
			}
			current = node;
		}
		current.endOfWord = true;
	}

	String appendPrefix(TrieNode node,StringBuffer prefix){
		//loop until no two childern found...

		TrieNode temp = node;
		while(temp.child.size() === 1 && temp.endOfWord == false){
			/////////////////////////////??????
			prefix.append(temp.child.getKey())
		}
	}
}