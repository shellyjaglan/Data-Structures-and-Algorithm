import java.util.Scanner;

class ThreeLargestElements{
    public static void main(String[] args){
        int arr[] = {10,4,3,5,20,90};
        int first, second, third;

        first = second = third = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > first){
                third = second;
                second = first; 
                first = arr[i];
            }else if(arr[i] > second){
                third= second;
                second = arr[i];
            }else if(arr[i] > third){
                third = arr[i];
            }
        }

        System.out.println("here ans: "+first + " " + second + " " + third);
    }
}