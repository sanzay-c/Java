package Check_For_Voting_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class GUI {
    private static JLabel lblHeading, enterAge, show;
    private static JTextField age;
    private static JButton btnCheck;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        JPanel panel = new JPanel();

        panel.setLayout(null);
        
        lblHeading = new JLabel("Check for voting");
        lblHeading.setBounds(150, 10, 500, 20);

        enterAge = new JLabel("Enter age: ");
        enterAge.setBounds(100, 50, 150, 20);

        age = new JTextField();
        age.setBounds(200, 50, 100, 20);

        btnCheck = new JButton("Check");
        btnCheck.setBounds(150, 85, 100, 20);

        show = new JLabel();
        show.setBounds(130, 120, 500, 20);

        btnCheck.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int result = Integer.parseInt(age.getText());
                if (result <= 18){
                    show.setText("You are not eligible to vote.");
                }else{
                    show.setText("You are eligible to vote.");
                }
            }
        });

        panel.add(show);
        panel.add(age);
        panel.add(enterAge);
        panel.add(lblHeading);
        panel.add(btnCheck);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
