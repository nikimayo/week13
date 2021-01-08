package java_13;
import java.util.Scanner;
class HexFormatExceptionYY extends Exception{
    HexFormatExceptionYY(String msg){
        super(msg);
    }
}
public class HexFormatException {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine();
        hexToDec(hex.toUpperCase());
    }

    public static void hexToDec(String hex){
        int num = 0;
        int i;
        try{
            for( i = 0;i < hex.length(); ++i){
                char hexChar = hex.charAt(i);
                if(hexChar >= '0' && hexChar <= '9'){
                    num = num * 16 + hexChar - '0';
                }else if( hexChar >= 'A' && hexChar <= 'F'){
                    num = num * 16 + hexChar - 'A' + 10;
                }else{
                    throw new HexFormatExceptionYY("HexFormatException");
                }
            }
            System.out.println(num);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
