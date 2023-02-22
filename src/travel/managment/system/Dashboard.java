package travel.managment.system;

import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13, b14,b15,b16,b17;
    String username;

    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1950,60);
       //p1.setForeground(Color.white);
       p1.setBackground(Color.CYAN);
      //  p1.setBackground(new Color(51,153,255));
        add(p1);
        
        
      ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/managment/system/icons/home.png"));
       Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
      ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
      l2.setBounds(0, 0, 70, 70);
       p1.add(l2);
        
        
       JLabel l3  = new  JLabel("Dashboard");
       l3.setFont(new Font("Tahoma", Font.BOLD, 30));
       l3.setForeground(Color.black);
       l3.setBounds(80,10,300,40);
       p1.add(l3);
       
       /*
       JLabel l5  = new  JLabel("Holiday Management System");
       l5.setFont(new Font("Tahoma", Font.PLAIN, 60));
       l5.setForeground(Color.BLUE);
       l5.setBounds(100,60,400,50);
       p1.add(l5);
*/
       
       
       JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,60,300,1000);
        p2.setBackground(new Color(0, 0, 102));
        add(p2);
        
        b1 = new JButton("Add Customer Detail");
        b1.setBackground(Color.GREEN);
        //b1.setBackground(new Color(0,0,102));
        b1.setFont(new Font("Tahoma", Font.PLAIN,20));
        b1.setForeground(Color.black);
        b1.setMargin(new Insets(0,0,0,50));
        b1.setBounds(0, 10, 300, 40);
        b1.addActionListener(this);
        p2.add(b1);
       
        b2 = new JButton("Update Customer Detail");
        b2.setBackground(Color.GREEN);
        //b2.setBackground(new Color(0,0,102));
        b2.setFont(new Font("Tahoma", Font.PLAIN,20));
        b2.setForeground(Color.black);
         b2.setMargin(new Insets(0,0,0,50));
        b2.setBounds(0, 50, 300, 40);
        b2.addActionListener(this);
        p2.add(b2);
       
        b3 = new JButton("View Customer Details");
        b3.setBackground(Color.GREEN);
        //b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Tahoma", Font.PLAIN,20));
        b3.setForeground(Color.black);
        b3.setMargin(new Insets(0,0,0,50));
        b3.setBounds(0, 90, 300, 40);
        b3.addActionListener(this);
        p2.add(b3);
       
         b4 = new JButton("Delete Customer Detail");
         b4.setBackground(Color.GREEN);
        //b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Tahoma", Font.PLAIN,20));
        b4.setForeground(Color.black);
         b4.setMargin(new Insets(0,0,0,50));
        b4.setBounds(0,130, 300, 40);
          b4.addActionListener(this);
       p2.add(b4);
       
         b5 = new JButton("Show Package");
         b5.setBackground(Color.red);
        //b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma", Font.PLAIN,20));
        b5.setForeground(Color.black);
         b5.setMargin(new Insets(0,0,0,50));
        b5.setBounds(0, 170, 300, 40);
        b5.addActionListener(this);
       p2.add(b5);
       
          b6 = new JButton("Book Package");
          b6.setBackground(Color.red);
        //b6.setBackground(new Color(0,0,102));
        b6.setFont(new Font("Tahoma", Font.PLAIN,20));
        b6.setForeground(Color.black);
         b6.setMargin(new Insets(0,0,0,50));
        b6.setBounds(0, 210, 300, 40);
        b6.addActionListener(this);
       p2.add(b6);
       
          b7 = new JButton("View Package");
          b7.setBackground(Color.red);
        //b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma", Font.PLAIN,20));
        b7.setForeground(Color.black);
         b7.setMargin(new Insets(0,0,0,50));
        b7.setBounds(0, 250, 300, 40);
        b7.addActionListener(this);
        p2.add(b7);
       
       
          b8 = new JButton("View Hotels");
          b8.setBackground(Color.ORANGE);
        //b8.setBackground(new Color(0,0,102));
        b8.setFont(new Font("Tahoma", Font.PLAIN,20));
        b8.setForeground(Color.black);
         b8.setMargin(new Insets(0,0,0,50));
        b8.setBounds(0, 290, 300, 40);
        b8.addActionListener(this);
       p2.add(b8);
       
       
          b9 = new JButton("Book Hotel");
          b9.setBackground(Color.ORANGE);
        //b9.setBackground(new Color(0,0,102));
        b9.setFont(new Font("Tahoma", Font.PLAIN,20));
        b9.setForeground(Color.black);
         b9.setMargin(new Insets(0,0,0,50));
        b9.setBounds(0, 330, 300, 40);
         b9.addActionListener(this);
       p2.add(b9);
       
          b10 = new JButton("View Booked Hotel");
          b10.setBackground(Color.ORANGE);
        //b10.setBackground(new Color(0,0,102));
        b10.setFont(new Font("Tahoma", Font.PLAIN,20));
        b10.setForeground(Color.black);
         b10.setMargin(new Insets(0,0,0,50));
        b10.setBounds(0, 370, 300, 40);
        b10.addActionListener(this);
       p2.add(b10);
       
          b11 = new JButton("Destinations");
          b11.setBackground(Color.magenta);
        //b11.setBackground(new Color(0,0,102));
        b11.setFont(new Font("Tahoma", Font.PLAIN,20));
        b11.setForeground(Color.black);
         b11.setMargin(new Insets(0,0,0,50));
        b11.setBounds(0, 410, 300, 40);
        b11.addActionListener(this);
       p2.add(b11);
       
       
          b12 = new JButton("Payment");
          b12.setBackground(Color.magenta);
        //b12.setBackground(new Color(0,0,102));
        b12.setFont(new Font("Tahoma", Font.PLAIN,20));
        b12.setForeground(Color.black);
         b12.setMargin(new Insets(0,0,0,50));
        b12.setBounds(0, 450, 300, 40);
         b12.addActionListener(this);
       p2.add(b12);
       
       
          b13 = new JButton("Calculator");
          b13.setBackground(Color.magenta);
        //b13.setBackground(new Color(0,0,102));
        b13.setFont(new Font("Tahoma", Font.PLAIN,20));
        b13.setForeground(Color.black);
         b13.setMargin(new Insets(0,0,0,50));
        b13.setBounds(0, 490, 300, 40);
        b13.addActionListener(this);
       p2.add(b13);
       
          b14 = new JButton("Notepad");
          b14.setBackground(Color.LIGHT_GRAY);
        //b14.setBackground(new Color(0,0,102));
        b14.setFont(new Font("Tahoma", Font.PLAIN,20));
        b14.setForeground(Color.black);
         b14.setMargin(new Insets(0,0,0,50));
        b14.setBounds(0, 530, 300, 40);
         b14.addActionListener(this);
       p2.add(b14);
       
         b15 = new JButton("About");
         b15.setBackground(Color.LIGHT_GRAY);
        //b15.setBackground(new Color(0,0,102));
        b15.setFont(new Font("Tahoma", Font.PLAIN,20));
        b15.setForeground(Color.black);
         b15.setMargin(new Insets(0,0,0,50));
        b15.setBounds(0, 570, 300, 40);
        b15.addActionListener(this);
       p2.add(b15);
       
       // reports
       
        b16 = new JButton("Reports");
        b16.setBackground(Color.LIGHT_GRAY);
        //b16.setBackground(new Color(0,0,102));
        b16.setFont(new Font("Tahoma", Font.PLAIN,20));
        b16.setForeground(Color.black);
         b16.setMargin(new Insets(0,0,0,50));
        b16.setBounds(0, 600, 300, 40);
        b16.addActionListener(this);
       p2.add(b16);
       
       //close
       
       b17 = new JButton("Close");
       b17.setBackground(Color.LIGHT_GRAY);
        //b17.setBackground(new Color(0,0,102));
        b17.setFont(new Font("Tahoma", Font.PLAIN,20));
        b17.setForeground(Color.black);
         b17.setMargin(new Insets(0,0,0,50));
        b17.setBounds(0, 630, 300, 40);
        b17.addActionListener(this);
       p2.add(b17);
       
      
       
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/managment/system/icons/beach1.jpeg")); //the-red-fort-delhi.jpg
        Image i2 = i1.
                getImage().getScaledInstance(1600, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1600, 750);
        add(l1);
        
         JLabel l4  = new  JLabel("Holiday Management System");
       l4.setFont(new Font("Tahoma", Font.PLAIN, 60));
       l4.setForeground(Color.BLUE);
       l4.setBounds(500,60,1000,70);
       l1.add(l4);
        
        
    }
  
    public void actionPerformed(ActionEvent ae){
         
            if(ae.getSource() == b13){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){}
            }else if(ae.getSource() == b14){
               try{ 
                    Runtime.getRuntime().exec("notepad.exe");
               }catch (Exception e){}
            }else if(ae.getSource() == b1){
                new AddCustomer(username).setVisible(true);
            }else if(ae.getSource() == b2){
                new UpdateCustomer(username).setVisible(true);
            }else if(ae.getSource() == b3){
                new ViewCustomers(username).setVisible(true);   
            }else if(ae.getSource() == b5){
                new CheckPackage().setVisible(true);
            }else if(ae.getSource() == b6){
                new BookPackage(username).setVisible(true);
            }else if(ae.getSource() == b7){
                new ViewPackage(username).setVisible(true);
            }else if(ae.getSource() == b11){
                new Destination().setVisible(true);
            }else if(ae.getSource() == b8){
             new CheckHotels ().setVisible(true);
            }else if(ae.getSource() == b9){
              new BookHotel(username).setVisible(true);  
            }else if(ae.getSource() == b10){
              new ViewBookedHotel(username).setVisible(true);  
            }else if(ae.getSource() == b12){
                new Payment(username).setVisible(true);
            }else if(ae.getSource() == b15){
                new About().setVisible(true);
            }else if(ae.getSource() == b4){
                new DeleteCustomer(username).setVisible(true);
    }else if(ae.getSource() == b16){
                new AllReport().setVisible(true);
    }else if(ae.getSource() == b17){
                setVisible(false);   
    }
    }
    public static void main(String[] args){
        new Dashboard("").setVisible(true);
    }
}