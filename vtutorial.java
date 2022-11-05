import java.util.*; 
class vtutorial
{
public static void main(String args[])
{
int []num={1,2,3,4,5}; 
Vector V=new Vector(); 
for(int i=1;i<=10;i++)
{
V.add(i); 
}
//V.addAll(2,3,4); 
V.add(4,100); 
System.out.println(V.elementAt(4)); 
System.out.println(V);
System.out.println(V.capacity());  
}
}