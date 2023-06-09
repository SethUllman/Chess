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
            board[1][col].currentPosition = new int[]{1, col};
            board[6][col] = new Pawn(Black);
            board[6][col].currentPosition = new int[]{6, col};
        }
        int[] rows = {0, 7};
        // generates special pieces
        for(int color = 0; color < 2; color++){
            for(int i = 0; i < 2; i++){
                board[rows[i]][0] = new Rook(color);
                board[rows[i]][0].currentPosition = new int[]{rows[i], 0};
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

        // generates empty positions
        for(int i = 2; i < 6; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = new Empty();
            }
        }

        // set starting position of pieces
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                board[i][j].currentPosition[0] = j;
                board[i][j].currentPosition[1] = i;
            }
        }
    }

    // prints the entire board
    public void print(){
        for(int row = 7; row >= 0; row--){
            System.out.println("-----------------");
            for(int col = 0; col < 8; col++){
                System.out.print("|");
                board[row][col].print();
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
