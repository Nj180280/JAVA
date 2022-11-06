import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*;
public class studentform_awt extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5; 
JTextField t1,t2; 
JRadioButton rb1,rb2; 
JComboBox cb; 
JCheckBox b1,b2,b3;
JButton b;
JTextArea a1; 
Font f=new Font("Arial",Font.ITALIC,32); 

studentform_awt()
{
JFrame f1=new JFrame("STUDENT FORM"); 
JLabel l1=new JLabel("NAME"); 
l1.setBounds(20,20,80,30);
   t1=new JTextField(); 
   t1.setBounds(100,20,150,30);
   f1.add(l1); 
   f1.add(t1); 
   
   JLabel l2=new JLabel("MOBILE_NO"); 
l2.setBounds(20,70,80,30);
   t2=new JTextField(); 
   t2.setBounds(100,70,150,30);
   f1.add(l2); 
   f1.add(t2);
   
   JLabel l3=new JLabel("GENDER"); 
l3.setBounds(20,120,80,30);
rb1 = new JRadioButton("MALE");
rb1.setBounds(100,120,60,30);
rb2 = new JRadioButton("FEMALE");
rb2.setBounds(180,120,100,30);

ButtonGroup bg=new ButtonGroup(); 
bg.add(rb1);
bg.add(rb2);
f1.add(rb1); 
f1.add(rb2); 
f1.add(l3); 

JLabel l4=new JLabel("AGE");
l4.setBounds(20,165,80,30);
f1.add(l4); 

String age[]= {"18","19","20","21","22"}; 
cb=new JComboBox(age); 
cb.setBounds(100,170,90,20);
f1.add(cb); 

JLabel l5=new JLabel("HOBBIES"); 
l5.setBounds(10,215,100,30);
f1.add(l5); 

b1=new JCheckBox("READING"); 
b1.setBounds(80,220,100,20); 
b2=new JCheckBox("SINGING"); 
b2.setBounds(200,220,100,20); 
b3=new JCheckBox("DANCING"); 
b3.setBounds(320,220,100,20);
f1.add(b1); 
f1.add(b2); 
f1.add(b3); 

JButton b=new JButton("SUBMIT ");
b.setBounds(250,165,100,30);
f1.add(b); 
b.addActionListener(this);

a1=new JTextArea(); 
a1.setBounds(0,240,700,460);
f1.add(a1); 

setDefaultCloseOperation(EXIT_ON_CLOSE);
f1.setSize(700,700);
f1.setLayout(null);
f1.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
String NAME = t1.getText(); 
String MOBILE = t2.getText();
String GENDER = rb1.isSelected() ?"MALE":
rb2.isSelected()?"FEMALE":"-"; 
String AGE=cb.getItemAt(cb.getSelectedIndex()).toString(); 
String HOBBY=""; 
if(b1.isSelected())
{
HOBBY = "READING"; 
}
if(b2.isSelected())
{
HOBBY = HOBBY+" "+"SINGING"; 
}
if(b3.isSelected())
{
HOBBY = HOBBY+" "+"DANCING"; 
}
a1.setText("NAME:"+NAME+"\n"+"MOBILE NUMBER:"+MOBILE+"\n"+"GENDER:"+GENDER+"\n"+"AGE:"+AGE+"\n"+"HOBBIES:"+HOBBY); 
a1.setFont(f);
}
public static void main(String[] args)
{
new studentform_awt(); 
}
}
