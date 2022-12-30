package GUI;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

public class FlowLayout {
    private static JLabel lblHeading;
    private static JLabel lblName;
    private static JLabel lblAge;
    private static JLabel lblAddress;
    private static JLabel lblPhoneNumber;
    private static JLabel lblCheckBoxOne;
    private static JLabel lblCheckBoxTwo;
    private static JTextField txtBoxName;
    private static JTextField txtBoxAge;
    private static JTextField txtBoxAddress;
    private static JTextField txtBoxPhoneNumber;
    private static JCheckBox chkBoxReading;
    private static JCheckBox chkBoxWriting;
    private static JCheckBox chkBoxSports;
    private static JRadioButton rBtnMale;
    private static JRadioButton rBtnFemale;
    private static JButton btnSubmit;
    private static JButton btnClear;
    private static ButtonGroup btnGroup;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        JPanel panel = new JPanel();

        panel.setLayout(null);

        /**
         * setBounds methods helps to set position and size,
         * .setBounds(x-coordinate, y-coordinate, width, height);
         * here(x,y) are cordinated from the top left.
         */
        // Creating labels for heading, name, age, address, phonenumber, checkboxone and checkboxtwo.
        lblHeading = new JLabel("Welcome to Student Management System.");
        lblHeading.setBounds(145, 20, 460, 20);
        lblHeading.setFont(new Font("Serif", Font.BOLD, 15));

        lblName = new JLabel("Name");
        lblName.setBounds(20, 50, 100, 20);

        lblAge = new JLabel("Age");
        lblAge.setBounds(320, 50, 100, 20);

        lblAddress = new JLabel("Address");
        lblAddress.setBounds(20, 120, 100, 20);

        lblPhoneNumber = new JLabel("Phone Number");
        lblPhoneNumber.setBounds(320, 120, 100, 20);

        lblCheckBoxOne = new JLabel("Interests: ");
        lblCheckBoxOne.setBounds(20, 180, 100, 10);

        lblCheckBoxTwo = new JLabel("Gender: ");
        lblCheckBoxTwo.setBounds(20, 230, 100, 20);

        // Creating textfield for name, age, address, phonenumber.
        txtBoxName = new JTextField();
        txtBoxName.setBounds(20, 80, 200, 20);

        txtBoxAge = new JTextField();
        txtBoxAge.setBounds(320, 80, 200, 20);

        txtBoxAddress = new JTextField();
        txtBoxAddress.setBounds(20, 150, 200, 20);

        txtBoxPhoneNumber = new JTextField();
        txtBoxPhoneNumber.setBounds(320, 150, 200, 20);

        // Creating checkbox for reading, writing, sports.
        chkBoxReading = new JCheckBox("Reading");
        chkBoxReading.setBounds(20, 200, 100, 20);

        chkBoxWriting = new JCheckBox("Writing");
        chkBoxWriting.setBounds(140, 200, 100, 20);

        chkBoxSports = new JCheckBox("Sports");
        chkBoxSports.setBounds(260, 200, 100, 20);

        // Creating radiobuttons for male and female.
        rBtnMale = new JRadioButton("Male");
        rBtnMale.setBounds(20, 250, 100, 20);

        rBtnFemale = new JRadioButton("Female");
        rBtnFemale.setBounds(320, 250, 100, 20);

        // Creating buttongroup for male and female so that only one can be selected.
        btnGroup = new ButtonGroup();
        btnGroup.add(rBtnMale);
        btnGroup.add(rBtnFemale);

        // Creating buttons to submit.
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(130, 280, 100, 20);

        // Creating buttons to clear.
        btnClear = new JButton("Clear");
        btnClear.setBounds(330, 280, 100, 20);

        // Adding labels in panel.
        panel.add(lblHeading);
        panel.add(lblName);
        panel.add(lblAge);
        panel.add(lblAddress);
        panel.add(lblPhoneNumber);
        panel.add(lblCheckBoxOne);
        panel.add(lblCheckBoxTwo);

        // Adding textBox in panel.
        panel.add(txtBoxName);
        panel.add(txtBoxAge);
        panel.add(txtBoxAddress);
        panel.add(txtBoxPhoneNumber);
        
        // Adding checkbox in panel.
        panel.add(chkBoxReading);
        panel.add(chkBoxWriting);
        panel.add(chkBoxSports);
        
        // Addding radio buttons in panel. 
        panel.add(rBtnMale);
        panel.add(rBtnFemale);

        /**
         * Creating .addActionListner event for Submit button to submit.
         */
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = txtBoxName.getText();
                int age = 0;
                try{
                    age = Integer.parseInt(txtBoxAge.getText());
                } catch(Exception e){
                    JOptionPane.showMessageDialog(frame, "Plese enter a valid age", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                chkBoxReading.isSelected();
                String address = txtBoxAddress.getText();
                String phoneNumber = txtBoxPhoneNumber.getText();

                Person person = new Person(age, name, address, phoneNumber);
                System.out.println(person.toString());
                clearTextField();

                /**
                 * JOptionpane is methods for creating and customizing modal dialog boxes,
                 * The JOptionPane displays the dialog boxes with one of the four standard icons (question, information, warning, and error).
                 */
                JOptionPane.showMessageDialog(frame, person.toString(),"Person Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        /**
         * Creating .addActionListner event for Clear Button to clear the text field.
         */
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                clearTextField();
            }
        });

        // Adding buttons in panel.
        panel.add(btnSubmit);
        panel.add(btnClear);

        // Adding panel in frame
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        
        /**
         * Setting the width and height of frame.
         * frame.setSize(width, height);
         */
        frame.setSize(600, 400);
        // Setting the frame visibility to true
        frame.setVisible(true);
    }

    public static void clearTextField() {
        txtBoxName.setText("");
        txtBoxAge.setText("");
        txtBoxAddress.setText("");
        txtBoxPhoneNumber.setText("");
        btnGroup.clearSelection();
        chkBoxReading.setSelected(false);
        chkBoxWriting.setSelected(false);
        chkBoxSports.setSelected(false);
    }
}