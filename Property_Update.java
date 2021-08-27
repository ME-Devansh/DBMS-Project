package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Property_Update implements ActionListener {

    JFrame frame;
    JButton button1;
    JLabel rn_label,sd_label,ag_label,hello;
    JTextField rn_text,sd_text,ag_text;
    Property_Update(){
        hello = new JLabel();
        hello.setText("Enter the required details");
        hello.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 30));
        hello.setBounds(20,50,600,30);
        hello.setForeground(Color.white);


        ag_label = new JLabel();
        ag_label.setText("Agent Id : ");
        ag_label.setBounds(20,100,175,30);
        ag_label.setForeground(Color.white);

        rn_label = new JLabel();
        rn_label.setText("Registration Number :");
        rn_label.setBounds(20,200,175,30);
        rn_label.setForeground(Color.white);

        sd_label = new JLabel();
        sd_label.setText("Selling Date :");
        sd_label.setBounds(20,300,175,30);
        sd_label.setForeground(Color.white);

        ag_text = new JTextField();
        ag_text.setBounds(200,100,200,30);

        sd_text = new JTextField();
        sd_text.setBounds(200,300,200,30);

        rn_text = new JTextField();
        rn_text.setBounds(200,200,200,30);

        button1 = new JButton();
        button1.setBounds(175,375,100,30);
        button1.setText("Submit");
        button1.addActionListener(this);

        frame = new JFrame();
        frame.setTitle("Property Update");
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(hello);
        frame.add(button1);
        frame.add(ag_label);
        frame.add(rn_label);
        frame.add(sd_label);
        frame.add(ag_text);
        frame.add(rn_text);
        frame.add(sd_text);

        frame.getContentPane().setBackground(Color.black);
        frame.setLocation(400, 100);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==button1){
            String reg_num,sel_date,agent_id;
            agent_id = ag_text.getText();
            reg_num = rn_text.getText();
            sel_date = sd_text.getText();
            new SQL_Updates(agent_id,reg_num,sel_date);
        }
    }
}