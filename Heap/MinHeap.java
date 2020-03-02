import java.util.*;
import java.util.Scanner;

public class MinHeap{
    public static int heap_size;
    public static int[] heap;

    public static void main(String[] arg){
        int arr[] = {12, 3, 5,2, 7, 19};
        int n = arr.length;
        int k = 4;
        
        //we are finding the kth smallest element in the arr using min heap..
        int ans  = KMinimum(arr,n,k);
        System.out.println("here kth smallest: "+ ans);
    }

    static int left(int i){
        return (i*2 + 1);
    }

    static int right(int i){
        return (i*2 + 2);
    }

    static int parent(int i){
        return (i-1)/2;
    }

    static void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public static int KMinimum(int[] arr, int n, int k){
        if(n <= 0)
            return 0;
        //heapify the arr into min...
        miniHeap(arr,n);

        for(int i=0; i<k-1 ; i++){
            extractMin();
        }

        return getMin();
    }

    public static void miniHeap(int[] arr, int n){
        heap_size = n;
        heap = arr;

        for(int i = ((n/2)-1) ; i >= 0 ; i--){
            MinHeapify(i);
        }
    }

    public static void MinHeapify(int i){
        int left = left(i);
        int right = right(i);
        int smallest = i;

        if(left < heap_size && heap[left] < heap[smallest]){
            smallest = left;
        }
        if(right < heap_size && heap[right] < heap[smallest]){
            smallest = right;
        }
        if(smallest != i){
            //swap i and smallest..
            swap(i, smallest);
            MinHeapify(smallest);
        }
    }

    static void  extractMin(){
        if(heap_size== 0){
            return;
        }

        int root  = heap[0];

        if(heap_size > 1){
            heap[0] = heap[heap_size-1];
            MinHeapify(0);
        }
        heap_size--;
    }
     
    static int getMin(){
        return heap[0];
    }
}