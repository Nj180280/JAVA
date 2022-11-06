import java.util.*; 
class mythread1 implements Runnable 
{
    public void run()
    {
for(int i=0;i<11;i++)
{
System.out.println("HELLO");  
}
    
        try
        {
            Thread.sleep(100); 
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e); 
        }
    }
}
class mythread2 implements Runnable
{
    public void run()
    {
for(int i=0;i<11;i++)
{
System.out.println("HI");  
}
    
try
        {
            Thread.sleep(100); 
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e); 
        }
    }
}
class multithread2
{
    public static void main(String[] args) 
    {
mythread1 r1=new mythread1(); 
Thread t1=new Thread(r1);

mythread2 r2=new mythread2(); 
Thread t2=new Thread(r2);
t1.start(); 
t2.start(); 
    }
}