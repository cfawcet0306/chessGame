package gameLogic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChessBoardTest {

	@Test
	void testBuildBoard() {
		ChessBoard board = new ChessBoard();
		String boardString = board.toString();
		String expectedBoardString = "wbwbwbwb\nbwbwbwbw\nwbwbwbwb\nbwbwbwbw\nwbwbwbwb\nbwbwbwbw\nwbwbwbwb\nbwbwbwbw\n";
		assertEquals(expectedBoardString, boardString);
		
	}
	
	@Test
	void testBuildBoardCoords() {
		ChessBoard board = new ChessBoard();
		String boardString = board.toStringWithCoords();
		String expectedBoardString = "(0,0)(1,0)(2,0)(3,0)(4,0)(5,0)(6,0)(7,0)\n"
				+ "(0,1)(1,1)(2,1)(3,1)(4,1)(5,1)(6,1)(7,1)\n"
				+ "(0,2)(1,2)(2,2)(3,2)(4,2)(5,2)(6,2)(7,2)\n"
				+ "(0,3)(1,3)(2,3)(3,3)(4,3)(5,3)(6,3)(7,3)\n"
				+ "(0,4)(1,4)(2,4)(3,4)(4,4)(5,4)(6,4)(7,4)\n"
				+ "(0,5)(1,5)(2,5)(3,5)(4,5)(5,5)(6,5)(7,5)\n"
				+ "(0,6)(1,6)(2,6)(3,6)(4,6)(5,6)(6,6)(7,6)\n"
				+ "(0,7)(1,7)(2,7)(3,7)(4,7)(5,7)(6,7)(7,7)\n";
		assertEquals(expectedBoardString, boardString);
	}
	
	@Test
	void testBuildBoardTiles() {
		ChessBoard board = new ChessBoard();
		Tile[][] boardTiles = board.getBoard();
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				assertEquals(boardTiles[i][j].getX(), j);
				assertEquals(boardTiles[i][j].getY(), i);
			}
		}
	}
	
	

}
