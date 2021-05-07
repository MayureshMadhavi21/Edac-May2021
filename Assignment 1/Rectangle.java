import java.util.Scanner;
public class Rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("width=");
double w=sc.nextDouble();
System.out.print("Height=");
double h=sc.nextDouble();
double a=w*h;
double p=2*(w+h);
System.out.println("Area is " +w+"*"+h+"="+a);
System.out.println("Perimeter is 2"+"*"+"("+w+"+"+h+")"+"="+p);
}
}






