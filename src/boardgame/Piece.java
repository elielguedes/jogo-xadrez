package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() { // para acessar um taboleiro de uma peça só class no mesmo pacote subpacote ou subclass
        return board;
    }

}
