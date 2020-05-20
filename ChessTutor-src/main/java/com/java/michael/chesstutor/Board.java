package com.java.michael.chesstutor;
import com.java.michael.chesstutor.Piece;

//public class Board {
//    private static Piece[][] theBoard;
//    //Piece [][] theBoard;
//
//    Board(Piece [][] newBoard){theBoard = make(newBoard); }
//    private Piece[][] make(Piece[][] newBoard){
//        newBoard[1][1] = new Piece("Rook", "White", "R",  5);//white rook
//        newBoard[1][2] = new Piece("Knight", "White", "K",  3);//white knight
//        newBoard[1][3] = new Piece("Bishop", "White", "B",  3);//white bishop
//        newBoard[1][4] = new Piece("Queen", "White", "Q",  9);//white queen
//        newBoard[1][5] = new Piece("King", "White", "X",  2000);//white king
//        newBoard[1][6] = new Piece("Bishop", "White", "B",  3);//white bishop
//        newBoard[1][7] = new Piece("Knight", "White", "K",  3);//white knight
//        newBoard[1][8] = new Piece("Rook", "White", "R",  5);//white rook
//        for( int i = 1; i <=8; i++){
//            newBoard[2][i]= new Piece("Pawn", "White", "P",  1);//white pawn
//        }
//        for( int i = 1; i <=8; i++) {
//            if(i%2==0){ newBoard[3][i] = new Piece("Cell", "Black", "",  0);//empty cell
//            }
//            else{ newBoard[3][i] = new Piece("Cell", "White", "",  0);}
//            }
//        for( int i = 1; i <=8; i++) {
//            if(i%2==0){ newBoard[4][i] = new Piece("Cell", "Black", "",  0);//empty cell
//            }
//            else{newBoard[4][i] = new Piece("Cell", "White", "",  0);}
//        }
//        for( int i = 1; i <=8; i++) {
//            if(i%2==0) { newBoard[5][i] = new Piece("Cell", "White", "", 0);//empty cell
//            }
//            else{ newBoard[5][i] = new Piece("Cell", "Black", "",  0);
//            }
//        }
//        for( int i = 1; i <=8; i++) {
//            if(i%2==0) { newBoard[6][i] = new Piece("Cell", "Black", "", 0);//empty cell
//            }
//            else { newBoard[6][i] = new Piece("Cell", "White", "", 0);
//            }
//        }
//        newBoard[8][1] = new Piece("Rook", "Black", "r", 5);//white rook
//        newBoard[8][2] = new Piece("Knight", "Black", "k", 3);//white knight
//        newBoard[8][3] = new Piece("Bishop", "Black", "b", 3);//white bishop
//        newBoard[8][4] = new Piece("Queen", "Black", "q", 9);//white queen
//        newBoard[8][5] = new Piece("King", "Black", "x", 2000);//white king
//        newBoard[8][6] = new Piece("Bishop", "Black", "b", 3);//white bishop
//        newBoard[8][7] = new Piece("Knight", "Black", "k", 3);//white knight
//        newBoard[8][8] = new Piece("Rook", "Black", "r", 5);//white rook
//        for( int i = 1; i <=8; i++){
//            newBoard[7][i]= new Piece("Pawn", "Black", "p", 1);//white pawn
//        }
//        return newBoard;
//    }
//    public static Boolean hasPiece(int row, int col){
//        return (theBoard[row][col].value > 0);
//    }
//    public static String hasType(int row, int col){
//        return theBoard[row][col].type;
//    }
//    public static Boolean movePiece(int[] pick, int[] place){
//        if(theBoard[pick[0]][pick[1]].type == "Knight"){return runKnight(pick, place);}
//        else if(theBoard[pick[0]][pick[1]].type == "Bishop"){return runBishop(pick, place);}
//        else if(theBoard[pick[0]][pick[1]].type == "Rook"){return runRook(pick, place);}
//        else if(theBoard[pick[0]][pick[1]].type == "Queen"){return runQueen(pick, place);}
//        else if(theBoard[pick[0]][pick[1]].type == "King"){return runKing(pick, place);}
//        else if(theBoard[pick[0]][pick[1]].type == "Pawn"){return runPawn(pick, place);}
//        else{return false;}
//    }
//    //VVVVVVVVVVV Logic for the pieces
//    private static boolean runKnight(int[] pick, int[] place){
//       if((pick[0]+1 == place[0] && pick[1]+2 == place[1]) ||(pick[0]-1 == place[0] && pick[1]+2 == place[1])||(pick[0]+1 == place[0] && pick[1]-2 == place[1])||(pick[0]-1 == place[0] && pick[1]-2 == place[1])||(pick[0]+2 == place[0] && pick[1]+1 == place[1]) ||(pick[0]-2 == place[0] && pick[1]+1 == place[1])||(pick[0]+2 == place[0] && pick[1]-1 == place[1])||(pick[0]-2 == place[0] && pick[1]-1 == place[1])){
//           theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//           theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "",  0);//empty cell
//           return true;
//       }
//       else{
//           return false;
//       }
//    }
//    private static boolean runBishop(int[] pick, int[] place){
//        if (pick[0]+1 == place[0] && pick[1]+1 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-1 == place[0] && pick[1]-1 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+2 == place[0] && pick[1]+2 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-2 == place[0] && pick[1]-2 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+3 == place[0] && pick[1]+3 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-3 == place[0] && pick[1]-3 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+4 == place[0] && pick[1]+4 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-4 == place[0] && pick[1]-4 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+5 == place[0] && pick[1]+5 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-5 == place[0] && pick[1]-5 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+6 == place[0] && pick[1]+6 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-6 == place[0] && pick[1]-6 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+7 == place[0] && pick[1]+7 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-7 == place[0] && pick[1]-7 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+8 == place[0] && pick[1]+8 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-8 == place[0] && pick[1]-8 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        if (pick[0]-1 == place[0] && pick[1]+1 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+1 == place[0] && pick[1]-1 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-2 == place[0] && pick[1]+2 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+2 == place[0] && pick[1]-2 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-3 == place[0] && pick[1]+3 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+3 == place[0] && pick[1]-3 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-4 == place[0] && pick[1]+4 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+4 == place[0] && pick[1]-4 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-5 == place[0] && pick[1]+5 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+5 == place[0] && pick[1]-5 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-6 == place[0] && pick[1]+6 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+6 == place[0] && pick[1]-6 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-7 == place[0] && pick[1]+7 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+7 == place[0] && pick[1]-7 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]-8 == place[0] && pick[1]+8 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if (pick[0]+8 == place[0] && pick[1]-8 == place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else {return false;}
//    }
//    private static boolean runRook(int[] pick, int[] place){
//        if(pick[0]==place[0]&&pick[1]!=place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;}
//        else if(pick[0]!=place[0]&&pick[1]==place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;}
//        else{return false;}
//    }
//    private static boolean runQueen(int[] pick, int[] place){
//        if(runBishop(pick, place)||runRook(pick, place)){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else{return false;}
//    }
//    private static boolean runKing(int[] pick, int[] place){
//        if(pick[0]==place[0]&&pick[1]+1==place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if(pick[0]+1==place[0]&&pick[1]==place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if(pick[0]-1==place[0]&&pick[1]==place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if(pick[0]==place[0]&&pick[1]-1==place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else {return false;}
//    }
//    private static boolean runPawn(int[] pick, int[] place){
//        if(pick[0]+1==place[0]&&pick[1]==place[1]){
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if( pick[0]+1==place[0]&&pick[1]+1==place[1]&&(theBoard[place[0]][place[1]].value>1)) {
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else if( pick[0]+1==place[0]&&pick[1]-1==place[1]&&(theBoard[place[0]][place[1]].value>1)) {
//            theBoard[place[0]][place[1]] = theBoard[pick[0]][pick[1]];
//            theBoard[pick[0]][pick[1]] = new Piece("Cell", "None", "", 0);//empty cell
//            return true;
//        }
//        else {return false;}
//    }
//}
