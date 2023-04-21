public class Pawn extends Piece{

    public Pawn(int color) {
        super(color);
        updateMoves();
        System.out.println(currentPosition[0]);
        System.out.println(currentPosition[1]);
    }

    @Override
    public void updateMoves(){
        availableMoves[0] = new int[]{currentPosition[0] + 1, currentPosition[1]};
    }

    public void move(int[] pos){
        currentPosition = pos;
    }

    public void print(){
        System.out.print("P");
    }


}
