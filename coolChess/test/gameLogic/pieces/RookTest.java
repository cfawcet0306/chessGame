package gameLogic.pieces;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import gameLogic.ChessBoard;
import gameLogic.Piece;
import gameLogic.Tile;

class RookTest {

	@Test
	void testValidMovesEmptyBoard() {
		
		Tile[][] board = new ChessBoard().getBoard();
		
		Piece rook = new Rook(Piece.Type.ROOK, board[3][3], Piece.Color.WHITE);
		
		List<Tile> validMoves = rook.getValidMoves(board, 1);
		
		assertEquals(validMoves.size(), 14);
		
		//Vertical moves
		assertTrue(validMoves.contains(board[2][3]));
		assertTrue(validMoves.contains(board[1][3]));
		assertTrue(validMoves.contains(board[0][3]));
		assertTrue(validMoves.contains(board[4][3]));
		assertTrue(validMoves.contains(board[5][3]));
		assertTrue(validMoves.contains(board[6][3]));
		assertTrue(validMoves.contains(board[7][3]));
		
		//Horizontal moves
		assertTrue(validMoves.contains(board[3][2]));
		assertTrue(validMoves.contains(board[3][1]));
		assertTrue(validMoves.contains(board[3][4]));
		assertTrue(validMoves.contains(board[3][5]));
		assertTrue(validMoves.contains(board[3][6]));
		assertTrue(validMoves.contains(board[3][7]));
		assertTrue(validMoves.contains(board[3][0]));
		
		//Some things that shouldnt be allowed
		assertFalse(validMoves.contains(board[3][3]));
		assertFalse(validMoves.contains(board[2][4]));
		assertFalse(validMoves.contains(board[4][2]));
		
		
		
	}

}
