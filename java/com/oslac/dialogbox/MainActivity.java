package com.oslac.dialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
    int selection;
   Button button;
   ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        constraintLayout = findViewById(R.id.c);
        String [] items ={"Hello" ,"Hi" , "Ok" , "Bye"};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("Alert Box")
//                        .setMessage("This is an alert Box")
//                        .setNeutralButton("Cancel",null)
//                        .setPositiveButton("Accept", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                     startActivity(new Intent(MainActivity.this,MainActivity2.class));
//                            }
//                        })
//                        .create();
//                   alertDialog.show();
//                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("Simple Box")
//                        .setItems(items, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                if(which == 2)
//                                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
//                            }
//                        }).create();
//                alertDialog.show();
//                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("Confirmation Box")
//                        .setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                 selection = which;
//                            }
//                        })
//                        .setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                if(selection==3)
//                                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
//                            }
//                        }).create();
//                alertDialog.show();

//                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this,R.style.myStyle)
//                        .setView(R.layout.fullScreenDialog)
//                        .setPositiveButton("Got it", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                            }
//                        })
//                        .create();
//                alertDialog.show();



            }
        });

    }
}