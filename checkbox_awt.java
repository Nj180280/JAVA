import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
import javax.swing.border.Border;
class MyFrame extends JFrame implements ActionListener
{
    //checkbox is a GUI component to select or disselect things 
    JFrame j1=new JFrame(); 
    JCheckBox c1=new JCheckBox(); 
    JButton b1=new JButton("SUBMIT"); 
    MyFrame()
    {
        j1.setVisible(true);
        j1.setLayout(new FlowLayout());
        j1.setSize(500,500); 
        j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);
        j1.setTitle("TEXT FIELD"); 
        j1.add(c1); 

        c1.setText("MALE");
        b1.addActionListener(this);
        j1.add(b1); 
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            System.out.println(c1.isSelected()); //returns true or false whether box is selected or not 
        }
    }
}
public class checkbox_awt
{
    public static void main(String[] args) 
    {
        MyFrame f1=new MyFrame(); 
    }
}
