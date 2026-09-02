package gameLogic.pieces;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import gameLogic.ChessBoard;
import gameLogic.ChessBoardLogic;
import gameLogic.Piece;
import gameLogic.Tile;

class RookTest {

	@Test
	void testValidMovesEmptyBoard() {
		
		ChessBoard board = new ChessBoard();
		
		Tile[][] boardArray = board.getBoardArray();
		
		Piece rook = new Rook(Piece.Type.ROOK, boardArray[3][3], Piece.Color.WHITE);
		
		List<Tile> validMoves = rook.getValidMoves(board);
		
		assertEquals(validMoves.size(), 14);
		
		//Vertical moves
		assertTrue(validMoves.contains(boardArray[2][3]));
		assertTrue(validMoves.contains(boardArray[1][3]));
		assertTrue(validMoves.contains(boardArray[0][3]));
		assertTrue(validMoves.contains(boardArray[4][3]));
		assertTrue(validMoves.contains(boardArray[5][3]));
		assertTrue(validMoves.contains(boardArray[6][3]));
		assertTrue(validMoves.contains(boardArray[7][3]));
		
		//Horizontal moves
		assertTrue(validMoves.contains(boardArray[3][2]));
		assertTrue(validMoves.contains(boardArray[3][1]));
		assertTrue(validMoves.contains(boardArray[3][4]));
		assertTrue(validMoves.contains(boardArray[3][5]));
		assertTrue(validMoves.contains(boardArray[3][6]));
		assertTrue(validMoves.contains(boardArray[3][7]));
		assertTrue(validMoves.contains(boardArray[3][0]));
		
		//Some things that shouldnt be allowed
		assertFalse(validMoves.contains(boardArray[3][3]));
		assertFalse(validMoves.contains(boardArray[2][4]));
		assertFalse(validMoves.contains(boardArray[4][2]));
		
		
		
	}

}
