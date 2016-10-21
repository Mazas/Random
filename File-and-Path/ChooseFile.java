import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hamekas on 10/21/16 @HKR ivanauskas15@gmail.com
 */
public class ChooseFile extends JLabel implements ActionListener{
    private JFrame frame;
    private JButton chooseButton;
    private JButton contButton;
    private String path="";
    private JTextField label;
    private  boolean isRunning;
    ChooseFile(){
        frame = new JFrame("Choose a Directory");
        JPanel buttonPanel = new JPanel();
        JLabel textLabel = new JLabel("Choose a Path");
        textLabel.setHorizontalTextPosition(CENTER);
        label = new JTextField("PATH");
        contButton = new JButton("Continue");
        contButton.setHorizontalTextPosition(SwingConstants.CENTER);
        chooseButton = new JButton("Choose");
        chooseButton.setHorizontalTextPosition(SwingConstants.CENTER);
        contButton.addActionListener(this);
        chooseButton.addActionListener(this);
        buttonPanel.add(chooseButton);
        buttonPanel.add(contButton);
        frame.add(textLabel,BorderLayout.NORTH);
        frame.add(label,BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400,70);
        frame.setVisible(true);
        isRunning=true;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==chooseButton){
            JFileChooser chooser = new JFileChooser();
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setDialogTitle("Choose a Directory");
            if (chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
                label.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        }else if (actionEvent.getSource()==contButton){
            path=label.getText();
            frame.dispose();
            isRunning=false;
        }
    }
    String getPath(){
        return path;
    }
    boolean isRunning(){
        return isRunning;
    }
}
