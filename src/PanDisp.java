import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.event.KeyListener;
import javax.swing.*;

public class PanDisp extends JPanel {

    JLabel lblOutput;
    JButton btnUpdateLabel;

    public PanDisp() {//Constructor
        KeyInput keyInput = new KeyInput();
        lblOutput = new JLabel();
        btnUpdateLabel = new JButton();
        lblOutput = new JLabel("*****");
        btnUpdateLabel = new JButton("Enter");
        add(lblOutput);
        add(btnUpdateLabel);
        addKeyListener(new KeyInput());
        setFocusable(true);
        LabelChangeListener labelChange = new LabelChangeListener();
        btnUpdateLabel.addActionListener(labelChange);
    }
    class LabelChangeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            lblOutput.setText("**a**");
        }
    }
    class KeyInput implements KeyListener {

        String sInput;
        char chInput;
        /*keyPressed - when the key goes down
        keyReleased - when the key comes up
        keyTyped - when the unicode character represented by this key is sent by the keyboard to system input.*/
        

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        chInput = (char) e.getKeyChar();
        sInput = String.valueOf(chInput); // convert the char to a String
        lblOutput.setText(sInput);
        }
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
}
