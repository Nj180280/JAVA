import java.util.*; 
class cons
{
cons(String a)
{
System.out.println("my name is"+a); 
}
}
class construct
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter name"); 
String sc=s.nextLine();
cons c=new cons(sc);
}
}
