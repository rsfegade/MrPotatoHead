package com.mrpotatohead.rohit.mrpotatohead;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
    private ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9,im10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox) findViewById(R.id.hat);
        im1 = (ImageView) findViewById(R.id.im_hat);
        cb2 = (CheckBox) findViewById(R.id.mouth);
        im2 = (ImageView) findViewById(R.id.im_mouth);
        cb3 = (CheckBox) findViewById(R.id.shoes);
        im3 = (ImageView) findViewById(R.id.im_shoes);
        cb4 = (CheckBox) findViewById(R.id.nose);
        im4 = (ImageView) findViewById(R.id.im_nose);
        cb5 = (CheckBox) findViewById(R.id.moustache);
        im5 = (ImageView) findViewById(R.id.im_moustache);
        cb6 = (CheckBox) findViewById(R.id.glasses);
        im6 = (ImageView) findViewById(R.id.im_glasses);
        cb7 = (CheckBox) findViewById(R.id.eyes);
        im7 = (ImageView) findViewById(R.id.im_eyes);
        cb8 = (CheckBox) findViewById(R.id.eyebrows);
        im8 = (ImageView) findViewById(R.id.im_eyebrows);
        cb9 = (CheckBox) findViewById(R.id.ears);
        im9 = (ImageView) findViewById(R.id.im_ears);
        cb10 = (CheckBox) findViewById(R.id.arms);
        im10 = (ImageView) findViewById(R.id.im_arms);
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

    public void hat(View view) {

        if(cb1.isChecked())
        {
            im1 .setVisibility(View.VISIBLE);
        }
        else
            im1 .setVisibility(View.INVISIBLE);
    }

    public void mouth(View view) {

        if(cb2.isChecked())
        {
            im2 .setVisibility(View.VISIBLE);
        }
        else
            im2 .setVisibility(View.INVISIBLE);
    }

    public void shoes(View view) {

        if(cb3.isChecked())
        {
            im3 .setVisibility(View.VISIBLE);
        }
        else
            im3 .setVisibility(View.INVISIBLE);
    }

    public void nose(View view) {

        if(cb4.isChecked())
        {
            im4 .setVisibility(View.VISIBLE);
        }
        else
            im4 .setVisibility(View.INVISIBLE);
    }

    public void moustache(View view) {

        if(cb5.isChecked())
        {
            im5 .setVisibility(View.VISIBLE);
        }
        else
            im5 .setVisibility(View.INVISIBLE);
    }

    public void glasses(View view) {

        if(cb6.isChecked())
        {
            im6 .setVisibility(View.VISIBLE);
        }
        else
            im6 .setVisibility(View.INVISIBLE);
    }

    public void eyes(View view) {

        if(cb7.isChecked())
        {
            im7 .setVisibility(View.VISIBLE);
        }
        else
            im7 .setVisibility(View.INVISIBLE);
    }

    public void eyebrows(View view) {

        if(cb8.isChecked())
        {
            im8 .setVisibility(View.VISIBLE);
        }
        else
            im8 .setVisibility(View.INVISIBLE);
    }

    public void ears(View view) {

        if(cb9.isChecked())
        {
            im9 .setVisibility(View.VISIBLE);
        }
        else
            im9 .setVisibility(View.INVISIBLE);
    }

    public void arms(View view) {

        if(cb10.isChecked())
        {
            im10 .setVisibility(View.VISIBLE);
        }
        else
            im10 .setVisibility(View.INVISIBLE);
    }
}
