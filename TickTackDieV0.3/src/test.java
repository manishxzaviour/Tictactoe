import javax.swing.*;
import java.awt.*;

public class test {
    test()
    {
        JFrame f = new JFrame();
        f.setBounds(200,200,400,400);
        JPanel p= new JPanel();
        //p.setBounds(0,0,400,400);
        p.setLayout(new GridLayout(3,3,4,4));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        p.add(new JButton("ggdf"));
        f.add(p);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}
