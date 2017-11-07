import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JLabel lab1 = new JLabel("hi");
    private Label lab = new Label();
    private Container cp;
    private JPanel jpl = new JPanel(new GridLayout(1,1,3,3));
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setBounds(100,100,800,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        lab.setBounds(300,300,100,100);
        lab.setBackground(new Color(220, 223, 19));
        lab1.setBounds(200,200,50,50);

        lab1.setBackground(new Color(200, 44, 63, 255));
        this.setLayout(null);
        this.add(lab1);
        this.add(lab);
        lab1.setForeground(Color.red);
        lab1.setOpaque(true);



    }
}
