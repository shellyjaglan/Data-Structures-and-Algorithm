import java.util.*;

class LongestPalindromicSubsequence{
    public static void main(String[] args){
        //String str = "BBABCBCAB";
       // System.out.println(LPS(str));


         String str = "abcad";
        System.out.println(countPS(str));
    }

    static int LPS(String s){
        if(s.length() == 0)
            return 0;
        if(s.length() == 1)
            return 1;

        int n = s.length();

        int[][] lp = new int[n][n];

        for(int i=0 ; i<n ; i++){
            lp[i][i] = 1;
        }

        for(int l=2 ; l<=n ; l++){
            for(int i=0 ; i<n-l+1 ; i++){
                int j= i+l-1;

                if(s.charAt(i) == s.charAt(j) && l==2)
                    lp[i][j] = 2;
                else if(s.charAt(i) == s.charAt(j))
                    lp[i][j] = 2 + lp[i+1][j-1];
                else
                    lp[i][j] = Math.max(lp[i+1][j], lp[i][j-1]);
            }
        }

        return lp[0][n-1];
    }

    static int countPS(String str) 
    { 
        int N = str.length(); 
       
        // create a 2D array to store the count 
        // of palindromic subsequence 
        int[][] cps = new int[N+1][N+1]; 
       
        // palindromic subsequence of length 1 
        for (int i = 0; i < N; i++) 
            cps[i][i] = 1; 
       
        // check subsequence of length L is  
        // palindrome or not 
        for (int L=2; L<=N; L++) 
        { 
            for (int i = 0; i < N; i++) 
            { 
                int k = L + i - 1; 
                if (k < N){ 
                if (str.charAt(i) == str.charAt(k)) 
                    cps[i][k] = cps[i][k-1] + 
                                cps[i+1][k] + 1; 
                else
                    cps[i][k] = cps[i][k-1] + 
                                cps[i+1][k] - 
                                cps[i+1][k-1]; 
                } 
            } 
        } 
       
        // return total palindromic subsequence 
        return cps[0][N-1]; 
    } 
}