
public class CpuMove {
    int bestScore;
    int move[] = {10, 10};

    void cpuM() {
        int bestScore = -Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Place.board[i][j] == ' ') {
                    Place.board[i][j] = 'C';
                    int score = miniMax(0, false);
                    Place.board[i][j] = ' ';
                    if (score > bestScore) {
                        bestScore = score;
                        move[0] = i;
                        move[1] = j;
                    }
                }
            }
        }
        new Place(checkPos(move[0], move[1]), ' ', false);
        Place.checkW();
    }

    int miniMax(int depth, boolean max) {
        if (max) {
            int score = -Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int scores;
                    if (Place.board[i][j] == ' ') {
                        Place.board[i][j] = 'C';
                        scores = miniMax(depth + 1, false);
                        Place.board[i][j] = ' ';
                        score = Math.max(score, scores);
                    }
                }
            }
            return score;
        } else {
            int score = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int scores;
                    if (Place.board[i][j] == ' ') {
                        Place.board[i][j] = 'C';
                        scores = miniMax(0, true);
                        Place.board[i][j] = ' ';
                        score = Math.min(score, scores);
                    }
                }
            }
            return score;
        }
    }

    char checkPos(int pos1, int pos2) {
        if (pos1 == 0 && pos2 == 0)
            return 1;
        else if (pos1 == 0 && pos2 == 1)
            return 2;
        else if (pos1 == 0 && pos2 == 2)
            return 3;
        else if (pos1 == 1 && pos2 == 0)
            return 4;
        else if (pos1 == 1 && pos2 == 1)
            return 5;
        else if (pos1 == 1 && pos2 == 2)
            return 6;
        else if (pos1 == 2 && pos2 == 0)
            return 7;
        else if (pos1 == 2 && pos2 == 1)
            return 8;
        else if (pos1 == 2 && pos2 == 2)
            return 9;
        else return 0;
    }

}
