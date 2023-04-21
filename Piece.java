public class Piece {

    int color;
    int[] currentPosition = new int[2];
    int[][] availableMoves = new int[20][2];

    public Piece(int color){
        color = color;
    }

    public Piece() {
    }

    public int[] getPosition(){
        return currentPosition;
    }

    public void setPosition(int[] pos){
        currentPosition = pos;
    }

    public void updateMoves(){

    }

    public void move(){

    }

    public void print(){

    }
}
