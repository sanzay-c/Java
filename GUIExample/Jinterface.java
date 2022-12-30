package GUIExample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JTextField;

public class Jinterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("VS Intl College");
        JPanel panel = new JPanel();

        JLabel lblName = new JLabel("Name");
        JLabel lblForClear = new JLabel("Clear");
        JLabel lblForButtonOne = new JLabel("Button One");
        JLabel lblForButtonTwo = new JLabel("Button Two");

        JTextField textFieldName = new JTextField();
        
        JButton button = new JButton("Submit");
        JButton clearButton = new JButton("Clear");
        JButton buttonOne = new JButton("Button One");
        JButton buttonTwo = new JButton("Button Two");


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println(textFieldName.getText());
            }
        });
        
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                textFieldName.setText("");
            }
        });
        
        buttonOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                textFieldName.setText("Ram");
            }
        });
        
        buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                textFieldName.setText("Hari");
            }
        });

        panel.add(lblName);
        panel.add(textFieldName);
        panel.add(button);
        
        panel.add(lblForClear);
        panel.add(lblForButtonOne);
        panel.add(lblForButtonTwo);
        panel.add(clearButton);
        panel.add(buttonOne);
        panel.add(buttonTwo);


        panel.setLayout(new GridLayout(3, 5));
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
