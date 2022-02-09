package com.busrayilmaz.storingdata;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;
    int storedAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
public void save(View view) {
    AlertDialog.Builder alert = new AlertDialog.Builder(this);

    alert.setTitle("Save");
    alert.setMessage("Are you sure? ");
    alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            //save
            Toast.makeText(MainActivity.this, "Saved",Toast.LENGTH_LONG).show();
        }
    });
    alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(MainActivity.this,"Not saved",Toast.LENGTH_SHORT).show();
        }
    });
    alert.show();
}

}


