import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
class myframe extends JFrame implements ActionListener
{
JButton b1; 
JLabel l1; 
myframe()
{
JFrame j1=new JFrame("button"); 
j1.setSize(700,600); 
j1.getContentPane().setBackground(Color.RED); 
j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE); 
j1.setVisible(true); 
j1.setLayout(null); 

b1=new JButton("CLICK ME"); 
b1.setBounds(300,300,200,50);
b1.addActionListener(this); 
b1.setFont(new Font("SANS_SERIF",Font.BOLD,20));
b1.setForeground(Color.BLACK);
b1.setFocusable(true); //keeps border of button as it is
j1.add(b1); 

l1=new JLabel("LABEL 1"); 
l1.setBounds(500,500,200,50);
l1.setFont(new Font("Sans_Serif",Font.BOLD,20)) ;
l1.setForeground(Color.BLUE);
j1.add(l1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
System.out.println("MY NAME IS NIRANJAN");
}
}
}
class button_awt
{
public static void main(String args[])
{
myframe f1=new myframe();
}
}