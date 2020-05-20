package com.java.michael.umpirebuddyversion20;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Edit Box: Ball, Strike, Out
    TextView EB, ES, EO;
    // Button
    Button BB, BS;
    //counters
    int bcount=0, scount=0, ocount =0;
    //Dialog Context View
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences myPrefs = getSharedPreferences("The Preference", MODE_PRIVATE);
        int save = myPrefs.getInt("SaveState", 0);
        ocount = save;

        //Button instances
        BB = (Button) findViewById(R.id.bButton);
        BS = (Button) findViewById(R.id.sButton);

        //define edittexts
        EB = (TextView) findViewById(R.id.bText);
        ES = (TextView) findViewById(R.id.sText);
        EO = (TextView) findViewById(R.id.oText);
        EB.setText( "Ball: " + bcount);
        ES.setText( "Strike: " + scount);
        EO.setText( "Outs: " + ocount);
        //define buttons actions
        BB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                bcount++;
                EB.setText( "Ball: " + bcount);
                if (bcount ==4){
                    //Alert Dialog Box
                    AlertDialog.Builder myDialogBuilder = new AlertDialog.Builder(context);
                    myDialogBuilder.setTitle("You walked!");
                    myDialogBuilder
                            .setMessage("Four Balls!")
                            .setCancelable(false)
                            .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int id) {
                                    dialogInterface.cancel();
                                    //Reset
                                    bcount = 0;
                                    scount = 0;
                                    EB.setText( "Ball: " + bcount);
                                    ES.setText( "Strike: " + scount);
                                }
                            });
                    AlertDialog alertDialog = myDialogBuilder.create();
                    alertDialog.show();
                }
            }
        });
        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scount++;
                ES.setText("Strike: " + scount);
                if (scount == 3) {
                    ocount++;
                    SharedPreferences.Editor myEdit = getSharedPreferences("The Preference", MODE_PRIVATE).edit();
                    myEdit.putInt("SaveState", ocount);
                    myEdit.apply();
                    //Alert Dialog Box
                    AlertDialog.Builder myDialogBuilder = new AlertDialog.Builder(context);
                    myDialogBuilder.setTitle("You struck out!");
                    myDialogBuilder
                            .setMessage("Three Strikes!")
                            .setCancelable(false)
                            .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int id) {
                                    dialogInterface.cancel();
                                    //Reset
                                    bcount = 0;
                                    scount = 0;

                                    EB.setText("Ball: " + bcount);
                                    ES.setText("Strike: " + scount);
                                    EO.setText("Total Outs: " + ocount);
                                }
                            });
                    AlertDialog alertDialog = myDialogBuilder.create();
                    alertDialog.show();


                }
            }
        });
    }
    //add
    //Menu
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.main_menu, menu);
       return true;
   }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.reset_id) {
            bcount = 0;
            scount = 0;
            ocount = 0;
            EB.setText("Ball: " + bcount);
            ES.setText("Strike: " + scount);
            EO.setText("Total Outs: " + ocount);
            SharedPreferences.Editor myEdit = getSharedPreferences("The Preference", MODE_PRIVATE).edit();
            myEdit.putInt("SaveState", ocount);
            myEdit.apply();
            return true;
        }
        if (id == R.id.about_id) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}