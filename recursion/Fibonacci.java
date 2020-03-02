//Fibonacci

class Fibonacci{
    int count = 0;
    public static void main(String[] args){
        Fibonacci obj = new Fibonacci();
        int n = 20;

        System.out.println("here count: "+ obj.fiba(n));
    }

    int fiba(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 2;
        if(n == 2)
            return 3;
        return fiba(n-1) + fiba(n-2);
    }
}