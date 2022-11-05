//exception handle 1
import java.util.*; 
class exp_handle3
{
public static void main(String args[])
{
try
{
int a=10/0;
int a[]=new int[5]; 
System.out.println("remaining part"); //throws exception
}
catch(ArithmeticException e)
{
System.out.println(e); 
}
catch(ArrayIndexOutOfBounds e1)
{
System.out.println(e1); 
}
finally
{
System.out.println("this is executable part");
}
}
}