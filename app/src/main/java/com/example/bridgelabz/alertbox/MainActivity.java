package com.example.bridgelabz.alertbox;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton= (Button) findViewById(R.id.button_popup);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             final   AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);

           alert.setTitle("Confirm");
                alert.setMessage("Do you want to really exit the application ");
                alert.setCancelable(false);

                alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(MainActivity.this,"I am positive button", Toast.LENGTH_SHORT).show();

                    }
                });

                alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "I am negative Button button", Toast.LENGTH_SHORT).show();
                    }
                });

                alert.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"I am Neutral button",Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();

            }
        });
    }
}
