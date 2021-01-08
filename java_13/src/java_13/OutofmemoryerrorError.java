package java_13;
import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
public class OutofmemoryerrorError extends WPrinterJob {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer>st = new Stack<Integer>();
        try{
            while(true){
                st.push(1);
            }
        }
        catch (OutOfMemoryError ex){
            System.out.println("OutofmemoryerrorError");
            System.exit(1);
        }
    }

}
