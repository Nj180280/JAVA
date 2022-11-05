import java.util.*; 
class fact
{
public static void main(String args[])
{
int fin=1; 
Scanner s=new Scanner(System.in); 
System.out.println("enter any number");
int n=s.nextInt(); 
for(int i=1;i<=n;i++)
{
    fin=fin*i; 
}
System.out.println("factorial of number is:"+fin);
}
}