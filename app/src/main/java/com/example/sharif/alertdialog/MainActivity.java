package com.example.sharif.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog alertDialog;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Discard draft?");
        builder.setPositiveButton("Discard", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(),"Discarded",Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog = builder.create();
        alertDialog.show();
//        alertDialog.getButton(android.app.AlertDialog.)
    }
}
