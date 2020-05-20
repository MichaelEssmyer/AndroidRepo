package com.java.michael.chesstutor;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //cmd+shift+t
    //test
    //
    //Player user = new Player("White");
    //Player opponent = new Player("Black");
    int set[];
    int pull[];
    Boolean theGame = true;
    ImageView img;
    Piece pick;
    int count = 1;
    int turn = 1;
    Button h1,h2,h3,h4,h5,h6,h7,h8;
    Button g1,g2,g3,g4,g5,g6,g7,g8;
    Button f1,f2,f3,f4,f5,f6,f7,f8;
    Button e1,e2,e3,e4,e5,e6,e7,e8;
    Button d1,d2,d3,d4,d5,d6,d7,d8;
    Button c1,c2,c3,c4,c5,c6,c7,c8;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    Button a1,a2,a3,a4,a5,a6,a7,a8;

    Piece a1P = new Piece(1, 1, "R"), a2P = new Piece(1,2,"K"), a3P= new Piece(1,3,"B"),a4P= new Piece(1,4,"Q"),a5P= new Piece(1,5,"X"),a6P= new Piece(1,6,"B"),a7P= new Piece(1,7,"K"),a8P= new Piece(1,8,"R");
    Piece b1P = new Piece(2,1,"P"),b2P = new Piece(2,2,"P"),b3P = new Piece(2,3,"P"),b4P= new Piece(2,4,"P"),b5P= new Piece(2,5,"P"),b6P= new Piece(2,6,"P"),b7P= new Piece(2,7,"P"),b8P= new Piece(2,8,"P");
    Piece c1P= new Piece(3,1,""),c2P= new Piece(3,2,""),c3P= new Piece(3,3,""),c4P= new Piece(3,4,""),c5P= new Piece(3,5,""),c6P= new Piece(3,6,""),c7P= new Piece(3,7,""),c8P= new Piece(3,8,"");
    Piece d1P= new Piece(4,1,""),d2P= new Piece(4,2,""),d3P= new Piece(4,3,""),d4P= new Piece(4,4,""),d5P= new Piece(4,5,""),d6P= new Piece(4,6,""),d7P= new Piece(4,7,""),d8P= new Piece(4,8,"");
    Piece e1P= new Piece(5,1,""),e2P= new Piece(5,2,""),e3P= new Piece(5,3,""),e4P= new Piece(5,4,""),e5P= new Piece(5,5,""),e6P= new Piece(5,6,""),e7P= new Piece(5,7,""),e8P= new Piece(5,8,"");
    Piece f1P= new Piece(6,1,""),f2P= new Piece(6,2,""),f3P= new Piece(6,3,""),f4P= new Piece(6,4,""),f5P= new Piece(6,5,""),f6P= new Piece(6,6,""),f7P= new Piece(6,7,""),f8P= new Piece(6,8,"");
    Piece g1P= new Piece(7,1,"p"),g2P= new Piece(7,2,"p"),g3P= new Piece(7,3,"p"),g4P= new Piece(7,4,"p"),g5P= new Piece(7,5,"p"),g6P= new Piece(7,6,"p"),g7P= new Piece(7,7,"p"),g8P= new Piece(7,8,"p");
    Piece h1P= new Piece(8,1,"r"),h2P= new Piece(8,2,"k"),h3P= new Piece(8,3,"b"),h4P= new Piece(8,4,"q"),h5P= new Piece(8,5,"x"),h6P= new Piece(8,6,"b"),h7P= new Piece(8,7,"k"),h8P= new Piece(8,8,"x");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setForOnView();
        //runBoard(); //start and run game
        System.out.println("Made it Start");
        initiateView();
        setText();
        listenPick();
    }

    private void setText(){
        a1.setText(a1P.getSym());
        b1.setText(b1P.getSym());
        c1.setText(c1P.getSym());
        d1.setText(d1P.getSym());
        e1.setText(e1P.getSym());
        f1.setText(f1P.getSym());
        g1.setText(g1P.getSym());
        h1.setText(h1P.getSym());
        a2.setText(a2P.getSym());
        b2.setText(b2P.getSym());
        c2.setText(c2P.getSym());
        d2.setText(d2P.getSym());
        e2.setText(e2P.getSym());
        f2.setText(f2P.getSym());
        g2.setText(g2P.getSym());
        h2.setText(h2P.getSym());
        a3.setText(a3P.getSym());
        b3.setText(b3P.getSym());
        c3.setText(c3P.getSym());
        d3.setText(d3P.getSym());
        e3.setText(e3P.getSym());
        f3.setText(f3P.getSym());
        g3.setText(g3P.getSym());
        h3.setText(h3P.getSym());
        a4.setText(a4P.getSym());
        b4.setText(b4P.getSym());
        c4.setText(c4P.getSym());
        d4.setText(d4P.getSym());
        e4.setText(e4P.getSym());
        f4.setText(f4P.getSym());
        g4.setText(g4P.getSym());
        h4.setText(h4P.getSym());
        a5.setText(a5P.getSym());
        b5.setText(b5P.getSym());
        c5.setText(c5P.getSym());
        d5.setText(d5P.getSym());
        e5.setText(e5P.getSym());
        f5.setText(f5P.getSym());
        g5.setText(g5P.getSym());
        h5.setText(h5P.getSym());
        a6.setText(a6P.getSym());
        b6.setText(b6P.getSym());
        c6.setText(c6P.getSym());
        d6.setText(d6P.getSym());
        e6.setText(e6P.getSym());
        f6.setText(f6P.getSym());
        g6.setText(g6P.getSym());
        h6.setText(h6P.getSym());
        a7.setText(a7P.getSym());
        b7.setText(b7P.getSym());
        c7.setText(c7P.getSym());
        d7.setText(d7P.getSym());
        e7.setText(e7P.getSym());
        f7.setText(f7P.getSym());
        g7.setText(g7P.getSym());
        h7.setText(h7P.getSym());
        a8.setText(a8P.getSym());
        b8.setText(b8P.getSym());
        c8.setText(c8P.getSym());
        d8.setText(d8P.getSym());
        e8.setText(e8P.getSym());
        f8.setText(f8P.getSym());
        g8.setText(g8P.getSym());
        h8.setText(h8P.getSym());
}
    @SuppressLint("WrongViewCast")
    public void initiateView(){
        a1 = findViewById(R.id.a1Button);
        a2 = findViewById(R.id.a2Button);
        a3 = findViewById(R.id.a3Button);
        a4 = findViewById(R.id.a4Button);
        a5 = findViewById(R.id.a5Button);
        a6 = findViewById(R.id.a6Button);
        a7 = findViewById(R.id.a7Button);
        a8 = findViewById(R.id.a8Button);
        b1 = findViewById(R.id.b1Button);
        b2 = findViewById(R.id.b2Button);
        b3 = findViewById(R.id.b3Button);
        b4 = findViewById(R.id.b4Button);
        b5 = findViewById(R.id.b5Button);
        b6 = findViewById(R.id.b6Button);
        b7 = findViewById(R.id.b7Button);
        b8 = findViewById(R.id.b8Button);
        c1 = findViewById(R.id.c1Button);
        c2 = findViewById(R.id.c2Button);
        c3 = findViewById(R.id.c3Button);
        c4 = findViewById(R.id.c4Button);
        c5 = findViewById(R.id.c5Button);
        c6 = findViewById(R.id.c6Button);
        c7 = findViewById(R.id.c7Button);
        c8 = findViewById(R.id.c8Button);
        d1 = findViewById(R.id.d1Button);
        d2 = findViewById(R.id.d2Button);
        d3 = findViewById(R.id.d3Button);
        d4 = findViewById(R.id.d4Button);
        d5 = findViewById(R.id.d5Button);
        d6 = findViewById(R.id.d6Button);
        d7 = findViewById(R.id.d7Button);
        d8 = findViewById(R.id.d8Button);
        e1 = findViewById(R.id.e1Button);
        e2 = findViewById(R.id.e2Button);
        e3 = findViewById(R.id.e3Button);
        e4 = findViewById(R.id.e4Button);
        e5 = findViewById(R.id.e5Button);
        e6 = findViewById(R.id.e6Button);
        e7 = findViewById(R.id.e7Button);
        e8 = findViewById(R.id.e8Button);
        f1 = findViewById(R.id.f1Button);
        f2 = findViewById(R.id.f2Button);
        f3 = findViewById(R.id.f3Button);
        f4 = findViewById(R.id.f4Button);
        f5 = findViewById(R.id.f5Button);
        f6 = findViewById(R.id.f6Button);
        f7 = findViewById(R.id.f7Button);
        f8 = findViewById(R.id.f8Button);
        g1 = findViewById(R.id.g1Button);
        g2 = findViewById(R.id.g2Button);
        g3 = findViewById(R.id.g3Button);
        g4 = findViewById(R.id.g4Button);
        g5 = findViewById(R.id.g5Button);
        g6 = findViewById(R.id.g6Button);
        g7 = findViewById(R.id.g7Button);
        g8 = findViewById(R.id.g8Button);
        h1 = findViewById(R.id.h1Button);
        h2 = findViewById(R.id.h2Button);
        h3 = findViewById(R.id.h3Button);
        h4 = findViewById(R.id.h4Button);
        h5 = findViewById(R.id.h5Button);
        h6 = findViewById(R.id.h6Button);
        h7 = findViewById(R.id.h7Button);
        h8 = findViewById(R.id.h8Button);
    }
    private void select_pick(Piece Pick){
        System.out.println("Made it to Select Pick");
        if (PickValid(Pick)){
            pick.setSym(Pick.getSym());
            pick.setRow(Pick.getRow());
            pick.setCol(Pick.getCol());
            count = 2;
            Pick.setSym("");
            System.out.println("Pick Selected" + count);
        }
    }
    private void place_pick(Piece Place){
        System.out.println("Made it to Select Place");
        if (PlaceValid(Place)) {
            Place.setSym(pick.getSym());
            count = 1;
            pick.setSym("");
            System.out.println("Place picked" + count);
        }
    }
    private boolean PickValid(Piece Pick){
        System.out.println("Checking Pick");
        return !Pick.getSym().equals("");
    }
    private boolean PlaceValid(Piece Place) {
        System.out.println("Checking Place");
            if(turn == 1){
                switch (pick.getSym()) {
                    case "K":  //check knight movement
                        System.out.println("Piece was knight");
                        turn =2;
                        return moveKnight(Place);
                    case "Q":  //check pawn movement
                        System.out.println("Piece was queen");
                        turn =2;
                        return moveQueen(Place);
                    case "B":  //check pawn movement
                        System.out.println("Piece was bishop");
                        turn =2;
                        return moveBishop(Place);
                    case "X":  //check king movement
                        System.out.println("Piece was king");
                        turn =2;
                        return moveKing(Place);
                    case "R":  //check pawn movement
                        System.out.println("Piece was rook");
                        turn =2;
                        return moveRook(Place);
                    default:
                        System.out.println("Piece was wrong"+pick.getSym());
                        return false;
                }
            }
            if(turn == 2){
                switch (pick.getSym()) {
                    case "P":  //check pawn movement
                        System.out.println("Piece was pawn");
                        turn =1;
                        return movePawn(Place);
                    case "p":  //check pawn movement
                        System.out.println("Piece was pawn");
                        turn =1;
                        return movePawn(Place);
                    case "x":  //check king movement
                        System.out.println("Piece was king");
                        turn =1;
                        return moveKing(Place);
                    case "k":  //check knight movement
                        System.out.println("Piece was knight");
                        turn =1;
                        return moveKnight(Place);
                    case "q":  //check pawn movement
                        System.out.println("Piece was queen");
                        turn =1;
                        return moveQueen(Place);
                    case "b":  //check pawn movement
                        System.out.println("Piece was bishop");
                        turn =1;
                        return moveBishop(Place);
                    case "r":  //check pawn movement
                        System.out.println("Piece was rook");
                        turn =1;
                        return moveRook(Place);
                    default:
                        System.out.println("Piece was wrong"+pick.getSym());
                        return false;
            }}
            else {
                System.out.println("Piece was incorrect " + pick.getSym());
                return false;
            }
    }
    private boolean moveQueen(Piece place){
        if (moveBishop(place) || moveRook(place)){
            return true;
        }
        else
            return false;
    }
    private boolean moveKnight(Piece place){
        if(pick.getCol()+1 == place.getCol() && pick.getRow()+2 == place.getRow()){ return true;}
        else if(pick.getCol()-1 == place.getCol() && pick.getRow()+2 == place.getRow()){ return true;}
        else if(pick.getCol()-1 == place.getCol() && pick.getRow()-2 == place.getRow()){ return true;}
        else if(pick.getCol()+1 == place.getCol() && pick.getRow()-2 == place.getRow()){ return true;}
        else if(pick.getCol()+2 == place.getCol() && pick.getRow()+1 == place.getRow()){ return true;}
        else if(pick.getCol()-2 == place.getCol() && pick.getRow()+1 == place.getRow()){ return true;}
        else if(pick.getCol()-2 == place.getCol() && pick.getRow()-1 == place.getRow()){ return true;}
        else if(pick.getCol()+2 == place.getCol() && pick.getRow()-1 == place.getRow()){ return true;}
        else return false;
    }
    private boolean moveBishop(Piece place){
        if((pick.getCol()+1 == place.getCol() && pick.getRow()+1 == place.getCol())||(pick.getCol()-1 == place.getCol() && pick.getRow()-1 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+1 == place.getCol() && pick.getRow()-1 == place.getCol())||(pick.getCol()-1 == place.getCol() && pick.getRow()+1 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+2 == place.getCol() && pick.getRow()+2 == place.getCol())||(pick.getCol()-2 == place.getCol() && pick.getRow()-2 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+2 == place.getCol() && pick.getRow()-2 == place.getCol())||(pick.getCol()-2 == place.getCol() && pick.getRow()+2 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+3 == place.getCol() && pick.getRow()+3 == place.getCol())||(pick.getCol()-3 == place.getCol() && pick.getRow()-3 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+3 == place.getCol() && pick.getRow()-3 == place.getCol())||(pick.getCol()-3 == place.getCol() && pick.getRow()+3 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+4 == place.getCol() && pick.getRow()+4 == place.getCol())||(pick.getCol()-4 == place.getCol() && pick.getRow()-4 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+4 == place.getCol() && pick.getRow()-4 == place.getCol())||(pick.getCol()-4 == place.getCol() && pick.getRow()+4 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+5 == place.getCol() && pick.getRow()+5 == place.getCol())||(pick.getCol()-5 == place.getCol() && pick.getRow()-5 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+5 == place.getCol() && pick.getRow()-5 == place.getCol())||(pick.getCol()-5 == place.getCol() && pick.getRow()+5 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+6 == place.getCol() && pick.getRow()+6 == place.getCol())||(pick.getCol()-6 == place.getCol() && pick.getRow()-6 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+6 == place.getCol() && pick.getRow()-6 == place.getCol())||(pick.getCol()-6 == place.getCol() && pick.getRow()+6 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+7 == place.getCol() && pick.getRow()+7 == place.getCol())||(pick.getCol()-7 == place.getCol() && pick.getRow()-7 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+7 == place.getCol() && pick.getRow()-7 == place.getCol())||(pick.getCol()-7 == place.getCol() && pick.getRow()+7 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+8 == place.getCol() && pick.getRow()+8 == place.getCol())||(pick.getCol()-8 == place.getCol() && pick.getRow()-8 == place.getCol())){
            return true;
        }
        else if((pick.getCol()+8 == place.getCol() && pick.getRow()-8 == place.getCol())||(pick.getCol()-8 == place.getCol() && pick.getRow()+8 == place.getCol())){
            return true;
        }
        else
            return false;
    }
    private boolean moveKing(Piece place){
        if((pick.getCol()+1 == place.getCol() && pick.getRow() == place.getRow())||(pick.getCol()-1 == place.getCol() && pick.getRow() == place.getRow())){
            return true;
        }
        else if((pick.getCol() == place.getCol() && pick.getRow()+1 == place.getRow())||(pick.getCol() == place.getCol() && pick.getRow()-1 == place.getRow())){
            return true;
        }
        else if((pick.getCol()+1 == place.getCol() && pick.getRow()+1 == place.getRow())||(pick.getCol()-1 == place.getCol() && pick.getRow()-1 == place.getRow())){
            return true;
        }
        else if((pick.getCol()+1 == place.getCol() && pick.getRow()-1 == place.getRow())||(pick.getCol()-1 == place.getCol() && pick.getRow()+1 == place.getRow())){
            return true;
        }
        else
            return false;
    }
    private boolean moveRook(Piece place){
        if (pick.getCol() == place .getCol() || pick.getRow() == place.getRow()){
            return true;
        }
        else
            return false;
    }
    private boolean movePawn(Piece place){
        //move pawn forward
        if (pick.getCol() == place.getCol() && pick.getRow()+1 == place.getRow() && place.getSym().equals("")){
            System.out.println("Moved Pawn Forward");
            return true;
        }
        //attack with pawn
        else if ((pick.getCol() + 1 == place.getCol() || pick.getCol() - 1 == place.getCol()) && (pick.getRow() == place.getRow() && !place.getSym().equals(""))){
            System.out.println("Attacked with Pawn");
            return true;
        }
        else
            return false;
    }
    private void listenPick() {
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a1P);
                listenPlace();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a2P);
                listenPlace();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a3P);
                listenPlace();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a4P);
                listenPlace();
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a5P);
                listenPlace();
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a6P);
                listenPlace();
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a7P);
                listenPlace();
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(a8P);
                listenPlace();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b1P);
                listenPlace();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b2P);
                listenPlace();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b3P);
                listenPlace();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b4P);
                listenPlace();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b5P);
                listenPlace();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b6P);
                listenPlace();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b7P);
                listenPlace();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(b8P);
                listenPlace();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c1P);
                listenPlace();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c2P);
                listenPlace();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c3P);
                listenPlace();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c4P);
                listenPlace();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c5P);
                listenPlace();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c6P);
                listenPlace();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c7P);
                listenPlace();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(c8P);
                listenPlace();
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d1P);
                listenPlace();
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d2P);
                listenPlace();
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d3P);
                listenPlace();
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d4P);
                listenPlace();
            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d5P);
                listenPlace();
            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d6P);
                listenPlace();
            }
        });
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d7P);
                listenPlace();
            }
        });
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(d8P);
                listenPlace();
            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e1P);
                listenPlace();
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e2P);
                listenPlace();
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e3P);
                listenPlace();
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e4P);
                listenPlace();
            }
        });
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e5P);
                listenPlace();
            }
        });
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e6P);
                listenPlace();
            }
        });
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e7P);
                listenPlace();
            }
        });
        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(e8P);
                listenPlace();
            }
        });
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f1P);
                listenPlace();
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f2P);
                listenPlace();
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f3P);
                listenPlace();
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f4P);
                listenPlace();
            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f5P);
                listenPlace();
            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f6P);
                listenPlace();
            }
        });
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f7P);
                listenPlace();
            }
        });
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(f8P);
                listenPlace();
            }
        });
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g1P);
                listenPlace();
            }
        });
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g2P);
                listenPlace();
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g3P);
                listenPlace();
            }
        });
        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g4P);
                listenPlace();
            }
        });
        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g5P);
                listenPlace();
            }
        });
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g6P);
                listenPlace();
            }
        });
        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g7P);
                listenPlace();
            }
        });
        g8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(g8P);
                listenPlace();
            }
        });
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h1P);
                listenPlace();
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h2P);
                listenPlace();
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h3P);
                listenPlace();
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h4P);
                listenPlace();
            }
        });
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h5P);
                listenPlace();
            }
        });
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h6P);
                listenPlace();
            }
        });
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h7P);
                listenPlace();
            }
        });
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_pick(h8P);
                listenPlace();
            }
        });
    }
    private void listenPlace() {
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a1P);
                setText();
                listenPick();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a2P);
                setText();
                listenPick();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a3P);
                setText();
                listenPick();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a4P);
                setText();
                listenPick();
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a5P);
                setText();
                listenPick();
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a6P);
                setText();
                listenPick();
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a7P);
                setText();
                listenPick();
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(a8P);
                setText();
                listenPick();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b1P);
                setText();
                listenPick();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b2P);
                setText();
                listenPick();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b3P);
                setText();
                listenPick();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b4P);
                setText();
                listenPick();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b5P);
                setText();
                listenPick();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b6P);
                setText();
                listenPick();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b7P);
                setText();
                listenPick();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(b8P);
                setText();
                listenPick();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c1P);
                setText();
                listenPick();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c2P);
                setText();
                listenPick();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c3P);
                setText();
                listenPick();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c4P);
                setText();
                listenPick();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c5P);
                setText();
                listenPick();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c6P);
                setText();
                listenPick();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c7P);
                setText();
                listenPick();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(c8P);
                setText();
                listenPick();
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d1P);
                setText();
                listenPick();
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d2P);
                setText();
                listenPick();
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d3P);
                setText();
                listenPick();
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d4P);
                setText();
                listenPick();
            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d5P);
                setText();
                listenPick();
            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d6P);
                setText();
                listenPick();
            }
        });
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d7P);
                setText();
                listenPick();
            }
        });
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(d8P);
                setText();
                listenPick();
            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e1P);
                setText();
                listenPick();
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e2P);
                setText();
                listenPick();
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e3P);
                setText();
                listenPick();
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e4P);
                setText();
                listenPick();
            }
        });
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e5P);
                setText();
                listenPick();
            }
        });
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e6P);
                setText();
                listenPick();
            }
        });
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e7P);
                setText();
                listenPick();
            }
        });
        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(e8P);
                setText();
                listenPick();
            }
        });
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f1P);
                setText();
                listenPick();
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f2P);
                setText();
                listenPick();
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f3P);
                setText();
                listenPick();
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f4P);
                setText();
                listenPick();
            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f5P);
                setText();
                listenPick();
            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f6P);
                setText();
                listenPick();
            }
        });
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f7P);
                setText();
                listenPick();
            }
        });
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(f8P);
                setText();
                listenPick();
            }
        });
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g1P);
                setText();
                listenPick();
            }
        });
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g2P);
                setText();
                listenPick();
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g3P);
                setText();
                listenPick();
            }
        });
        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g4P);
                setText();
                listenPick();
            }
        });
        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g5P);
                setText();
                listenPick();
            }
        });
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g6P);
                setText();
                listenPick();
            }
        });
        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g7P);
                setText();
                listenPick();
            }
        });
        g8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(g8P);
                setText();
                listenPick();
            }
        });
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h1P);
                setText();
                listenPick();
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h2P);
                setText();
                listenPick();
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h3P);
                setText();
                listenPick();
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h4P);
                setText();
                listenPick();
            }
        });
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h5P);
                setText();
                listenPick();
            }
        });
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h6P);
                setText();
                listenPick();
            }
        });
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h7P);
                setText();
                listenPick();
            }
        });
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place_pick(h8P);
                setText();
                listenPick();
            }
        });
    }
}