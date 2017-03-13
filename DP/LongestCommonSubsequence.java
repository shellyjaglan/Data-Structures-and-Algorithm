import java.util.*;

class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S1 = in.nextLine();
        String S2 = in.nextLine();
        System.out.println(LCS(S1,S2));
        System.out.println(LCSOptimized(S1,S2));
    }
    static int LCS(String S1, String S2) {
        int L1 = S1.length();
        int L2 = S2.length();
        int dp[][] = new int[L1][L2];
        String dpstring[][] = new String[L1][L2];
        for (int i=0;i<L1;i++) {
            for(int j=0;j<L2;j++) {
                if (i==0 && j==0) {
                    dp[0][0] = (S1.charAt(0) == S2.charAt(0)) ? 1 : 0;
                    dpstring[0][0] = (S1.charAt(0) == S2.charAt(0)) ? "" + S1.charAt(0) : "";
                }
                else if (i-1>=0 && j-1>=0 && S1.charAt(i) == S2.charAt(j)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    dpstring[i][j] = dpstring[i-1][j-1] + S1.charAt(i);
                }
                else if (i-1 >= 0 && j-1 >= 0){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    dpstring[i][j] = 
                        dp[i-1][j] > dp[i][j-1] ? dpstring[i-1][j] : dpstring[i][j-1];
                }
                else if (i-1 < 0) {
                    dp[i][j] = dp[i][j-1];
                    dpstring[i][j] = dpstring[i][j-1];
                }
                else if (j-1 < 0) {
                    dp[i][j] = dp[i-1][j];
                    dpstring[i][j] = dpstring[i-1][j];
                }
            }
        }
        System.out.println(dpstring[L1-1][L2-1]);
        return dp[L1-1][L2-1];
    }
    static int LCSOptimized(String S1, String S2) {
        int L1 = S1.length();
        int L2 = S2.length();
        int P[] = new int[L2];
        int C[] = new int[L2];
        for (int i=0;i<L1;i++) {
            for(int j=0;j<L2;j++) {
                if (i==0 && j==0) {
                    C[0] = (S1.charAt(0) == S2.charAt(0)) ? 1 : 0;
                }
                else if (i-1>=0 && j-1>=0 && S1.charAt(i) == S2.charAt(j)){
                    C[j] = P[j-1] + 1;
                }
                else if (i-1 >= 0 && j-1 >= 0){
                    C[j] = Math.max(P[j], C[j-1]);
                }
                else if (i-1 < 0) {
                    C[j] = C[j-1];
                }
                else if (j-1 < 0) {
                    C[j] = P[j];
                }
            }
            for(int j=0;j<L2;j++) {
                P[j] = C[j];
                C[j] = 0;
            }
        }
        return P[L2-1];
    }
}