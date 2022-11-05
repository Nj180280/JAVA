import java.util.*; 
class animal
{
void eat()
{
System.out.println("animal eats"); 
}
void drink()
{
System.out.println("animal drinks water"); 
}
}
class monkey extends animal
{
void eat()
{
System.out.println("monkey is a animal and he eats"); 
}
void grow()
{
System.out.println("monkey is a animal and he grows"); 
}
}
class chimpanzee extends monkey
{
void eat()
{
System.out.println("chimpanzee is a monkey and he eats"); 
}
void sleep()
{
System.out.println("chimopanzee sleeps"); 
}
}
class inherit
{
public static void main(String args[])
{
chimpanzee c1=new chimpanzee(); 
c1.eat(); 
c1.grow(); 
c1.drink(); 
c1.sleep();
monkey m1=new monkey(); 
m1.eat(); 
m1.grow(); 
m1.drink();
animal a1=new animal(); 
a1.eat(); 
a1.drink();
}
}
