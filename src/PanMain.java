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
       lblOutput = new JLabel("Check out the label");
       btnUpdateLabel = new JButton("Update the label");
    }
}
