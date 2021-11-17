import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class test {
public static void main(String args[]) {
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
String hexa = "0123456789ABCDEF";
Scanner sc = new Scanner (System.in);
System.out.println("Would you like to convert to Decimal (D) or Hexadecimal (H) or any other  letter to quit?");
String convert = sc.nextLine();
if (convert.equals("H")) {
String str = " ";
int rem;
   System.out.println("What is your decimal number?");
   int decimal = sc.nextInt();
      while (decimal > 0) {
         rem = decimal%16;
         str = hex[rem] + str;
         decimal = decimal/16;
         }
         System.out.println("Your hexadecimal number is " + str);
      }
else if (convert.equals("D")) {
int val = 0;
   System.out.println("What is your hexadecimal number?");
   String hexad = sc.nextLine();
      for (int i = 0; i < hexad.length(); i++) {
         char c = hexad.charAt(i);
         int d = hexa.indexOf(c);
         val = val * 16 + d;
         }
      System.out.println("Your decimal number is " + val);
      }
else {
   System.out.println("Thanks for using the machine");
   }
   }
}
