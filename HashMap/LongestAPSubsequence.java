import java.util.*;

class LongestAPSubsequence{
    public static void main(String[] args) {
		LongestAPSubsequence obj = new LongestAPSubsequence();
        int[] arr = {1,2,4,3,5};
        int diff = 1;

		obj.longestSubsequence(arr, diff);
	}
    public int longestSubsequence(int[] arr, int diff) {
        if(arr.length == 0)
            return 0;
        
        HashMap<Integer, Integer> map  = new HashMap<Integer, Integer>();
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            int a = arr[i];

            map.put(a, map.getOrDefault(a-diff,0) + 1);
            max = Math.max(max, map.get(a));
        }

        return max;
    }
}