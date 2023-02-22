
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
public class packageReport extends JFrame implements ActionListener{
    
    JLabel l10;
    JTable t1;
    JButton b1,b2;
    
    
    packageReport(){
        
        JLabel l10 = new JLabel("Package Details Report");
         l10.setFont(new Font("Tahoma", Font.BOLD, 20));
        l10.setBounds(440,10,400,30);
        l10.setForeground(Color.red);
        add(l10);
        
        
        t1=new JTable();
        t1.setBounds(0,80,1040,500);
        t1.setBackground(Color.YELLOW);
        add(t1);
        
        //username,  package,  persons | id       | number     | phone      | price
        
        
        JLabel l1 = new JLabel("Username ");
        l1.setBounds(30,50,70,20);
        add(l1);
        
         JLabel l2 = new JLabel("Package");
        l2.setBounds(150,50,70,20);
        add(l2);
        
         JLabel l3 = new JLabel("Persons");
        l3.setBounds(330,50,70,20);
        add(l3);
        
         JLabel l4 = new JLabel("Id");
        l4.setBounds(450,50,70,20);
        add(l4);
        
         JLabel l5 = new JLabel("Number");
        l5.setBounds(640,50,70,20);
        add(l5);
       
         JLabel l6 = new JLabel("Phone");
        l6.setBounds(750,50,70,20);
        add(l6);
        
        JLabel l7 = new JLabel("Price");
        l7.setBounds(900,50,70,20);
        add(l7);
        
        
        
        
        
        b1 = new JButton("Load Data");
        b1.setBounds(300,600, 130, 30);
        b1.addActionListener(this);
        b1.setBackground(Color.CYAN);
        b1.setForeground(Color.black);
        add(b1);
        
         b2 = new JButton("Back");
        b2.setBounds(500,600, 130, 30);
         b2.addActionListener(this);
         b2.setBackground(Color.CYAN);
        b2.setForeground(Color.black);
       add(b2);
        
        setLayout(null);
        setBounds(230,60,1100,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            try{
               Conn c = new Conn(); 
               String str = "select *from bookpackage";
               ResultSet rs = c.s.executeQuery(str);
               
               t1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e)
            {
                
            }
            
            
        }else if(ae.getSource()==b2){
           this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new packageReport().setVisible(true);
    }
}