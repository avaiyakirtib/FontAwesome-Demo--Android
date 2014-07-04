package com.example.fontawesome_android;

import java.util.Hashtable;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView txt = (TextView) findViewById(R.id.textView1);  
        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome_webfont.ttf");
        txt.setTypeface(font);
        
        TextView txt2 = (TextView) findViewById(R.id.textView2);  
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fontawesome_webfont.ttf");
        txt2.setTypeface(font2);
        
        TextView txt3 = (TextView) findViewById(R.id.textView3);  
        Typeface font3 = Typeface.createFromAsset(getAssets(), "fontawesome_webfont.ttf");
        txt3.setTypeface(font3);
        
        TextView txt4 = (TextView) findViewById(R.id.textView4);  
        Typeface font4 = Typeface.createFromAsset(getAssets(), "fontawesome_webfont.ttf");
        txt4.setTypeface(font4);
        
        TextView txt5 = (TextView) findViewById(R.id.textView5);  
        Typeface font5 = Typeface.createFromAsset(getAssets(), "fontawesome_webfont.ttf");
        txt5.setTypeface(font5);
        
        TextView txt6 = (TextView) findViewById(R.id.textView6);  
        Typeface font6 = Typeface.createFromAsset(getAssets(), "fontawesome_webfont.ttf");
        txt6.setTypeface(font6);
        
        
    }

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
