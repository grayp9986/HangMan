import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanDisp extends JPanel {

    JLabel lblOutput;
    JButton btnUpdateLabel;

    public PanDisp() {//Constructor
        lblOutput = new JLabel();
        btnUpdateLabel = new JButton();
        lblOutput = new JLabel("*****");
        btnUpdateLabel = new JButton("Enter");
        add(lblOutput);
        add(btnUpdateLabel);
        setFocusable(true);
        LabelChangeListener labelChange = new LabelChangeListener();
        btnUpdateLabel.addActionListener(labelChange);
    }
    class LabelChangeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            lblOutput.setText("**a**");
        }
    }
}
