import java.util.Random;

public class CpuMove {
    int pos;
     void cpuM(){
         if(checkLastM()){
         Random x = new Random();
           pos =  x.nextInt(9)+1;
         if(checkPos(pos)==' ') {
             new Place(pos, checkPos(pos), false);
             Place.checkW();
         }
         else
             cpuM();
         }
     }
     char checkPos(int pos){
         switch (pos){
             case 1:
                     return Place.board[0][0];
             case 2:
                     return Place.board[0][1];
             case 3:
                     return Place.board[0][2];
             case 4:
                     return Place.board[1][0];
             case 5:
                     return Place.board[1][1];
             case 6:
                     return Place.board[1][2];
             case 7:
                     return Place.board[2][0];
             case 8:
                     return Place.board[2][1];
             case 9:
                     return Place.board[2][2];
         }
         return 'X';
     }
     boolean checkLastM()
     {
         int flag=0;
         for(char[] x:Place.board){
             for(char y:x)
                 if(y==' '){
                     flag++;
             }
         }
         if(flag==0)
             return false;
         return true;
     }
}
