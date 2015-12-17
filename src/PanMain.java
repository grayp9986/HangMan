import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class PanMain extends JPanel{
    //JLabel lblOutput;
   // JButton btnUpdateLabel;
    PanDisp panDisp = new PanDisp();
    PanSettings panSettings = new PanSettings();
    public PanMain(){
        setLayout(new BorderLayout());
        add(panSettings, BorderLayout.SOUTH);
        add(panDisp, BorderLayout.CENTER);
        
    }
}

