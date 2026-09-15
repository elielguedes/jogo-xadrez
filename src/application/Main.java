package application;

import chess.ChessMath;

public class Main {
    public static void main(String[] args){

        ChessMath c = new ChessMath();
        UI.printBoard(c.getPieces());
    }
}
