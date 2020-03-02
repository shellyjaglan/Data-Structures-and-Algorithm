import java.util.*;
import java.util.Arrays;

class LongestSubArrayEqual01{
    //LongestSubArrayEqual01
    public static void main(String[] args){
        LongestSubArrayEqual01 obj = new LongestSubArrayEqual01();
        
        //int[] arr = {'a', 'b', 'x', 4, 6, 'X', 'A'};
        //int[] arr = {1, 2 , 'a', 'b', 'c', 1, 'n', 'c', 1, 2};
        // obj.findSubarray(arr);

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        ArrayList<Integer> l4 = new ArrayList<Integer>();
        ArrayList<Integer> l5 = new ArrayList<Integer>();
        //ArrayList<Integer> l3 = new ArrayList<Integer>();

    //int[] arr = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} };
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        l1.add(5);
        l1.add(24);

        l2.add(39);
        l2.add(60);

        l3.add(15);
        l3.add(28);

        l4.add(27);
        l4.add(40);

        l5.add(50);
        l5.add(90);

        res.add(l1);
        res.add(l2);
        res.add(l3);
        res.add(l4);
        res.add(l5);

       Collections.sort(res, new Comparator<List<Integer>> () {
            public int compare(List<Integer> a, List<Integer> b) {
                return a.get(1).compareTo(b.get(0));
            }
        });

        System.out.println("here res:"+ res);
    }

    // void findSubarray(int[] arr){
    //     int len = arr.length;
    //     int max = 0, start = 0, end = 0, sum = 0;

    //     for(int i=0 ; i<len ; i++){
    //         if(isNumber(arr[i])){
    //             arr[i] = 0;
    //         }else{
    //             arr[i] = 1;
    //         }
    //     }
        
    //     HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
    //     for(int i=0 ; i<len ; i++){
    //         sum = arr[i] == 0 ? sum-1 : sum+1;

    //         if(hm.containsKey(sum)){
    //             int index = (int)hm.get(sum);
    //             int diff = Math.abs(i-index);
    //             if(max < diff){
    //                 max = diff;
    //                 start = index+1;
    //                 end = i;
    //             }
    //         }else
    //             hm.put(sum, i);
    //     }

    //     if(sum == 0){
    //         System.out.println("start: "+ 0 + " end: "+ (len-1));
    //     }else if(max == 0)
    //         System.out.println("does not exists");
    //     else{
    //         System.out.println("start: "+ start + " end: "+ end);
    //     }
    // }

    // boolean isNumber(int n){
    //     if (
    //         ( n >= 65 &&  n <= 90)  
    //         || 
    //         ( n >= 97 &&  n <= 122)
    //     )  
    //         return false; 
              
    //     return true; 
    // }
}