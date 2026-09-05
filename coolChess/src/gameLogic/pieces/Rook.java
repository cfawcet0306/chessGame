package gameLogic.pieces;

import java.util.ArrayList;
import java.util.List;

import gameLogic.ChessBoard;
import gameLogic.Piece;
import gameLogic.Tile;

public class Rook extends Piece {

	public Rook(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
		
	}
	
	@Override
	public List<Tile> getValidMoves(ChessBoard board) {
		List<Tile> validMoves = new ArrayList<Tile>();
		
		getNorth(validMoves, this.getPosition(), board);
		getEast(validMoves, this.getPosition(), board);
		getSouth(validMoves, this.getPosition(), board);
		getWest(validMoves, this.getPosition(), board);
		
		return validMoves;
	}

	private void getNorth(List<Tile> validMoves, Tile currentTile, ChessBoard board) {
		if(board.getNorth(currentTile) == null) {
			return;
		}
		if(board.getNorth(currentTile).getPiece() == null) {
			validMoves.add(board.getNorth(currentTile));
			this.getNorth(validMoves, board.getNorth(currentTile), board);
		}
		else if(board.getNorth(currentTile).getPiece().getColor() != this.getColor()) {
			validMoves.add(board.getNorth(currentTile));
		}
	}
	
	private void getEast(List<Tile> validMoves, Tile currentTile, ChessBoard board) {
		if(board.getEast(currentTile) == null) {
			return;
		}
		if(board.getEast(currentTile).getPiece() == null) {
			validMoves.add(board.getEast(currentTile));
			this.getEast(validMoves, board.getEast(currentTile), board);
		}
		else if(board.getEast(currentTile).getPiece().getColor() != this.getColor()) {
			validMoves.add(board.getEast(currentTile));
		}
	}
	
	private void getSouth(List<Tile> validMoves, Tile currentTile, ChessBoard board) {
		if(board.getSouth(currentTile) == null) {
			return;
		}
		if(board.getSouth(currentTile).getPiece() == null) {
			validMoves.add(board.getSouth(currentTile));
			this.getSouth(validMoves, board.getSouth(currentTile), board);
		}
		else if(board.getSouth(currentTile).getPiece().getColor() != this.getColor()) {
			validMoves.add(board.getSouth(currentTile));
		}
	}
	
	private void getWest(List<Tile> validMoves, Tile currentTile, ChessBoard board) {
		if(board.getWest(currentTile) == null) {
			return;
		}
		if(board.getWest(currentTile).getPiece() == null) {
			validMoves.add(board.getWest(currentTile));
			this.getWest(validMoves, board.getWest(currentTile), board);
		}
		else if(board.getWest(currentTile).getPiece().getColor() != this.getColor()) {
			validMoves.add(board.getWest(currentTile));
		}
	}
	

	
	

	

}
