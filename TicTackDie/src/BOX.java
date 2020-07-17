import javax.swing.*;
import java.util.ArrayList;

public class BOX {
    static char[][] field= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
     static boolean lastmove=false;
    ArrayList<char[]> Player = new ArrayList<char[]>();
    ArrayList<char[]> Cpu = new ArrayList<char[]>();
    static int flag=0;
     BOX(int box,char pos,boolean Player)
    {
        ImageIcon Tile;
        char U;
        if(Player)
        {
            U='P';
            Tile=mainFrame.P;
        }
        else
        {
            U='C';
            Tile=mainFrame.C;
        }
        if(pos==' ')
        {
            switch (box){
                case 1:
                    mainFrame.A1.setIcon(Tile);
                    field[0][0]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 2:
                    mainFrame.A2.setIcon(Tile);
                    field[0][1]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 3:
                    mainFrame.A3.setIcon(Tile);
                    field[0][2]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 4:
                    mainFrame.B1.setIcon(Tile);
                    field[1][0]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 5:
                    mainFrame.B2.setIcon(Tile);
                    field[1][1]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 6:
                    mainFrame.B3.setIcon(Tile);
                    field[1][2]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 7:
                    mainFrame.C1.setIcon(Tile);
                    field[2][0]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 8:
                    mainFrame.C2.setIcon(Tile);
                    field[2][1]=U;
                    lastmovee();
                    checkWinner();
                    break;
                case 9:
                    mainFrame.C3.setIcon(Tile);
                    field[2][2]=U;
                    lastmovee();
                    checkWinner();
                    break;
            }
        }
    }
    BOX(){
         field=new char[][]{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
         lastmove=false;
         flag=0;
         mainFrame.A11=true;
         mainFrame.A12=true;
         mainFrame.A13=true;
         mainFrame.B11=true;
         mainFrame.B12=true;
         mainFrame.C11=true;
         mainFrame.C12=true;
         mainFrame.C13=true;
         mainFrame.B13=true;

        Object[] Tile = { "X", "O"};
        if(JOptionPane.showOptionDialog(null,null,"select Tile", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,Tile,null)==JOptionPane.YES_OPTION)
        { mainFrame.P=mainFrame.X;
        mainFrame.C=mainFrame.O;}
        else
        {
            mainFrame.P=mainFrame.O;
            mainFrame.C=mainFrame.X;
        }
        mainFrame.A1.setIcon(mainFrame.W);
        mainFrame.A2.setIcon(mainFrame.W);
        mainFrame.A3.setIcon(mainFrame.W);
        mainFrame.B1.setIcon(mainFrame.W);
        mainFrame.B2.setIcon(mainFrame.W);
        mainFrame.B3.setIcon(mainFrame.W);
        mainFrame.C1.setIcon(mainFrame.W);
        mainFrame.C2.setIcon(mainFrame.W);
        mainFrame.C3.setIcon(mainFrame.W);
     }
    void lastmovee(){
         flag=0;
         for(char[] x:field) {
             for(char X:x )
             if(X==' ')
                 flag++;
         }
         if(flag==0)
             lastmove=true;
    }
    void checkWinner(){
            if ((field[0][0]=='P'&&field[0][1]=='P'&&field[0][2]=='P')||(field[1][0]=='P'&&field[1][1]=='P'&&field[1][2]=='P')||(field[2][0]=='P'&&field[2][1]=='P'&&field[2][2]=='P'))
            {   mainFrame.Ppoint++; new BOX();}
            else if((field[0][0]=='P'&&field[1][0]=='P'&&field[2][0]=='P')||(field[0][1]=='P'&&field[1][1]=='P'&&field[2][1]=='P')||(field[0][2]=='P'&&field[1][2]=='P'&&field[2][2]=='P'))
            {   mainFrame.Ppoint++; new BOX();}
            else if((field[0][0]=='P'&&field[1][1]=='P'&&field[2][2]=='P')||(field[0][2]=='P'&&field[1][1]=='P'&&field[2][0]=='P'))
            {   mainFrame.Ppoint++; new BOX();}
            else if ((field[0][0]=='C'&&field[0][1]=='C'&&field[0][2]=='C')||(field[1][0]=='P'&&field[1][1]=='C'&&field[1][2]=='C')||(field[2][0]=='C'&&field[2][1]=='C'&&field[2][2]=='C'))
            {   mainFrame.Ppoint++; new BOX();}
            else if((field[0][0]=='C'&&field[1][0]=='C'&&field[2][0]=='C')||(field[0][1]=='C'&&field[1][1]=='C'&&field[2][1]=='C')||(field[0][2]=='C'&&field[1][2]=='C'&&field[2][2]=='C'))
            {   mainFrame.Ppoint++; new BOX();}
            else if((field[0][0]=='C'&&field[1][1]=='C'&&field[2][2]=='C')||(field[0][2]=='C'&&field[1][1]=='C'&&field[2][0]=='C'))
            {   mainFrame.Ppoint++; new BOX();}
    }
    public static void main(String[] args) {
        new BOX();
    }
}
