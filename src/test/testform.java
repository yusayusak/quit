package test;
import java.time.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class testform {
    private JTextField GetAge;
    private JLabel Name;
    private JTextField GetName;
    private JLabel Age;
    private JPanel Applicatiescherm;
    private JButton Submit;
    private JTextField Geboortedatum;
    private JTextField Invulemail;
    private JLabel emailadress;
    private JTextField passwordfield;
    private JLabel inputPassword;

    public testform() {
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = GetName.getText();
                String dob = Geboortedatum.getText();
                String email = Invulemail.getText();
                String wachtwoord = inputPassword.getText();
                String split[] = dob.split("/");
                LocalDate datum = LocalDate.of(Integer.parseInt(split[2]), Integer.parseInt(split[1]), Integer.parseInt(split[0]));
                if (!(name.equals(" ")) && (!(dob.equals(" "))) && (!(email.equals(" ")) && (!(wachtwoord.equals(" "))))){
                    dashboard dashboard = new dashboard();
                }
            }
        });
    }

public static void main(String[] args) {
    JFrame frame = new JFrame("Interface Applicatie");
    frame.setContentPane(new testform().Applicatiescherm);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}

private void createUIComponents() {
    // TODO: place custom component creation code here
    }
}
