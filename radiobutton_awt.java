import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class MyFrame extends JFrame implements ActionListener
{
    //JRadioButton is group of one or more buttons in which only 1 can be selected per group 
    JFrame j1=new JFrame();
    JRadioButton rb1=new JRadioButton("MALE");
    JRadioButton rb2=new JRadioButton("FEMALE");
    JRadioButton rb3=new JRadioButton("OTHER");
    ImageIcon img=new ImageIcon("logo.jpg"); 
    ButtonGroup group=new ButtonGroup(); //ButtonGroup will allow only one RadioButton to be selected at a time 
    MyFrame()
    {
        //radio button 
        j1.setVisible(true);
        j1.setLayout(new FlowLayout());
        j1.setSize(500,500); 
        j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);
        j1.setTitle("RADIO_BUTTON");
        j1.setIconImage(img.getImage());
        j1.setBackground(Color.BLACK);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        j1.add(rb1); 
        j1.add(rb2); 
        j1.add(rb3);  

        group.add(rb1); 
        group.add(rb2); 
        group.add(rb3); 

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rb1)
        {
            System.out.println("YOU ARE MALE!");
        }
        if(ae.getSource()==rb2)
        {
            System.out.println("YOU ARE FEMALE!");
        }
        if(ae.getSource()==rb3)
        {
            System.out.println("YOU ARE NOR MALE NOR FEMLAE!!");
        }
    }
}
public class radiobutton_awt
{
    public static void main(String[] args) 
    {
        MyFrame f1=new MyFrame(); 
    }
}
