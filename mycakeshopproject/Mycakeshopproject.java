
package mycakeshopproject;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Mycakeshopproject {

    
    public static void main(String[] args) {
        
        JFrame frame =new JFrame();
        frame.setSize(1000,700);
        frame.setTitle("My Cakeshop");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
JLabel label1=new JLabel();
        Font f = new Font("Arial",Font.BOLD,25);
label1.setText("Creamenest");
label1.setBounds(450,0,300,60);
label1.setFont(f);
frame.add(label1);

JLabel label2 =new JLabel();
label2.setText("Select Cake Flavour:");
label2.setBounds(5,20,120,15);

        ButtonGroup group = new ButtonGroup();

       JRadioButton Chocolate = new JRadioButton("Chocolate");
Chocolate.setBounds(50,50,100,50);

       JRadioButton Vanilla = new JRadioButton("Vanilla");
Vanilla.setBounds(160,50,100,50);
 JRadioButton Strawberry = new JRadioButton("Strawberry");
Strawberry.setBounds(258,50,100,50);

frame.add(label2);

frame.add(Chocolate);

frame.add(Vanilla);
frame.add(Strawberry);
group.add(Chocolate);
group.add(Vanilla);
group.add(Strawberry);
JLabel label3= new JLabel();
label3.setText("Select Weight: ");
label3.setBounds(5,80,150,50);
frame.add(label3);
     ButtonGroup group1=new ButtonGroup();
        JCheckBox checkBox = new JCheckBox("Half Kg");
        checkBox.setBounds(20,110,100,25);
         JCheckBox checkBox2 = new JCheckBox("One Kg");
        checkBox2.setBounds(20,130,100,25);
        
       
        
frame.add(checkBox);
frame.add(checkBox2);
group1.add(checkBox);
group1.add(checkBox2);
       JLabel label4=new JLabel();
       label4.setText("Select Shape:");
       label4.setBounds(5 ,150,150,50);
        String [] s={"Square","Circle"};
       JComboBox comboBox=new JComboBox( s);
       comboBox.setBounds(20,185,100,30);

frame.add(label4);
frame.add(comboBox);
JLabel label5=new JLabel();
label5.setText("Write wishes:");
label5.setBounds(5,220,150,50);
frame.add(label5);
JTextField tf1=new JTextField();
tf1.setBounds(100,250,500,20);
frame.add(tf1);
JButton button = new JButton();
button.setText("Place order");
button.setBounds(500,300,150,60);
frame.add(button);
ImageIcon icon = new ImageIcon("img/img.jpeg");
JLabel image =new JLabel();
image.setBounds(650,100,200,80);
image.setIcon(icon);
frame.add(image);
    JLabel label6 = new JLabel();
        label6.setBounds(150, 280, 250, 20);
        frame.add(label6);
        
        
        
          button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 label6.setText("Your Order has been placed!");
            }
        });
    
frame.setVisible(true);

    } 
}


