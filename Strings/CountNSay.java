class CountNSay{
    public static void main(String[] args) {
        int n = 5;
        String ans = countAndSay(n);
        System.out.println("here ans of: " + n + " : "+ ans);
    }

    public static String countAndSay(int n) {
        int num = 1;
        String res = "1";
        
        while(num < n){
            String newstr = generateString(res);
            res = newstr;
            num++;
        }
        return res;
    }

    public static String generateString(String s){
        int count = 1;
        String temp = "";
        
        for(int i=0 ; i<s.length()-1 ; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                temp = temp + count + s.charAt(i);
                count = 1;
            }
        }        
        temp = temp + count + s.charAt(s.length() -1);
        return temp;
    }
}
