import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class PanMain extends JPanel{
    //JLabel lblOutput;
   // JButton btnUpdateLabel;
    PanDisp panDisp = new PanDisp();
    PanStats panStats = new PanStats(panDisp);
    public PanMain(){
        setLayout(new BorderLayout());
        add(panStats, BorderLayout.EAST);
        add(panDisp, BorderLayout.CENTER);
    }
    
}

