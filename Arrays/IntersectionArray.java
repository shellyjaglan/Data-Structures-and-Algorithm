import java.util.*;

class IntersectionArray{
    public static void main(String[] args) {
        IntersectionArray obj = new IntersectionArray();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int arr1[] = {4,9,5};
        int arr2[] = {9,4,9,8,4};

        ans = obj.intersect(arr1, arr2);
        System.out.println("here ans: "+ ans);
    }
    
    public int[] intersect(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int len1, len2, extra;
    
        len1 = arr1.length;
        len2 = arr2.length;
        
        if(len1 > len2){
            for(int i=0; i <arr1.length ; i++){
                hm.put(arr1[i],1);
            }
        }else{
           for(int i=0; i <arr2.length ; i++){
                hm.put(arr2[i],1);
            }
        }
        
        int j=0;
        //int result[] = new int[(len1 > len2 ? len2 : len1)];
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        //List<Integer> al = new ArrayList<Integer>(); 
        
        
        int arraytoloop = (len1 > len2 ? 2 : 1);
        int looplength = arraytoloop == 1 ? arr1.length : arr2.length;
            
        for(int i=0 ; i<looplength ; i++){
            int item = arraytoloop == 1 ? arr1[i] : arr2[i];
            if(hm.containsKey(item)){
                res.add(item);
                //al.add(item);
            }
        }
        
        // Integer[] arr = new Integer[al.size()]; 
        // //arr = al.toArray(arr); 
        
        // int[] res = new int[arr.length];
		// for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] != null)
		// 	    res[i] = arr[i].intValue();
		// }

		return res.toArray();
    }
}