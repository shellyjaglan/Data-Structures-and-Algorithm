class ReverseInteger{
    public static void main(String[] args){
        int a = -1234;
        System.out.println("here reverse of a: "+ reverseInt(a));
    }

    static int reverseInt(int a){
        int res = 0;
        boolean isn = true;

        if(a < 0){
            a = a*-1;
        }
        while(a>0){
            res = res*10 + a%10;
            a = a/10;
        }

        if(isn)
            return res*-1;
        return res;
    }
}