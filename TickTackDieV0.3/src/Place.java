import javax.swing.*;

public class Place{
    ImageIcon u=new ImageIcon();
    char usr =' ';
    static char[][] board={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    Place(int pos,char clicked,boolean pl){
        if(clicked==' '){
            if(pl)
            { u=Board.p;
            usr='P';}
            else
            {  u=Board.c;
            usr='C';}
        switch (pos){
            case 1:
                Board.a1.setIcon(u);
                board[0][0]=usr;
                break;
            case 2:
                Board.a2.setIcon(u);
                board[0][1]=usr;
                break;
            case 3:
                Board.a3.setIcon(u);
                board[0][2]=usr;
                break;
            case 4:
                Board.b1.setIcon(u);
                board[1][0]=usr;
                break;
            case 5:
                Board.b2.setIcon(u);
                board[1][1]=usr;
                break;
            case 6:
                Board.b3.setIcon(u);
                board[1][2]=usr;
                break;
            case 7:
                Board.c1.setIcon(u);
                board[2][0]=usr;
                break;
            case 8:
                Board.c2.setIcon(u);
                board[2][1]=usr;
                break;
            case 9:
                Board.c3.setIcon(u);
                board[2][2]=usr;
                break;
        }
    }}
    Place(){
        Board.a1.setIcon(Board.w);
        Board.a2.setIcon(Board.w);
        Board.a3.setIcon(Board.w);
        Board.b1.setIcon(Board.w);
        Board.b2.setIcon(Board.w);
        Board.b3.setIcon(Board.w);
        Board.c1.setIcon(Board.w);
        Board.c2.setIcon(Board.w);
        Board.c3.setIcon(Board.w);

        board= new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};;
        if(JOptionPane.showOptionDialog(null,null,"select tile",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,new Object[]{"X","O"},null)==JOptionPane.YES_OPTION)
        { Board.p=Board.x;
            Board.c=Board.o;}
        else
        {
            Board.p=Board.o;
            Board.c=Board.x;
        }

    }

    static void checkW(){
        if ((board[0][0]=='P'&&board[0][1]=='P'&&board[0][2]=='P')||(board[1][0]=='P'&&board[1][1]=='P'&&board[1][2]=='P')||(board[2][0]=='P'&&board[2][1]=='P'&&board[2][2]=='P'))
        {   Board.pPoint++; new Place();}
        else if((board[0][0]=='P'&&board[1][0]=='P'&&board[2][0]=='P')||(board[0][1]=='P'&&board[1][1]=='P'&&board[2][1]=='P')||(board[0][2]=='P'&&board[1][2]=='P'&&board[2][2]=='P'))
        {   Board.pPoint++; new Place();}
        else if((board[0][0]=='P'&&board[1][1]=='P'&&board[2][2]=='P')||(board[0][2]=='P'&&board[1][1]=='P'&&board[2][0]=='P'))
        {   Board.pPoint++; new Place();}
        else if ((board[0][0]=='C'&&board[0][1]=='C'&&board[0][2]=='C')||(board[1][0]=='P'&&board[1][1]=='C'&&board[1][2]=='C')||(board[2][0]=='C'&&board[2][1]=='C'&&board[2][2]=='C'))
        {   Board.cPoint++; new Place();}
        else if((board[0][0]=='C'&&board[1][0]=='C'&&board[2][0]=='C')||(board[0][1]=='C'&&board[1][1]=='C'&&board[2][1]=='C')||(board[0][2]=='C'&&board[1][2]=='C'&&board[2][2]=='C'))
        {   Board.cPoint++; new Place();}
        else if((board[0][0]=='C'&&board[1][1]=='C'&&board[2][2]=='C')||(board[0][2]=='C'&&board[1][1]=='C'&&board[2][0]=='C'))
        {   Board.cPoint++; new Place();}
    }

}
