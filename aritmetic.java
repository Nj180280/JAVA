//arithmetic operators
import java.util.*; 
class aritmetic
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in); 
System.out.println("enter first number"); 
float a=s.nextFloat(); 
System.out.println("enter second number"); 
float b=s.nextFloat();
System.out.println("addition of"+a+"and"+b+"is"+(a+b));
System.out.println("multiplication of"+a+"and"+b+"is"+(a*b));
System.out.println("subtraction of"+a+"and"+b+"is"+(a-b));
System.out.println("divison of"+a+"and"+b+"is"+(a/b));
System.out.println("modulo of"+a+"and"+b+"is"+(a%b));
}
}