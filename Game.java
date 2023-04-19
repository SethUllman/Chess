import java.util.Scanner;

public class Game {

    final int White = 0;
    final int Black = 1;
    int turn = White;
    Board board = new Board();

    public void start(){
        play();
    }

    public void play(){

        while(!gameOver()) {
            board.print();
            int[] startPos = new int[2];
            int[] endPos = new int[2];
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter position of piece to move: ");
                String startInput = scanner.nextLine();
                System.out.println("Enter position to move to: ");
                String endInput = scanner.nextLine();

                char startRow = startInput.charAt(0);
                char startCol = startInput.charAt(1);
                char endRow = endInput.charAt(0);
                char endCol = endInput.charAt(1);

                startPos[0] = startRow-97;
                startPos[1] = startCol-49;
                endPos[0] = endRow-97;
                endPos[1] = endCol-49;

            } while(!validMove(startPos, endPos));

            makeMove(startPos, endPos);
            board.print();

        }
    }

    public void makeMove(int[] start, int[] end){
        board.board[end[0]][end[1]] = board.board[start[0]][start[1]];
        board.board[start[0]][start[1]] = new Empty();
    }

    public boolean validMove(int[] start, int[] end){
        if(board.board[start[0]][start[1]].color != turn){
            System.out.println("You can only move your pieces!");
            return false;
        }
        return true;
    }

    public boolean gameOver(){
        return false;
    }

    public boolean checkMate(){
        return false;
    }

}
