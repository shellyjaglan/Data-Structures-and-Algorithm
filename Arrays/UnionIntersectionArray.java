class UnionIntersectionArray{
    public static void main(String[] args){
        int[] arr = {1,2,4,6,7,9,10};
        int[] arr2 = {2,3,4,5,9,10};

        intersection(arr, arr2);
    }

    public static void intersection(int[] a1, int[] a2){
        int len1 = a1.length;
        int len2 = a2.length;
        int i,j;

        for(i=0,j=0 ; i<len1 && j<len2 ; ){
            if(a1[i] < a2[j]){
                i++;
            }else if(a2[j] < a1[i]){
                j++;
            }else{
                System.out.println(a1[i]+" ");
                i++;
                j++;
            }
        }
    }
}