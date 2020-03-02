import java.util.Scanner ;
class BinaryToDecimal {
 
    public int getDecimalFromBinary(int binary){
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                System.out.println("binary is: "+binary);
                power++;
            }
        }
        return decimal;
    }
    public static void main(String[] args){
        BinaryToDecimal btd = new BinaryToDecimal() ;
      //  System.out.println("11 ===> "+ btd.getDecimalFromBinary(11)); 
        System.out.println("111 ===>" + btd.getDecimalFromBinary(111));
    }

}