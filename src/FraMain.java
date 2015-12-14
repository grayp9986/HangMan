import javax.swing.JFrame;

public class FraMain extends JFrame{
    public FraMain(){
        PanMain panMain = new PanMain();
        add(new PanMain());
        setTitle("Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,400);
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
