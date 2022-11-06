import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class MyFrame extends JFrame implements ActionListener
{
    //combobox combine button in a drop down list 
    JFrame j1=new JFrame(); 
    JComboBox cb1;
    String [] food={"pizza","burger","noodles"}; 
    MyFrame()
    {
        j1.setVisible(true);
        j1.setLayout(new FlowLayout());
        j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);
        j1.setSize(500,500);
        j1.setTitle("COMBO BOX");
        cb1 = new JComboBox<>(food);
        cb1.setVisible(true);
        cb1.addActionListener(this);
        cb1.setEditable(true); //allows user to type required thing in box of ComboBox instead of selecting it by drop down 
        cb1.addItem("horse");//adds item to ComboBox
        cb1.insertItemAt("PIG",0); //inserts item at selected index 
        cb1.removeItem("PIG");//removes item from ComboBox
        cb1.remove(1); //removes item from certain index
        j1.add(cb1);  
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==cb1)
        {
            System.out.println(cb1.getSelectedItem());
        }
    }
}
public class combobox_awt
{
    public static void main(String[] args)
    {
        MyFrame f1=new MyFrame(); 
    }
}
