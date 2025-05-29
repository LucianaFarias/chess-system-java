package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) throws Exception {
        ChessMatch chessMatch = new ChessMatch(null);
        UI.printBoard(chessMatch.getPieces());
    }
}
