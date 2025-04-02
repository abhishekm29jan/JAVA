package OOPs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class project extends JFrame implements ActionListener {
    private JTextField nameField, jeeRankField, mark12Field, mark10Field, fatherNameField, collegeNameField, schoolNameField,
            jeeRollNumberField, addressField, postField, blockField, distField, stateField, pinCodeField,
            mobileNumberField, dobField, photoPathField;
    private JComboBox<String> admissionTypeComboBox;

    public project() {
        setTitle("Admission Form - Sambalpur University");
        setSize(2000, 2000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(19, 2));

        add(new JLabel("Candidate Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Date of Birth (DD-MM-YYYY):"));
        dobField = new JTextField();
        add(dobField);

        add(new JLabel("JEE Main Rank:"));
        jeeRankField = new JTextField();
        add(jeeRankField);

        add(new JLabel("12th Marks(%)/Diploma mark(%):"));
        mark12Field = new JTextField();
        add(mark12Field);

        add(new JLabel("10th Marks(%):"));
        mark10Field = new JTextField();
        add(mark10Field);

        add(new JLabel("Father's Name:"));
        fatherNameField = new JTextField();
        add(fatherNameField);

        add(new JLabel("College Name:"));
        collegeNameField = new JTextField();
        add(collegeNameField);

        add(new JLabel("10th School Name:"));
        schoolNameField = new JTextField();
        add(schoolNameField);

        add(new JLabel("JEE Main Roll Number:"));
        jeeRollNumberField = new JTextField();
        add(jeeRollNumberField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        add(new JLabel("Post:"));
        postField = new JTextField();
        add(postField);

        add(new JLabel("Block:"));
        blockField = new JTextField();
        add(blockField);

        add(new JLabel("District:"));
        distField = new JTextField();
        add(distField);

        add(new JLabel("State:"));
        stateField = new JTextField();
        add(stateField);

        add(new JLabel("Pin Code:"));
        pinCodeField = new JTextField();
        add(pinCodeField);

        add(new JLabel("Mobile Number:"));
        mobileNumberField = new JTextField();
        add(mobileNumberField);

        add(new JLabel("Admission Type:"));
        admissionTypeComboBox = new JComboBox<>(new String[]{"BTech", "MTech", "Lateral Entry BTech"});
        add(admissionTypeComboBox);

        add(new JLabel("Photo Path:"));
        photoPathField = new JTextField();
        add(photoPathField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        add(clearButton);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            String fileName = "AppliedStudent.txt";
            String selectedFileName = "SelectedStudents.txt";

            String name = nameField.getText();
            String dob = dobField.getText();
            String jeeRank = jeeRankField.getText();
            String mark12 = mark12Field.getText();
            String mark10 = mark10Field.getText();
            String fatherName = fatherNameField.getText();
            String collegeName = collegeNameField.getText();
            String schoolName = schoolNameField.getText();
            String jeeRollNumber = jeeRollNumberField.getText();
            String address = addressField.getText() + ", " + postField.getText() + ", " + blockField.getText() + ", "
                    + distField.getText() + ", " + stateField.getText() + ", " + pinCodeField.getText();
            String mobileNumber = mobileNumberField.getText();
            String admissionType = (String) admissionTypeComboBox.getSelectedItem();
            String photoPath = photoPathField.getText(); 
            // Logic for selecting students based on criteria (JEE rank, 12th and 10th marks)
            boolean selected = false;
            if (!jeeRank.isEmpty() && !mark12.isEmpty() && !mark10.isEmpty()) {
                int jeeRankValue = Integer.parseInt(jeeRank);
                double averageMarks = (Double.parseDouble(mark12) + Double.parseDouble(mark10)) / 2.0;

                
                if ((admissionType.equals("BTech") && jeeRankValue <= 1000 && averageMarks >= 80) ||
                        (admissionType.equals("MTech") && jeeRankValue <= 500 && averageMarks >= 75) ||
                        (admissionType.equals("Lateral Entry BTech") && jeeRankValue <= 1500 && averageMarks >= 70)) {
                    selected = true;
                }
            }

            String studentInfo = "Candidate Name: " + name + ", Date of Birth: " + dob + ", JEE Rank: " + jeeRank
                    + ", 12th Marks: " + mark12 + ", 10th Marks: " + mark10 + ", Father's Name: " + fatherName
                    + ", College Name: " + collegeName + ", School Name: " + schoolName + ", JEE Roll Number: "
                    + jeeRollNumber + ", Address: " + address + ", Mobile Number: " + mobileNumber
                    + ", Admission Type: " + admissionType + ", Photo Path: " + photoPath;

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                    PrintWriter selectedWriter = new PrintWriter(new BufferedWriter(new FileWriter(selectedFileName, true)))) {
                writer.write(studentInfo);
                writer.newLine();
                if (selected) {
                    selectedWriter.println(studentInfo + " - SELECTED");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            
            clearFields();
        } else if (e.getActionCommand().equals("Clear")) {
            clearFields();
        }
    }

    private void clearFields() {
        nameField.setText("");
        dobField.setText("");
        jeeRankField.setText("");
        mark12Field.setText("");
        mark10Field.setText("");
        fatherNameField.setText("");
        collegeNameField.setText("");
        schoolNameField.setText("");
        jeeRollNumberField.setText("");
        addressField.setText("");
        postField.setText("");
        blockField.setText("");
        distField.setText("");
        stateField.setText("");
        pinCodeField.setText("");
        mobileNumberField.setText("");
        photoPathField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new project();
            }
        });
    }
}
