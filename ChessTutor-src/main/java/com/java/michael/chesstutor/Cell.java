package com.java.michael.chesstutor;

public class Cell {
    Boolean hasPiece;
    int row;
    int column;
    Cell(int row, int column, Boolean hasPiece){
        this.row = row;
        this.column = column;
        this.hasPiece = hasPiece;
    }
    Cell(int row, int column){
        this.row = row;
        this.column = column;
        this.hasPiece = false;
    }
}
