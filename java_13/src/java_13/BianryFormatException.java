package java_13;
import java.util.Scanner;
import java.util.Scanner;

class BinaryFormatExceptionYY extends Exception{
    public BinaryFormatExceptionYY(String s){
        super(s);
    }
public class BianryFormatException {
	static int hex2Dec(String s) throws HexFormatExceptionYY {
        int res=0;
        s=s.toUpperCase();
        try{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    res=res*16+(s.charAt(i)-'0');
                }else if(s.charAt(i)>='A'&&s.charAt(i)<='F'){
                    res=res*16+(s.charAt(i)-'A'+10);
                }else{
                    throw new HexFormatExceptionYY("This is not a hex number");
                }

            }
        }
        catch (HexFormatExceptionYY ex){
            System.out.println(ex.getMessage());
        }
        return res;
    }

    public static void main(String[] args) throws HexFormatExceptionYY {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        System.out.println(hex2Dec(s));

    }
}



}
