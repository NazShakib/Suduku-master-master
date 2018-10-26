package com.example.hasan.suduku;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class CustomDialog {

    MainActivity mainActivity;
    private Activity activity;
    private String title;

    public CustomDialog(Activity activity,String title)
    {
        this.activity = activity;
        this.title = title;
    }

    public void showDialog()
    {
        mainActivity = new MainActivity();

        TextView text;
        Button restart,exit;
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.custom_dialog_layout);
        text = dialog.findViewById(R.id.textDialog);
        text.setText(title);

        restart = dialog.findViewById(R.id.restartButton);
        exit = dialog.findViewById(R.id.exitButton);


        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    dialog.dismiss();



                }
                catch (Exception e)
                {
                    Log.e("Nazmus Sakib",e.toString());
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    dialog.dismiss();
                    System.exit(0);
                }
                catch (Exception e)
                {
                    Log.e("Nazmus Sakib",e.toString());
                }
            }
        });

        dialog.show();
    }



}
