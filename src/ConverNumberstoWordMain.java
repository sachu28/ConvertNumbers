import java.text.NumberFormat;
import java.util.Scanner;

//converting numbers
public class ConverNumberstoWordMain {

    public static void main(final String[] args) {

        ConvertNumberstoWord cntw=new ConvertNumberstoWord();
        String choice = "";
        int n;
         @SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
            
         while (choice != "0"){
             System.out.println("");
             System.out.println("Enter number between 0-999 to convert into word");
             System.out.println("  (0) Exit");
             n =scan.nextInt();
             choice=Integer.toString(n);
             
             if (choice.equals("0")) {
                 System.out.println("Exit");
                 break;
             } else if ( n < 0){
                 System.out.println("Invalid");
            }
                            
             else System.out.println("'" + cntw.convert(n) + "'");

             
         }
     
     }

}
