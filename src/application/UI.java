package application;

import br.chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			
			for (int j = 0; j < pieces.length; j++) {
				
			}
			
		}
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.println("-");
		}
		else {
			System.out.println(piece);
		}
		
		System.out.println("");
	}
	
}
