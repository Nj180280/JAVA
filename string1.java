import java.util.*; 
class string1
{
public static void main(String args[])
{
String s1="hello"; 
String reverse=new StringBuffer(s1).reverse().toString();
System.out.println("reversed string is"+reverse);
String s3="100"; 
int n1=200; 
int n2=Integer.parseInt(s3); 
System.out.println("parsed string to integer is:"+n2); 
int n3=n1+n2; 
System.out.println("Addition is"+n3); 
}
}