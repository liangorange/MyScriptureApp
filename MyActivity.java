package com.example.johnnyliang.myscriptureapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MyActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "Enter something here";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void displayDetail(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText bookDetail = (EditText) findViewById(R.id.editBook);
        EditText chapterDetail = (EditText) findViewById(R.id.editChapter);
        EditText verseDetail = (EditText) findViewById(R.id.editVerse);
        String chapterString = chapterDetail.getText().toString();
        String verseString = verseDetail.getText().toString();
        String bookString = bookDetail.getText().toString();
        String message = "Your favorite scripture is: " + bookString + " " + chapterString + ": " + verseString;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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
}
