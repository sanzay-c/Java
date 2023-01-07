package Assignment;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;

public class GUI {
    private static JLabel heading ,userName, password;
    private static JTextField userText, userPassword;
    private static JButton submit, clear;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        JPanel panel = new JPanel();

        panel.setLayout(null);

        // creating JLabel for userName
        heading = new JLabel("-----LOGIN-----");
        heading.setBounds(255, 20, 150, 20);
        heading.setFont(new Font("Serif", Font.BOLD, 15));

        // creating JLabel for username
        userName = new JLabel("User Name: ");
        userName.setBounds(180, 50, 150, 60);

        // creatig JTextField for userneme
        userText = new JTextField();
        userText.setBounds(250, 70, 200, 20);

        // creating JLabel for Password
        password = new JLabel("Password: ");
        password.setBounds(180, 70, 150, 80);

        // creating JTextfield for password
        userPassword = new JTextField();
        userPassword.setBounds(250, 100, 200, 20);

        // creating JButton for submit
        submit = new JButton("Submit");
        submit.setBounds(200, 150, 100, 20);

        // creating JButtons for clear
        clear = new JButton("Clear");
        clear.setBounds(330, 150, 100, 20);

        // creating actionlistner for submitButton
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    if (userText.getText().length() <= 0 || userPassword.getText().length() <= 0){
                        JOptionPane.showMessageDialog(frame, "Plese enter a valid input", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        System.out.println(userText.getText());
                        System.out.println(userPassword.getText());
                        JOptionPane.showMessageDialog(frame, "Successfully Logged in.", "Logged in", JOptionPane.INFORMATION_MESSAGE);
                    }
                    clearTextField();
                } catch(Exception e){
                }
            }
        });

        // creating actionListner for clearButton
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                clearTextField();
            }
        });

        // Adding JLable 
        panel.add(heading);
        panel.add(userName);
        panel.add(password);

        // Adding TextField
        panel.add(userText);
        panel.add(userPassword);

        // Adding Buttons
        panel.add(submit);
        panel.add(clear);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
    public static void clearTextField(){
        userText.setText("");
        userPassword.setText("");
    }
}
