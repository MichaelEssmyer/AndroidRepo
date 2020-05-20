package com.java.michael.chesstutor;
import com.java.michael.chesstutor.Board;
import android.widget.ImageButton;

//public class Player {
//    private String Type;
//    public boolean turncounter;
//    public int[] pick = new int [2];
//    public int[] place = new int [2];
//    Player(String theType){
//        this.Type = theType;
//    }
//    public boolean getMove(int click, int r, int c){
//        if (click ==0){pick[1] = c; pick[0]=r; return true;}
//        else if (click == 1) {
//            place[1]=c;
//            place[0]=r;
//            if (think(pick,place)){
//                //change view
//
//                return true;
//            }
//            else{
//                //dont change view and allow same user to pick another move
//                return false;
//            }
//        }
//        else{return false;}
//    }
//    public boolean think(int[] pick, int[] place){
//        if(Board.hasPiece(pick[0],pick[1])==true && (Board.hasPiece(place[0],place[1])==false || Board.hasType(place[0],place[1]) != Type)){
//            if(Board.movePiece(pick,place)){
//                //take piece from pull place it on set
//                String filename = Board[pick[0]][pick[1]].getName()+Board[pick[0]][pick[1]].getType();
//                //clear the cell from pull
//
//                /*
//    int imageResource = getResources().getIdentifier("@drawable/filename", null, this.getPackageName());
//    firstImage.setImageResource(imageResource);
//    */
//            }
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public boolean turn(){
//        if(turncounter){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public void setTurncounter(boolean val){
//        turncounter = val;
//    }
//}
