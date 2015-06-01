package com.companionfree.nanodegree.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button project1;
    private Button project2;
    private Button project3;
    private Button project4;
    private Button project5;
    private Button project6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        project1 = (Button) findViewById(R.id.button_project1);
        project1.setOnClickListener(this);

        project2 = (Button) findViewById(R.id.button_project2);
        project2.setOnClickListener(this);

        project3 = (Button) findViewById(R.id.button_project3);
        project3.setOnClickListener(this);

        project4 = (Button) findViewById(R.id.button_project4);
        project4.setOnClickListener(this);

        project5 = (Button) findViewById(R.id.button_project5);
        project5.setOnClickListener(this);

        project6 = (Button) findViewById(R.id.button_project6);
        project6.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        CharSequence buttonText = ((Button)v).getText();
        String text = String.format(getString(R.string.app_click), buttonText);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
