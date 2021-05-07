import java.util.*;
public class Formula2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float a,b,c,d,e,f,g,h,i,j,k,l;
System.out.print("a=");
 a=sc.nextFloat();
System.out.print("b=");
 b=sc.nextFloat();
System.out.print("c=");
 c=sc.nextFloat();
System.out.print("d=");
 d=sc.nextFloat();
System.out.print("e=");
 e=sc.nextFloat();
System.out.print("f=");
 f=sc.nextFloat();
System.out.print("g=");
 g=sc.nextFloat();                                               
System.out.print("h=");
 h=sc.nextFloat();
System.out.print("i=");
 i=sc.nextFloat();
System.out.print("j=");
j=sc.nextFloat();
System.out.print("k=");
 k=sc.nextFloat();
System.out.print("l=");
 l=sc.nextFloat();
float ans=a * (b - (c/d) + (e/f) - (g/h) + (i/j) - (k/l));
System.out.println(+ans+"="+a+"*"+"("+b+"-"+"("+c+"/"+d+")"+"+"+"("+e+"/"+f+")"+"-"+"("+g+"/"+h+")"+"+"+"("+i+"/"+j+")"+"-"+"("+k+"/"+l+")");
}
}