//

class ReachAScore{
    int count = 0;
    public static void main(String[] args){
        ReachAScore obj = new ReachAScore();
        int n = 20;

        System.out.println("here count: "+ obj.findways(n));
    }

    // int findways(int n){
    //     if(n < 0)
    //         return 0;
    //     if(n == 1)
    //         return 0;
    //     if(n == 0)
    //         return 1;
    //     if(n == 3)
    //         return 1;
    //     if(n == 5)
    //         return 1;
    //     if(n == 10)
    //         return 2;
    //     return findways(n-3) + findways(n-5) + findways(n-10);
    // }

    int findways(int n){
        if(n < 3)
            return 0;
        if(n == 3 || n ==5 )
            return 1;
        if(n == 10)
            return 2;
        return findways(n-3) + findways(n-5) + findways(n-10);
    }
}