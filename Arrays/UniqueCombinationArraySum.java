// Java implementation of the approach
import java.util.*;
import java.util.ArrayList;

class UniqueCombinationArraySum
{

  // Function to find all unique combination of
  // given elements such that their sum is K

  static void unique_combination(int l, int sum, int K, Vector local, Vector A){
    if (sum == K){
      System.out.print("{");
      for (int i = 0; i < local.size(); i++) { if (i != 0) System.out.print(" "); System.out.print(local.get(i)); if (i != local.size() - 1) System.out.print(", "); } System.out.println("}"); return; } // For all other combinations for (int i = l; i < A.size(); i++) { // Check if the sum exceeds K if (sum + A.get(i) > K)
      continue;

      // Check if it is repeated or not
      if (i == 1 && (int)A.get(i) == (int)A.get(i – 1) && i > l)
        continue;

      // Take the element into the combination
      local.add(A.get(i));

      // Recursive call
      unique_combination(i + 1, sum + A.get(i),K, local, A);

      // Remove element from the combination
      local.remove(local.size() – 1);
    }
  }

// Function to find all combination
// of the given elements

  static void Combination(Vector A, int K){
     Collections.sort(A);

     Vector local = new Vector();

     unique_combination(0, 0, K, local, A);
  }

  public static void main(String[] args){
    Integer []arr = { 10, 1, 2, 7, 6, 1, 5 };
    Vector A = new Vector<>(Arrays.asList(arr));
    //ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr));
    int K = 8;

    // Function call
    Combination(A, K);
  }
}
