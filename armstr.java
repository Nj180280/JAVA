import java.util.*; 
class armstr
{
public static void main(String args[])
{
int sum=0,n,b,a; 
Scanner s=new Scanner(System.in); 
System.out.println("enter any number to check armstrong for");
n=s.nextInt(); 
b=n;
while(n!=0)
{
a=n%10; 
sum=sum+a*a*a; 
n=n/10;
}
if(b==sum)
{
System.out.println(b+"is armstrong");
}
else
{
System.out.println(b+"is not armstrong");
}
}
}