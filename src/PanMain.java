import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanMain extends JPanel{
    JLabel lblOutput;
    JButton btnUpdateLabel;
    public PanMain(){
       lblOutput = new JLabel("This might be where a word goes");
       btnUpdateLabel = new JButton("Could this be a letter button?");
       add(lblOutput);
       add(btnUpdateLabel);
       setFocusable(true);
       LabelChangeListener labelChange = new LabelChangeListener();
       btnUpdateLabel.addActionListener(labelChange);
    }
    class LabelChangeListener implements ActionListener {
       public void actionPerformed(ActionEvent event) {
       lblOutput.setText("Told you this could be where the word goes");
       }
    }
}
