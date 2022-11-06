import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class myframe implements ActionListener
{
JButton b1; 
JButton b2;
JButton b3;
JButton b4;
JButton b5;
JTextField t1; 
JTextField t2; 
JTextField t3; 
JLabel l1; 
JLabel l2; 
JLabel l3; 
JFrame j1;
myframe()
{
j1=new JFrame("CALCULATOR"); 
j1.setSize(900,1000); 
j1.setVisible(true); 
j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE); 
j1.setLayout(null); 

l1=new JLabel("FIRST NUMBER:"); 
l1.setBounds(10,100,200,80); 
l1.setForeground(Color.BLACK); 
j1.add(l1); 

l2=new JLabel("SECOND NUMBER:"); 
l2.setBounds(10,200,200,80); 
l2.setForeground(Color.BLACK); 
j1.add(l2);

l3=new JLabel("RESULT:"); 
l3.setBounds(10,300,200,80); 
l3.setForeground(Color.BLACK); 
j1.add(l3);

t1=new JTextField(); 
t1.setBounds(320,100,500,80); 
j1.add(t1); 

t2=new JTextField(); 
t2.setBounds(320,200,500,80); 
j1.add(t2);

t3=new JTextField(); 
t3.setBounds(320,300,500,80); 
j1.add(t3);

b1=new JButton("+"); 
b1.setBounds(10,400,100,80); 
b1.addActionListener(this); 
j1.add(b1); 

b2=new JButton("-"); 
b2.setBounds(140,400,100,80); 
b2.addActionListener(this); 
j1.add(b2); 

b3=new JButton("*"); 
b3.setBounds(270,400,100,80); 
b3.addActionListener(this); 
j1.add(b3); 

b4=new JButton("/"); 
b4.setBounds(400,400,100,80); 
b4.addActionListener(this); 
j1.add(b4);

b5=new JButton("EXIT"); 
b5.setBounds(530,400,100,80); 
b5.addActionListener(this); 
j1.add(b5);
}
public void actionPerformed(ActionEvent e)
{
float n1=Float.parseFloat(t1.getText()); 
float n2=Float.parseFloat(t2.getText()); 
if(e.getSource()==b1)
{
t3.setText(String.valueOf(n1+n2)); 
}
if(e.getSource()==b2)
{
t3.setText(String.valueOf(n1-n2)); 
}
if(e.getSource()==b3)
{
t3.setText(String.valueOf(n1*n2)); 
}
if(e.getSource()==b4)
{
t3.setText(String.valueOf(n1/n2)); 
}
if(e.getSource()==b5)
{
j1.dispose(); 
}
}
}
class calculator_awt 
{
public static void main(String args[])
{
myframe f1=new myframe();
}
}
