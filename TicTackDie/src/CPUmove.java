import java.util.Random;

public class CPUmove {
    CPUmove(boolean v)
    {
        if(v){
        Random x=new Random();
        int cpumove=x.nextInt(9)+1;
        char placeholder=checkPos(cpumove);
        if(placeholder==' ')
            new BOX(cpumove,placeholder,false);
        else if(!BOX.lastmove)
            new CPUmove(true);
        }
    }
    public char checkPos(int pos){
        switch (pos){
            case 1:
                return BOX.field[0][0];
            case 2:
                return BOX.field[0][1];
            case 3:
                return BOX.field[0][2];
            case 4:
                return BOX.field[1][0];
            case 5:
                return BOX.field[1][1];
            case 6:
                return BOX.field[1][2];
            case 7:
                return BOX.field[2][0];
            case 8:
                return BOX.field[2][1];
            case 9:
                return BOX.field[2][2];
        }
        return '1';
    }
}
