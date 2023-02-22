package travel.managment.system;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class Payment extends JFrame implements ActionListener {
    JTextField t1, t2;
    Choice c1;
    JLabel l1,l2,l3,l4,l5,l10;
    JButton b1,b2;
    Payment(String username) {
		setBounds(300,60,960,550);   //300,60,960,600
                getContentPane().setBackground(Color.CYAN);  // white // 51,153,255
                setLayout(null);
                
                
                
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/managment/system/icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(500, 30, 500, 300);
        add(l10);
        
                
                
                
                JLabel l1 = new JLabel("username:");
		l1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		l1.setBounds(70, 90, 240, 23);   //118,11,160,53
		add(l1);
                
                t1 = new JTextField();
                t1.setBounds(250, 99, 240, 27);   //218, 20, 260, 33
                add(t1);   
               
              
                 JLabel l2 = new JLabel("Total Bill:");
		l2.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		l2.setBounds(70, 190, 100, 53);
		add(l2);
                
                t2 = new JTextField();
                t2.setBounds(250, 199, 240, 27);
                add(t2);   
                
                 
                JLabel l3 = new JLabel("Payment Mode");
		l3.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		l3.setBounds(70, 290, 160, 53);
		add(l3);
                
               
                 c1 = new Choice();
                c1.add("Cash");
                c1.add("Debit");
                c1.add("Credit");
                c1.setBounds(250, 310, 120, 30);
                add(c1);
               
                
                
                  b1 = new JButton("Submit");
		  b1.setBackground(Color.BLUE);
		  b1.setForeground(Color.WHITE);
                  b1.setBounds(118,410,120,30);
                  b1.addActionListener(this);
                  add(b1);
                  
                   b2 = new JButton("Close");
		  b2.setBackground(Color.BLUE);
		  b2.setForeground(Color.WHITE);
                  b2.setBounds(360,410,120,30);
                   b2.addActionListener(this);
                  add(b2);
                  
                  // retrive
                    try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookHotel where username = '+username+'");
           while(rs.next()){
               t1.setText(rs.getString("username"));
               t2.setText(rs.getString("totalbill"));  
               
   
           }
        
        }catch(Exception e){
        
        }
             
    }    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
          String username = t1.getText();
          String totalbill = t2.getText();
          String paymentmode = c1.getSelectedItem();
              String q = "insert into payment values('"+username+"','"+totalbill+"','"+paymentmode+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(q);
                
                JOptionPane.showMessageDialog(null, "Payment Done Succsessfully");
                setVisible(false);
            }catch(Exception e){
            e.printStackTrace();
            }     
            
        } else if(ae.getSource() == b2)
        {    
          this.setVisible(false);
        }
        }
    
    public static void main(String[] args){
        new Payment("").setVisible(true);
    }
}