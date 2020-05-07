package com.example.alert_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Btn_alert, Btn_custm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_alert = (Button) findViewById(R.id.Btn_alertDialog);
        Btn_custm = (Button) findViewById(R.id.Btn_dialog);


       Btn_custm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog d = new Dialog(MainActivity.this);
                d.setCancelable(true);
                d.setContentView(R.layout.activity_main);
                d.show();
            }
        });

             Btn_alert.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                     builder.setMessage("Are you sure  you want to exit");
                    // yaha s single line consider hu raha ha code
                     builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                         //yeh humne positive button bana liya or uskay parameter me char or new kar k onclicklistner banaya ha
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             MainActivity.this.finish(); //activity ko close krne ka code
                         } //yeh humne negative button bana liya or uskay parameter me char or new kar k onclicklistner banaya ha
                     }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             dialog.cancel(); // dialogbox ko cancel karne k liye use huta ha!!!
                         }
                     });
                     //yaha tk !!!!

                     AlertDialog alert = builder.create(); //builder ko create krne k liye use huta ha builder.create()
                     alert.show(); //screen p show krne k liye use huta h!!!!

                 }
             });
    }
}
