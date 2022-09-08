package Services;
import Entities.Pixel;

public class Pixel_service {

    public Pixel_service() {
    }

    public Pixel[][] createDraw(){
        Pixel[][] board = new Pixel[5][4];

        board[0][0] = new Pixel(false,"");
        board[0][1] = new Pixel(true,"\u250C");
        board[0][2] = new Pixel(true,"\2501");
        board[0][3] = new Pixel(true,"\u2510");

        return board;
    }

    public void showDraw(Pixel[][]board) {
        for (int i=0; i <4; i++){
            if (board[0][i].isOn()) System.out.print(board[0][i].getUnicodeValue());
            else System.out.print(" ");
        }
        
    }

    public static void main(String[] args) {
        Pixel_service boardManager = new Pixel_service();
        Pixel[][] boardTest;

        boardTest = boardManager.createDraw();

        boardManager.showDraw(boardTest);
        
    }
}
