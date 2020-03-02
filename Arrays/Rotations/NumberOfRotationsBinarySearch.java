import java.util.Scanner;

class NumberOfRotationsBinarySearch{
  public static void main(String[] args){
    Scanner in  = new Scanner(System.in);
    //System.out.print("Enter a number for arr length: ");
    //int n = in.nextInt();
    //int arr[] = new int[n];

    int a[]= {7,9,11,12,5};

    System.out.println("here result max sum: "+ findNumberOfRotations(a,0, 4));
  }

  public static int findNumberOfRotations(int[] arr, int low, int high){
    //returns the no of times rotation is made on the array..
    //using binary search in this..
    if(low > high)
      return 0;
    if(low == high)
      return low;

    int mid = (high + low) / 2;

    if(mid < high && arr[mid+1] < arr[mid]){
      return (mid+1);
    }    

    if(mid > low && arr[mid-1] > arr[mid]){
      return mid;
    }

    if(mid < high && arr[mid] > arr[high])
      return findNumberOfRotations(arr, mid+1, high);
    
    return findNumberOfRotations(arr, low, mid-1);
  } 
}