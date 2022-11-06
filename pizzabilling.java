import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


 class pizzabilling extends JFrame implements ActionListener 
 {
     public static void main(String[] args) 
     {
        JFrame frame = new JFrame();
        JPanel basepanel = new JPanel();
        JLabel heading = new JLabel("Bistro Pizza Bill Calculator");
        JLabel orderNo = new JLabel("Order No:");
        JLabel custname = new JLabel("Customer Name:");
        JLabel quantity = new JLabel("Quantity:");
        JLabel rate = new JLabel("Rate:");
        JLabel amount = new JLabel("Amount:");
        JLabel costoftoppings = new JLabel("CostofToppings:");
        JLabel panellabel = new JLabel("Pizza Type");
        JLabel panellabel2 = new JLabel("Toppings");


        JTextField ordernotxt = new JTextField();
        JTextField custnametxt = new JTextField();
        JTextField quantitytxt = new JTextField();
        JTextField ratetxt = new JTextField();
        JTextField amounttxt = new JTextField();
        JTextField costtxt = new JTextField();

        JTextArea txtarea = new JTextArea();

        JButton generate = new JButton("Generate Bill");
        JButton clear = new JButton("Clear");

        //JPanel pizzatype = new JPanel();
        //JPanel top = new JPanel();

        basepanel.setLayout(null);
        basepanel.add(heading);
        basepanel.add(orderNo);
        basepanel.add(ordernotxt);
        basepanel.add(custname);
        basepanel.add(quantity);
        basepanel.add(custnametxt);
        basepanel.add(quantitytxt);
        basepanel.add(rate);
        basepanel.add(amount);
        basepanel.add(costoftoppings);
        basepanel.add(ratetxt);
        basepanel.add(amounttxt);
        basepanel.add(costtxt);
        basepanel.add(panellabel);
        basepanel.add(panellabel2);
        basepanel.add(generate);
        basepanel.add(clear);
        basepanel.add(txtarea);




       // JLabel starts
        Dimension size = heading.getPreferredSize();
        heading.setFont(new Font("Verdana",Font.ITALIC,14));
        heading.setForeground(Color.blue);
        heading.setSize(15,15);
        heading.setBounds(150,10,200,size.height);

        Dimension size1 = orderNo.getPreferredSize();
        orderNo.setBounds(20,40,size1.width,size1.height);
        orderNo.setFont(new Font("Verdana",Font.PLAIN,10));

        Dimension size2 = orderNo.getPreferredSize();
        custname.setBounds(20,70,100, size2.height);
        custname.setFont(new Font("Verdana",Font.PLAIN,10));

        quantity.setBounds(20,100,100,size2.height);
        quantity.setFont(new Font("Verdana",Font.PLAIN,10));

        rate.setBounds(230,40,70,size1.height);
        rate.setFont(new Font("Verdana",Font.PLAIN,10));

        amount.setBounds(230,70,70,size1.height);
        amount.setFont(new Font("Verdana",Font.PLAIN,10));

        costoftoppings.setBounds(230,100,100,size1.height);
        costoftoppings.setFont(new Font("Verdana",Font.PLAIN,10));

        panellabel.setBounds(30,150,100,size1.height);
        panellabel.setFont(new Font("Verdana",Font.BOLD,12));

        panellabel2.setBounds(230,150,100,size1.height);
        panellabel2.setFont(new Font("Verdana",Font.BOLD,12));

      // Jlabel Ends

      // Jtextfield starts
        Dimension textsize = ordernotxt.getPreferredSize();
        ordernotxt.setBounds(120,40,70,textsize.height);

        custnametxt.setBounds(120,70,70,textsize.height);

        quantitytxt.setBounds(120,100,70,textsize.height);

        ratetxt.setBounds(300,40,70,textsize.height);

        amounttxt.setBounds(300,70,70,textsize.height);

        costtxt.setBounds(350,100,70,textsize.height);


      // Jtextfield ends

      // JPanel starts
        JRadioButton panpizza = new JRadioButton("Pan Pizza");
        JRadioButton stuffed = new JRadioButton("Stuffed Crust");
        JRadioButton regular = new JRadioButton("Regular");
        ButtonGroup group = new ButtonGroup();
        group.add(panpizza);
        group.add(stuffed);
        group.add(regular);
        basepanel.add(panpizza);
        basepanel.add(stuffed);
        basepanel.add(regular);
        //frame.add(group);
        //pizzatype.setBounds(30,150,200,150);
        Dimension pizza = panpizza.getPreferredSize();
        panpizza.setBounds(30,170,pizza.width,pizza.height);
        stuffed.setBounds(30,200,pizza.width,pizza.height);
        regular.setBounds(30,230,pizza.width,pizza.height);



        JCheckBox onion = new JCheckBox("Onion");
        JCheckBox cheese = new JCheckBox("Cheese");
        JCheckBox tomato = new JCheckBox("Tomato");
        JCheckBox babycorn = new JCheckBox("Baby corn");

        onion.setBounds(230,170,100,30);
        cheese.setBounds(230,190,100,30);
        tomato.setBounds(230,210,100,30);
        babycorn.setBounds(230,230,100,30);

        basepanel.add(onion);
        basepanel.add(cheese);
        basepanel.add(tomato);
        basepanel.add(babycorn);

        //top.setBounds(230,150,200,150);

       

      // JPanel ends

      // JButton starts

        generate.setBounds(30,300,100,30);
        clear.setBounds(230,300,100,30);
        
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(clear.isSelected())
                {
                    txtarea.setText("");
                }
            }
        });

      // JButton ends

      // Textarea starts

        txtarea.setBounds(30,350,400,300);

      // Textarea ends
        //clear.addActionListener(this);



        frame.getContentPane().add(basepanel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int or_no = Integer.parseInt(ordernotxt.getText());
                String cust = custnametxt.getText();
                int qty = Integer.parseInt(quantitytxt.getText());
                double rate = 0;

                if (panpizza.isSelected()) {
                    rate = 200;
                }
                else if (stuffed.isSelected()) {
                    rate = 300;
                }
                else if (regular.isSelected()) {
                    rate = 150;
                }

                ratetxt.setText(""+rate);

                double topamt = 0;

                if (onion.isSelected()) {
                    topamt = 60;
                }
                if (cheese.isSelected()) {
                    topamt = topamt + 30;
                }
                if (tomato.isSelected()) {
                    topamt = topamt + 40;
                }
                if (babycorn.isSelected()) {
                    topamt = topamt + 50;
                }

                costtxt.setText(""+topamt);

                double totalpayable = (rate * qty) + topamt;
                amounttxt.setText(""+totalpayable);

                txtarea.setText(("Hello, your Order Id is: " + or_no + "\nName: " + cust
                        + "\nAMOUNT PAYABLE IS: " + totalpayable));


            }
        });
    }
     @Override
     public void actionPerformed(ActionEvent e) {

     }
 }