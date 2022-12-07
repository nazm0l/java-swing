

package com.mycompany.swingpackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class SwingPackage extends JFrame implements ActionListener{
    JButton verifyBtn, exitBtn;
    JLabel show;
    JTextField data;
    
    public SwingPackage(){
        setSize(300, 240);
        setTitle("Verify Data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        verifyBtn = new JButton("Verify");
        exitBtn = new JButton("Exit");
        
        data = new JTextField(10);
        
        show = new JLabel("Number");
        show.setHorizontalAlignment(JLabel.CENTER);
        
        add(show);
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new java.awt.GridLayout(3, 5,5,5));
        bottomPanel.add(data);
        bottomPanel.add(verifyBtn);
        bottomPanel.add(exitBtn);
        
        
        add(bottomPanel, BorderLayout.SOUTH);
        
        verifyBtn.addActionListener(this);
        exitBtn.addActionListener(this);
        data.addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ev){
        JButton sourceButton = (JButton)ev.getSource();
//        JTextField sourceData = (JTextField)ev.getSource();
        if(verifyBtn==sourceButton){
                int random = (int)(Math.random()*100);
                show.setText("Random: "+ random);
            }else if(exitBtn == sourceButton){
            System.exit(0);
        }
    };
    
 
    
     public static void main(String args[]) {
        new SwingPackage().setVisible(true);
    }
}
