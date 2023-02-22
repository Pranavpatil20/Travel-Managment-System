
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.managment.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.awt.Color;

import net.proteanit.sql.*;
/**
 *
 * @author admin
 */
public class AllReport extends JFrame implements ActionListener{
    
    
    JButton b1,b2, b3, b4,b5,b6;
    
    
    AllReport(){
        
        JLabel l10 = new JLabel("ALL REPORT");
         l10.setFont(new Font("Tahoma", Font.BOLD, 20));
        l10.setBounds(220,10,400,30);
        l10.setForeground(Color.red);
        add(l10);
        
       // all buttons...
        
        b1 = new JButton("Customer Report");
        b1.setBounds(200,100, 150, 30);   // 300, 600, 150, 30
        b1.addActionListener(this);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.black);
        add(b1);
        
        
         b2 = new JButton("Package Report");
        b2.setBounds(200,150, 150, 30);   // 300, 600, 150, 30
        b2.addActionListener(this);
        b2.setBackground(Color.GREEN);
         b2.setForeground(Color.black);
        add(b2);
        
         b3 = new JButton("Hotel Report");
        b3.setBounds(200,200, 150, 30);   // 300, 600, 150, 30
        b3.addActionListener(this);
        b3.setBackground(Color.GREEN);
         b3.setForeground(Color.black);
        add(b3);
        
        b5 = new JButton("Payment Report");
        b5.setBounds(200,250, 150, 30);   // 300, 600, 150, 30
        b5.addActionListener(this);
        b5.setBackground(Color.GREEN);
         b5.setForeground(Color.black);
        add(b5);
        
        b6 = new JButton("Most use package Report");
        b6.setBounds(200,300, 150, 30);   // 300, 600, 150, 30
        b6.addActionListener(this);
        b6.setBackground(Color.GREEN);
        b6.setForeground(Color.black);
        add(b6);
        
         b4 = new JButton("Back");
        b4.setBounds(200,350, 150, 30);
         b4.addActionListener(this);
         b4.setBackground(Color.LIGHT_GRAY);
          b4.setForeground(Color.BLACK);
       add(b4);
        
        setLayout(null);
        setBounds(230,60,600,500);//230,60,1100, 700
          getContentPane().setBackground(Color.CYAN);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            new customerReport().setVisible(true);
        }  
        else if(ae.getSource()==b2){
           new packageReport().setVisible(true);
        }
         else if(ae.getSource()==b3){
           new hotelReport().setVisible(true);
         }
         else if(ae.getSource()==b5){
           new paymentReport().setVisible(true);
         }
         else if(ae.getSource()==b6){
           new Mostusepackage().setVisible(true);
         }
        else if(ae.getSource()==b4){
           this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new AllReport().setVisible(true);
    }
}