package java_13;
import java.util.Scanner;
public class NumberException {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine();
        bin2Dec(hex);
    }

    public static void bin2Dec(String hex){
        int num = 0;
        
        int i;
        try{
            for(i = 0;i < hex.length(); ++i){
                char binChar = hex.charAt(i);
                if(binChar == '1' || binChar == '0'){
                    num = num * 2 + binChar - '0';
                }
                else{
                    throw new Exception("NumberFormatException");
                }
            }
            System.out.println(num);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
