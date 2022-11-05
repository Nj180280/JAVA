import java.util.*; 
interface animal
{
void eat();
void drink();
}
interface monkey 
{
void grow();
void thinks();
}
class chimpanzee implements monkey,animal
{
public void eat()
{
System.out.println("animal eats"); 
}
public void drink()
{
System.out.println("animal drinks water"); 
}
public void sleep()
{
System.out.println("chimopanzee sleeps"); 
}
public void grow()
{
System.out.println("monkey is a animal and he grows"); 
}
public void thinks()
{
System.out.println("monkey thinks a lot");    
}
}
class interf
{
public static void main(String args[])
{
chimpanzee c1=new chimpanzee(); 
c1.eat(); 
c1.grow(); 
c1.drink(); 
c1.sleep();
c1.thinks();
}
}
