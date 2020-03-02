import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PermutationFindRankGiven {
  public static int factorial(int n) {
    if (n == 1)
      return 1;
    return factorial(n-1) * n;
  }
  public static void main(String args[]) {
    int R = 1234423;
    // String S = "abcdefghijklmnop";
    String S = "shel";
    for (int i = 0;i<R;i++) {
      System.out.println(nthPermutation(S, i));
    }
  }
  public static String nthPermutation(String S, int R) {
    int l = S.length();
    int totalPermutations = factorial(l);
    if (R < 0 || R > totalPermutations - 1) {
      return "";
    }
    if (l == 1) {
      return S;
    }
    int permutationsInOneBox = totalPermutations/l;
    int boxIndex = R/permutationsInOneBox;
    StringBuffer sBuffer = new StringBuffer(S);
    StringBuffer answerBuffer = new StringBuffer();
    char firstCharacter = sBuffer.charAt(boxIndex);
    int R1 = R - boxIndex * permutationsInOneBox;
    String S1 = sBuffer.deleteCharAt(boxIndex).toString();
    answerBuffer.append(firstCharacter + nthPermutation(S1, R1));
    return answerBuffer.toString();
  }
}