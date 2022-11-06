import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
class label_awt
{
public static void main(String args[])
{
JFrame j1=new JFrame("LABEL1"); 
j1.setSize(700,600); 
j1.setResizable(false); 
j1.setVisible(true); 
j1.getContentPane().setBackground(Color.RED); 
j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE); 

JLabel l1=new JLabel("HELLO"); 
l1.setBounds(200,200,80,40); //x,y,width,height
l1.setForeground(Color.BLUE); 
l1.setBackground(Color.magenta); 
l1.setOpaque(true); 
l1.setLayout(null);
l1.setFont(new Font("SANS_SERIF",Font.BOLD,20));
j1.add(l1); 
}
}