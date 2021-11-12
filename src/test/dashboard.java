package test;

import javax.swing.*;
import javax.xml.namespace.QName;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class dashboard {
    private JPanel dashboardpanel;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dashboard Interface");
        frame.setContentPane(new dashboard().dashboardpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public dashboard(){

        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test");
            }
        });
    }
    public static void test(){

    }
}