import java.util.*;
import java.util.Map;

class VowelsCountHashmap{

	public static void main(String[] args) {
		VowelsCountHashmap obj = new VowelsCountHashmap();
		Scanner in  = new Scanner(System.in);
		String s = in.nextLine();
		int length = s.length();
		if(length < 1 || length > 5000)
			return;
		// HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		// for(char c = 'a';c <= 'e';c++){
		// 	int a = in.nextInt();
		// 	//System.out.println(c);
		// 	hm1.put(c,a);
		// }

		// Set set = hm1.entrySet();
		// // check set values
		// System.out.println("Set values: " + set);
		int a = in.nextInt();
		int e = in.nextInt();
		int i = in.nextInt();
		int o = in.nextInt();
		int u = in.nextInt();
		obj.count(s,a,e,i,o,u);
		
	}

	void count(String s,int a,int e,int i,int o,int u){
		int count = 0;
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		for(int j =0;j < s.length();j++){
			char ch = s.charAt(j);
			if(hm1.containsKey(ch)){
				int val = (int)hm1.get(ch)+1;
				hm1.put(ch,val);
			}
			else{
				hm1.put(ch,1);
			}
		}
		Set set = hm1.entrySet();
		 // check set values
		System.out.println("Set values: " + set);
		Iterator itr = set.iterator();

		// or you can do 
		//Iterator<Character, Integer> itr = hm1.entrySet().iterator();
		if(a > 0){

			if(hm1.containsKey('a')){
				int val = (int)hm1.get('a');
				if(val >= a){
					//oki 
					break;
				}
				else{
					//a is less than specified val
					int min = -100000;
					while(itr.hasNext()){
						Entry next = itr.next();
						char minchar = '';
						if(next.getKey() != 'a' && next.getKey() != 'e' && next.getKey() != 'i'
							&& next.getKey() != 'o' && next.getKey() != 'u'){
							int m = next.getVal() - a;
							if(m < min){
								minchar = next.getKey();
								min = m;
							}
						}
					}
					if(minchar != ''){
						int v = (int)hm1.get(minchar) - 1;
						hm1.put(minchar,v);
						a--;
						count++;
					}


				}
			}
			else{

			}
		}
	}
}