package com.bitsteam.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int loveCount = 0;
    int likeCount = 0;
    int hateCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onLoveClick(View view){
        Log.i("MainActivity","onLoveClick - Love Clicked");

        loveCount++;
        hateCount--;
        setDisplayString();

    }

    public void onLikeClick(View view){
        Log.i("MainActivity","onLikeClick - Like Clicked");
        likeCount++;
        setDisplayString();
    }

    public void onHateClick(View view){
        Log.i("MainActivity","onHateClick - Hate Clicked");
        hateCount++;
        loveCount--;
        setDisplayString();
    }

    public void setDisplayString(){
        String s = "Love is : " + loveCount + " Like is: " + likeCount + " Hate Count: " + hateCount;
        TextView t = (TextView)findViewById(R.id.result_string);
        t.setText(s);
    }
}
