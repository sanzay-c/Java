package Square_Calculator_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class GUI {
    private static JLabel lblHeading, enterNumber, enteredNumber;
    private static JTextField convert, converted;
    private static JButton btnConvert;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        JPanel panel = new JPanel();

        panel.setLayout(null);
        
        lblHeading = new JLabel("Example to convert a number");
        lblHeading.setBounds(150, 10, 500, 20);

        enterNumber = new JLabel("Enter a number: ");
        enterNumber.setBounds(100, 50, 150, 20);

        convert = new JTextField();
        convert.setBounds(200, 50, 100, 20);

        btnConvert = new JButton("Calculate ");
        btnConvert.setBounds(150, 85, 100, 20);

        enteredNumber = new JLabel("Square is:");
        enteredNumber.setBounds(100, 120, 100, 20);

        converted = new JTextField();
        converted.setBounds(200, 120, 100, 20);

        btnConvert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {

                double number = Double.parseDouble(convert.getText());
                double square = (number * number);
                String str1 = String .valueOf(square);
                converted.setText(str1);

            }
        });

        panel.add(converted);
        panel.add(convert);
        panel.add(enteredNumber);
        panel.add(enterNumber);
        panel.add(lblHeading);
        panel.add(btnConvert);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
