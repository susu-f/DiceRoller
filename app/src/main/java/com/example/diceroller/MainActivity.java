package com.example.diceroller;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    int win = 0;
    public void on_butoon_click(View view){

        TextView tv = this.findViewById(R.id.numberTextView);



        Random r = new Random();
        int number = r.nextInt(6 ) ;

        if(number == 0){

            number = 6;

        }

        tv.setText(Integer.toString(number));

        EditText tv1 = this.findViewById(R.id.editText);
        int tv2 = R.id.editText;
        EditText x = (EditText) findViewById(R.id.editText);
        int n = Integer.parseInt(x.getText().toString());
        int clickcount=0;


        if(number == n){

            tv.setText("Congratulations!");
            win++;

        }

        else{

            tv.setText(Integer.toString(number));

        }

        TextView tv4 = this.findViewById(R.id.textView4);
        String win1 = String.valueOf(win);
        tv4.setText(win1);



    }
    public void on_butoon_click1(View view){


        TextView tv = this.findViewById(R.id.numberTextView);

        Random r = new Random();
        int number = r.nextInt(6 ) ;

        if(number == 0){

            tv.setText("If you could go anywhere in the world, where would you go?\n");

        }

        else if(number == 1){

            tv.setText("If you were stranded on a desert island, what three things would you want to take with you?\n");

        }

        else if(number == 2){

            tv.setText("If you could eat only one food for the rest of your life, what would that be?");

        }

        else if(number == 3){

            tv.setText("If you won a million dollars, what is the first thing you would buy?\n");

        }

        else if(number == 4){

            tv.setText("If you could spaned the day with one fictional character, who would it be?");

        }

        else if(number == 5){

            tv.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?\n");

        }




    }

    public void go_next_activity (View v){
        startActivity(new Intent(MainActivity.this, NewActivity.class));
    }

    public void share_activity (View v){
        startActivity(new Intent(MainActivity.this, ShareActivty.class));
    }



}

