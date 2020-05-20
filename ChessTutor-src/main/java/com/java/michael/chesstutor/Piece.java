package com.java.michael.chesstutor;

public class Piece {
    int r;
    int c;
    String sym;
    Piece(int r, int c, String sym){
        this.r = r;
        this.c = c;
        this.sym = sym;
    }
    public String getSym(){return this.sym;}
    public void setSym(String sym){this.sym=sym; }
    public int getRow(){return this.r;}
    public void setRow(int r){this.r = r;}
    public int getCol(){return this.c;}
    public void setCol(int c){this.c = c;}
}

//{
//    String name = new String();
//    String type = new String();
//    String symbol = new String();
//    int value = 0;
//    Piece(String name, String type, String symbol, int value){
//        this.name = name;
//        this.type = type;
//        this.symbol = symbol;
//        this.value = value;
//    }
//    public String getName(){
//        return name;
//    }
//    public String getSymbol(){
//        return symbol;
//    }
//    public String getType(){
//        return type;
//    }
//    public void setSymbol(String sym){
//        this.symbol = sym;
//    }
//}
