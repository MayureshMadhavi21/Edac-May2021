import java.util.Scanner;
import java.lang.Math;

public class Q24
{
   public static void main(String args[])
{ 
     int num;
     System.out.println("Enter any binary number");
     Scanner sc= new Scanner(System.in);
     num=sc.nextInt();
     int Decimal= BinaryToDecimal(num);
     String Octal = DecimalToOctal(Decimal);
     System.out.println("Octal number is:"+Octal);
     
}


public static int BinaryToDecimal(int number)
{
    int decimalNumber = 0, i = 0;
     long remainder;
    while (number != 0) {
      remainder = number % 10;
      number = number/ 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber ;  
}

public static String DecimalToOctal(int number2)
{
        char ch[]={'0','1','2','3','4','5','6','7'};
	int rem;
	String octa="";
        while(number2 != 0)
        {
         rem=number2 % 8;
	 octa= ch[rem] + octa;
         number2= number2 / 8;
                                                 
        }   
       return octa ;  
    }


}


