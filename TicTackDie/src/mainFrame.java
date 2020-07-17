import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame {

    JFrame frame= new JFrame("TicTackDIE");
    JLayeredPane Container= new JLayeredPane();
    static ImageIcon X = new ImageIcon("src/Webp.net-resizeimageX.png");
    static ImageIcon O= new ImageIcon("src/Webp.net-resizeimageO.png");
    static ImageIcon W= new ImageIcon("src/Webp.net-resizeimageBox.png");
    static ImageIcon P=new ImageIcon();
    static ImageIcon C=new ImageIcon();
    static JLabel Points= new JLabel("YOU              CPU");
    JLabel YouPoints=new JLabel(String.valueOf(Ppoint));
    JLabel CpuPoints=new JLabel(String.valueOf(Cpoint));
    JButton container=new JButton();

    JPanel AP1=new JPanel();
    JPanel AP2=new JPanel();
    JPanel AP3=new JPanel();
    JPanel BP1=new JPanel();
    JPanel BP2=new JPanel();
    JPanel BP3=new JPanel();
    JPanel CP1=new JPanel();
    JPanel CP2=new JPanel();
    JPanel CP3=new JPanel();


    static JButton A1=new JButton();
    static JButton A2=new JButton();
    static JButton A3=new JButton();
    static JButton B1=new JButton();
    static JButton B2=new JButton();
    static JButton B3=new JButton();
    static JButton C1=new JButton();
    static JButton C2=new JButton();
    static JButton C3=new JButton();


    static int Ppoint=0;
    static int Cpoint=0;
    static boolean A11=true;
    static boolean A12=true;
    static boolean A13=true;
    static boolean B11=true;
    static boolean B12=true;
    static boolean B13=true;
    static boolean C11=true;
    static boolean C12=true;
    static boolean C13=true;


    mainFrame()
    {
        new BOX();
        frame.setBounds(200,200,400,400);
        Image icon_image=new ImageIcon("src/FAVPNG_red-skull-bone_kPu7iYJJ.png").getImage();
        frame.setIconImage(icon_image);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        Container.setBounds(0,0,400,400);
        frame.add(Container);


        Points.setBounds(122,15,200,19);
        Points.setFont(new Font("San-Serif",Font.BOLD,17));
        Container.add(Points,Integer.valueOf(0));


        YouPoints.setBounds(135,42,20,17);
        YouPoints.setFont(new Font("San-Serif",Font.BOLD,15));
        YouPoints.setText(String.valueOf(Ppoint));
        Container.add(YouPoints,Integer.valueOf(3));


        CpuPoints.setBounds(235,42,20,17);
        CpuPoints.setFont(new Font("San-Serif",Font.BOLD,15));
        CpuPoints.setText(String.valueOf(Cpoint));
        Container.add(CpuPoints,Integer.valueOf(3));


        container.setIcon(new ImageIcon("src/TicTackToe.png"));
        container.setBounds(0,0,390,380);
        container.setFocusPainted(false);
        container.setBorderPainted(false);
        container.setContentAreaFilled(false);
        Container.add(container,Integer.valueOf(0));


        //////
        AP1.setBounds(84,82,67,67);
        AP1.setLayout(null);
        A1.setBounds(0,0,67,67);
        A1.setIcon(W);
        A1.setBackground(Color.white);
        A1.setFocusPainted(false);
        A1.setBorderPainted(false);
        A1.setContentAreaFilled(false);
        A1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(1,BOX.field[0][0],true);
                new CPUmove(A11);
                A11=false;
            }
        });
        AP1.add(A1);
        Container.add(AP1,Integer.valueOf(2));

        AP2.setBounds(160,82,67,67);
        AP2.setLayout(null);
        A2.setBounds(0,0,67,67);
        A2.setIcon(W);
        A2.setFocusPainted(false);
        A2.setBorderPainted(false);
        A2.setContentAreaFilled(false);
        A2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(2,BOX.field[0][1],true);
                new CPUmove(A12);
                A12=false;
            }
        });
        AP2.add(A2);
        Container.add(AP2,Integer.valueOf(2));

        AP3.setBounds(236,82,67,67);
        AP3.setLayout(null);
        A3.setBounds(0,0,67,67);
        A3.setIcon(W);
        A3.setFocusPainted(false);
        A3.setBorderPainted(false);
        A3.setContentAreaFilled(false);
        A3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(3,BOX.field[0][2],true);
                new CPUmove(A13);
                A13=false;
            }
        });
        AP3.add(A3);
        Container.add(AP3,Integer.valueOf(2));

        BP1.setBounds(84,158,67,67);
        BP1.setLayout(null);
        B1.setBounds(0,0,67,67);
        B1.setIcon(W);
        B1.setFocusPainted(false);
        B1.setBorderPainted(false);
        B1.setContentAreaFilled(false);
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(4,BOX.field[1][0],true);
                new CPUmove(B11);
                B11=false;
            }
        });
        BP1.add(B1);
        Container.add(BP1,Integer.valueOf(2));

        BP2.setBounds(160,158,67,67);
        BP2.setLayout(null);
        B2.setBounds(0,0,67,67);
        B2.setIcon(W);
        B2.setFocusPainted(false);
        B2.setBorderPainted(false);
        B2.setContentAreaFilled(false);
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(5,BOX.field[1][1],true);
                new CPUmove(B12);
                B12=false;
            }
        });
        BP2.add(B2);
        Container.add(BP2,Integer.valueOf(2));

        BP3.setBounds(236,158,67,67);
        BP3.setLayout(null);
        B3.setBounds(0,0,67,67);
        B3.setIcon(W);
        B3.setFocusPainted(false);
        B3.setBorderPainted(false);
        B3.setContentAreaFilled(false);
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(6,BOX.field[1][2],true);
                new CPUmove(B13);
                B13=false;
            }
        });
        BP3.add(B3);
        Container.add(BP3,Integer.valueOf(2));

        CP1.setBounds(84,233,67,67);
        CP1.setLayout(null);
        C1.setBounds(0,0,67,67);
        C1.setIcon(W);
        C1.setFocusPainted(false);
        C1.setBorderPainted(false);
        C1.setContentAreaFilled(false);
        C1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(7,BOX.field[2][0],true);
                new CPUmove(C11);
                C11=false;
            }
        });
        CP1.add(C1);
        Container.add(CP1,Integer.valueOf(2));

        CP2.setBounds(160,233,67,67);
        CP2.setLayout(null);
        C2.setBounds(0,0,67,67);
        C2.setIcon(W);
        C2.setFocusPainted(false);
        C2.setBorderPainted(false);
        C2.setContentAreaFilled(false);
        C2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(8,BOX.field[2][1],true);
                new CPUmove(C12);
                C12=false;
            }
        });
        CP2.add(C2);
        container.add(CP2,Integer.valueOf(2));

        CP3.setBounds(236,233,67,67);
        CP3.setLayout(null);
        C3.setBounds(0,0,67,67);
        C3.setIcon(W);
        C3.setFocusPainted(false);
        C3.setBorderPainted(false);
        C3.setContentAreaFilled(false);
        C3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BOX(9,BOX.field[2][2],true);
                new CPUmove(C13);
                C13=false;
            }
        });
        CP3.add(C3);
        Container.add(CP3,Integer.valueOf(2));

        ////

        JButton clear = new JButton("clear");
        JPanel Clear=new JPanel();
        Clear.setLayout(null);
        Clear.setBounds(156,320,70,17);
        clear.setBorderPainted(false);
        clear.setContentAreaFilled(false);
        clear.setBounds(0,0,70,17);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { new BOX(); }
        });
        Clear.add(clear);
        Container.add(Clear,Integer.valueOf(2));

    }

    public static void main(String[] args) {
            new mainFrame();
    }
}
