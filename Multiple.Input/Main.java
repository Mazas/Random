package tadasIvanauskas;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        Object[] message={
                "Input value1:", field1,
                "Input value2:",field2,
                "Input value3:",field3,
        };
        int option = JOptionPane.showConfirmDialog(null,message,"Enter values",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (option==JOptionPane.OK_OPTION) {
            String value1 = field1.getText();
            String value2 = field2.getText();
            String value3 = field3.getText();
            JOptionPane.showMessageDialog(null, value1+" "+value2+" "+value3,"Values",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
