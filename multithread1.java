import java.util.*; 
class mythread1 extends Thread
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
class mythread2 extends Thread
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
class multithread1
{
    public static void main(String[] args) 
    {
mythread1 t1=new mythread1();
mythread2 t2=new mythread2();
t1.start(); 
t2.start(); 
    }
}