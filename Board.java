public class Board {
    final public int White = 0;
    final public int Black = 1;
    Piece[][] board = new Piece[8][8];
    public Board(){
        populate();
    }

    public void populate(){

        // generates pawns
        for(int col = 0; col < 8; col++) {
            board[1][col] = new Pawn(White);
            board[6][col] = new Pawn(Black);
        }
        int[] rows = {0, 7};
        // generates special pieces
        for(int color = 0; color < 2; color++){
            for(int i = 0; i < 2; i++){
                board[rows[i]][0] = new Rook(color);
                board[rows[i]][1] = new Knight(color);
                board[rows[i]][2] = new Bishop(color);
                board[rows[i]][5] = new Bishop(color);
                board[rows[i]][6] = new Knight(color);
                board[rows[i]][7] = new Rook(color);
            }
        }

        // generates royalty
        board[0][3] = new Queen(White);
        board[0][4] = new King(White);
        board[7][3] = new King(Black);
        board[7][4] = new Queen(Black);
    }

    public void print(){

    }
}
